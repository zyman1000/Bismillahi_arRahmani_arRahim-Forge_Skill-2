package Student_Managment;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import User_Account_Management.StudentDashboard;
import User_Account_Management.welcome;
import javax.swing.JFrame;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import javax.swing.table.DefaultTableModel;
import backend.*;
public class Browse_Courses extends javax.swing.JPanel {
    private Student student;
    private StudentService studentservice;
    Course course = null;
    private JFrame frame;

    public Browse_Courses(Student student) {
        this.student = student;
        studentservice = new StudentService();
        
        initComponents();
        loadStudentCourses();
    }

    @Override
    public void setVisible(boolean f) {
        if (f) {
            frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.getContentPane().add(this);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }
    }
      ///////////////////////////////////////////////////////////  
      //1- LOAD IN TABELE FROM FILES AS NEEDED NOT ALL 
      //2-handle enroll when push button
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jDialog3 = new javax.swing.JDialog();
        jDialog4 = new javax.swing.JDialog();
        jSeparator1 = new javax.swing.JSeparator();
        jDialog5 = new javax.swing.JDialog();
        jDialog6 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        updateButton = new javax.swing.JButton();
        EDIT_TABLE = new javax.swing.JScrollPane();
        edittable = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog4Layout = new javax.swing.GroupLayout(jDialog4.getContentPane());
        jDialog4.getContentPane().setLayout(jDialog4Layout);
        jDialog4Layout.setHorizontalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog4Layout.setVerticalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog5Layout = new javax.swing.GroupLayout(jDialog5.getContentPane());
        jDialog5.getContentPane().setLayout(jDialog5Layout);
        jDialog5Layout.setHorizontalGroup(
            jDialog5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog5Layout.setVerticalGroup(
            jDialog5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog6Layout = new javax.swing.GroupLayout(jDialog6.getContentPane());
        jDialog6.getContentPane().setLayout(jDialog6Layout);
        jDialog6Layout.setHorizontalGroup(
            jDialog6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog6Layout.setVerticalGroup(
            jDialog6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setToolTipText("ADD STUDENT");

        updateButton.setBackground(new java.awt.Color(102, 102, 102));
        updateButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("ENROLL");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        edittable.setAutoCreateRowSorter(true);
        edittable.setBackground(new java.awt.Color(102, 102, 102));
        edittable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        edittable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        edittable.setForeground(new java.awt.Color(255, 255, 255));
        edittable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"10000", "MATH", "EXCELLENT BRAIN"},
                {null, null, null}
            },
            new String [] {
                "ID", "TITLE", "Describtion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        edittable.setToolTipText("MMM");
        edittable.setFillsViewportHeight(true);
        edittable.setGridColor(new java.awt.Color(255, 255, 255));
        edittable.setShowGrid(true);
        edittable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                edittableAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        edittable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edittableMouseClicked(evt);
            }
        });
        edittable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edittableKeyPressed(evt);
            }
        });
        EDIT_TABLE.setViewportView(edittable);
        if (edittable.getColumnModel().getColumnCount() > 0) {
            edittable.getColumnModel().getColumn(0).setPreferredWidth(1);
            edittable.getColumnModel().getColumn(1).setPreferredWidth(50);
            edittable.getColumnModel().getColumn(2).setResizable(false);
            edittable.getColumnModel().getColumn(2).setPreferredWidth(500);
        }

        jLabel11.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        jLabel11.setText("Avaliable courses");

        jButton5.setBackground(new java.awt.Color(102, 102, 102));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("LOGOUT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(102, 102, 102));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("BACK");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EDIT_TABLE, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(204, 204, 204))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EDIT_TABLE, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        getSelectedCourse();
        if(course == null)
            return;
        Course seccourse = studentservice.getCourseById(student, course.getId());
        if(seccourse != null)
            javax.swing.JOptionPane.showMessageDialog(null, "You are already enrolled in this course!");
        else
        {
            studentservice.studentEnrollment(student, course.getId());
             javax.swing.JOptionPane.showMessageDialog(null, "Enrolled Successfully!");
        }
    }//GEN-LAST:event_updateButtonActionPerformed


    private void edittableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_edittableAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_edittableAncestorAdded

    private void edittableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edittableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_edittableMouseClicked

    private void edittableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edittableKeyPressed

    }//GEN-LAST:event_edittableKeyPressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new welcome().setVisible(true);
        frame.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new StudentDashboard(student).setVisible(true);
        frame.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

private void loadStudentCourses() {
    DefaultTableModel model = (DefaultTableModel) edittable.getModel();
    model.setRowCount(0); // Clear table first
    
    

    List<Course> courses = studentservice.getAllAvailableCourses();

    for (Course c : courses) {
       System.out.print(c.getId());
        model.addRow(new Object[]{
            

            c.getId(),          
            c.getTitle(),       
            c.getDescription()  
        });
    }
}  
    
    
    
    
    
    
    



private Course getSelectedCourse() {
    int selectedRow = edittable.getSelectedRow();

    if (selectedRow == -1) {
        javax.swing.JOptionPane.showMessageDialog(null, "Please select a course first!");
        return null;
    }

    DefaultTableModel model = (DefaultTableModel) edittable.getModel();
    
    String id = model.getValueAt(selectedRow, 0).toString();
    
    course = studentservice.getCoursebyid(id);

    return course;
}
    
    
    
    
    
    
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JScrollPane EDIT_TABLE;
    public javax.swing.JTable edittable;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JDialog jDialog5;
    private javax.swing.JDialog jDialog6;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
