package Instructor_Management;

import backend.Lesson;
import backend.courseManagement;
import backend.*;
import java.util.Arrays;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class LESSON extends javax.swing.JDialog {

    private DefaultTableModel Model;
    private int r;
    private String lessonId;
    private String cId;
    private List<String> re;
    private courseManagement manager;
    public int selectt;

    public LESSON(java.awt.Frame parent, boolean modal, courseManagement manager, String cid, String id, String title, DefaultTableModel model, int r) {//update course
        super(parent, modal);
        initComponents();
        selectt = 1;
        this.lessonId = id;
        this.Model = model;
        this.r = r;
        this.cId = cid;
        this.manager = manager;
        nameField1.setText(title);
        for (Lesson c : manager.getLessonsByCourse(cid)) {
            if (c.getId().equals(id)) {
                jTextArea2.setText(c.getContent());
                List<String> resources = c.getResources();
                this.re = resources;
                for (String res : resources) {
                    jTextArea1.append(res + "\n");
                }
                break;
            }
        }
        setLocationRelativeTo(null);
        nameField1.setText(title);
        // make setText for other fields from database
    }

    public LESSON(java.awt.Frame parent, boolean modal, String cid) {//add course
        super(parent, modal);
        initComponents();
        selectt = 2;
        cId = cid;
        setLocationRelativeTo(null);

    }

    ///////////////////////////////////////////////////////////  
      // 1- MAKE SAVE BUTTON TO SAVE IN FILE AND TABLE
      // 2- SET REAMINED FIELDS IN FIRST CONSTRUCTOR FROM DATABASE
      // 3- validation for all fields
  



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        saveButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        nameField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

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

        jRadioButton1.setText("jRadioButton1");

        jRadioButton2.setText("jRadioButton2");

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
        jLabel11.setText("content");

        jLabel12.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel12.setText(" resources");

        jLabel15.setFont(new java.awt.Font("Stencil", 1, 48)); // NOI18N
        jLabel15.setText(" LESSON");

        nameField1.setBackground(new java.awt.Color(204, 204, 204));
        nameField1.setForeground(new java.awt.Color(255, 255, 255));
        nameField1.setCaretColor(new java.awt.Color(255, 255, 255));
        nameField1.setSelectionColor(new java.awt.Color(255, 255, 255));
        nameField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameField1ActionPerformed(evt);
            }
        });

        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2)
                            .addComponent(nameField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel15)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if (selectt == 1) {
            String title = nameField1.getText();
            String content = jTextArea2.getText();
            Model.setValueAt(lessonId, r, 0);
            Model.setValueAt(title, r, 1);
            manager.editLesson(cId, lessonId, title, content, re);
            dispose();
        } else {
            System.out.println("Save button clicked!");
            String title = nameField1.getText();
            String content = jTextArea2.getText();
            String resourcesText = jTextArea1.getText();

           
            List<String> resources = Arrays.asList(resourcesText.split("\n"));

            Lesson newLesson = new Lesson();
            newLesson.setTitle(title);
            newLesson.setContent(content);
            newLesson.setResources(resources);
            courseManagement CC=new courseManagement();
            CC.addLesson(cId, newLesson);
            dispose();
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void nameField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameField1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField nameField1;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables

}
