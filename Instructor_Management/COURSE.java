package Instructor_Management;

import backend.Course;
import backend.courseManagement;
import backend.*;
import javax.swing.table.DefaultTableModel;

public class COURSE extends javax.swing.JDialog {

    public String InstructorId;
    private courseManagement courseManagement;
    private String courseId;
    private DefaultTableModel Model;
    private int r;
    private int select;
    public COURSE(java.awt.Frame parent, boolean modal, String title, courseManagement manager, String instructorId, String CourseId, DefaultTableModel model, int r) {

        super(parent, modal);
        initComponents();
        InstructorId = instructorId;
        courseId = CourseId;
        select=1;
        this.courseManagement = manager;
        this.Model = model;
        this.r = r;
        setLocationRelativeTo(null);
        for (Course c : manager.getCoursesByInstructor(instructorId)) {
            if (c.getId().equals(courseId)) {
                nameField1.setText(title);
                nameField2.setText(c.getDescription());

                break;
            }
        }

    }

    public COURSE(java.awt.Frame parent, boolean modal, String instructorId) {//add course
        super(parent, modal);
        initComponents();
        select=2;
        InstructorId = instructorId;
        setLocationRelativeTo(null);
    }

    ////////////////////////////////////////////////////////////
      // 1- MAKE SAVE BUTTON TO SAVE IN FILE AND TABLE
      // 2- SET REAMINED FIELDS IN FIRST CONSTRUCTOR FROM DATABASE
      // 3- validation for all fields
  


    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        saveButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        nameField1 = new javax.swing.JTextField();
        nameField2 = new javax.swing.JTextField();

        jPanel6.setOpaque(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setToolTipText("ADD STUDENT");

        saveButton.setBackground(new java.awt.Color(153, 153, 153));
        saveButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        saveButton.setText("SAVE");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel10.setText(" Title");

        jLabel11.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel11.setText("description");

        jLabel15.setFont(new java.awt.Font("Stencil", 1, 48)); // NOI18N
        jLabel15.setText(" course");

        jPanel8.setOpaque(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        nameField1.setBackground(new java.awt.Color(204, 204, 204));
        nameField1.setForeground(new java.awt.Color(255, 255, 255));
        nameField1.setCaretColor(new java.awt.Color(255, 255, 255));
        nameField1.setSelectionColor(new java.awt.Color(255, 255, 255));
        nameField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameField1ActionPerformed(evt);
            }
        });

        nameField2.setBackground(new java.awt.Color(204, 204, 204));
        nameField2.setForeground(new java.awt.Color(255, 255, 255));
        nameField2.setCaretColor(new java.awt.Color(255, 255, 255));
        nameField2.setSelectionColor(new java.awt.Color(255, 255, 255));
        nameField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(105, 105, 105)
                                        .addComponent(nameField1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(nameField2)))))
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(151, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(163, 163, 163)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(nameField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(nameField2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(213, 213, 213)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(167, 167, 167)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
         String title = nameField1.getText();
        String description = nameField2.getText();
        if(select==1)
        {
       
        Model.setValueAt(courseId, r, 0);
        Model.setValueAt(title, r, 1);
        courseManagement.editCourse(courseId, title, description);
        dispose();
        }
        else{
      
        Course newCourse=new Course();
        newCourse.setTitle(title);
        newCourse.setDescription(description);
        newCourse.setInstructorId(InstructorId);
        
        if (newCourse.getId() == null || newCourse.getId().isEmpty()) {
    newCourse.setId(java.util.UUID.randomUUID().toString());
}
        
        JsonDataBaseManager.addCourse(newCourse);
        dispose();
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void nameField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameField1ActionPerformed

    private void nameField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameField2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField nameField1;
    private javax.swing.JTextField nameField2;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables

}
