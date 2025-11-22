package backend;
import services.UserService;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
public class JsonDataBaseManager {
    private static List<User> users = new ArrayList<>();
    private static List<String> userIDs = new ArrayList<>();
    private static List<Course> courses = new ArrayList<>();
    private static List<String> coursIDs = new ArrayList<>();
    private static final String USERJSON_PATH = "users.json";
    private static final String COURSEJSON_PATH = "courses.json";
    
    private static Gson getGSON(){
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder = gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson;
    }
   
    private static void readUsers(){
        Gson gson = getGSON();
        users = new ArrayList<>();
        String json = "";
        try (Scanner fscanner = new Scanner(new File(USERJSON_PATH))) {
            while (fscanner.hasNextLine()) {
                json += fscanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found!");
            return;
        }
        JsonElement jelement;
        JsonArray jarray;
        try{
            jelement = JsonParser.parseString(json);
            jarray = jelement.getAsJsonArray();
        }
        catch(java.lang.IllegalStateException e){
            return; 
        }
        for(int i = 0; i < jarray.size(); i++){
            JsonObject jobj = jarray.get(i).getAsJsonObject();
            String role = jobj.get("role").getAsString();
            User curr;
            if(role.equals(UserService.StudentRole)){
                curr = gson.fromJson(jobj, Student.class);
            }
            else if(role.equals(UserService.InstructorRole)){
                curr = gson.fromJson(jobj, Instructor.class);
            }
            else if(role.equals(UserService.AdminRole)){
                curr = gson.fromJson(jobj, Admin.class);
            }
            else
                curr = null;
            users.add(curr);
            userIDs.add(curr.getUserId());
        }
    }
   
    private static void readCourses(){
        Gson gson = getGSON();
        String json = "";
        courses = new ArrayList<>();
        try (Scanner fscanner = new Scanner(new File(COURSEJSON_PATH))) {
            while (fscanner.hasNextLine()) {
                json += fscanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found!");
            return;
        }
        Course[] courseArray = gson.fromJson(json, Course[].class);
        if (courseArray != null){
            courses = new ArrayList<>(Arrays.asList(courseArray));
            for (Course c : courses) {
                int index = userIDs.indexOf(c.getInstructorId());
                Instructor curr = (Instructor) users.get(index);
                curr.addCourse(c);
            }
        }
    }
   
    private static void loadFiles(){
        readUsers();
        readCourses();
    }
    
    private static void saveCourses(){
        Gson gson = getGSON();
        String json = gson.toJson(courses);
        System.out.println(json);
        try (FileWriter fwriter = new FileWriter(COURSEJSON_PATH)) {
            fwriter.write(json);
        } catch (IOException e) {
            System.out.println("IO exception found!");
        }
    }
   
    private static void saveUsers(){
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder = gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        String json = gson.toJson(users);
        System.out.println(json);
        
        try (FileWriter fwriter = new FileWriter(USERJSON_PATH)) {
            fwriter.write(json);
        } catch (IOException e) {
            System.out.println("IO exception found!");
        }
    }
    
    public static void addUser(User u){
        if(users.isEmpty()){
            loadFiles();
        }
        users.add(u);
        saveUsers();
    }
 
    public static void addCourse(Course c){
        if(courses.isEmpty())
            readCourses();
        courses.add(c);
        saveCourses();

    }
    
    public static void updateUser(User u){
        if(users.isEmpty()){
            loadFiles();
        }
        String UID = u.getUserId();
        for(int i = 0; i < users.size(); i++){
            if(users.get(i).getUserId().equals(UID)){
                users.set(i, u);       
                saveUsers();
                return;
            }
        }
        saveUsers();
        
    }
  
    public static void updateCourse(Course c){
        if(courses.isEmpty())
            readCourses();
        String CID = c.getId();
        for(int i = 0; i < courses.size(); i++){
            if(courses.get(i).getId().equals(CID)){
                courses.set(i, c);
                saveCourses();
                return;
            }
        }
        saveCourses();

    }
    public static void updateCourses(){
        saveCourses();
    }
   
    public static void removeUser(User u){
        if(users.isEmpty())
            loadFiles();
        users.remove(u);
        saveUsers();
    }
  
    public static void removeCourse(Course c){
        if(courses.isEmpty())
            readCourses();
        courses.remove(c);
        saveCourses();
    }
   
    public static List<User> getUsers(){
        if (users.size() == 0)
            loadFiles();
        return users;
    }
 
    public static List<Course> getCourses(){
        if (courses.isEmpty())
            readCourses();
        return courses;
    }
    
    public static void deleteCourse(String courseId) {
        if (courses.isEmpty())
            readCourses();
        courses.removeIf(c -> c.getId().equals(courseId));
        saveCourses();
    }
}   