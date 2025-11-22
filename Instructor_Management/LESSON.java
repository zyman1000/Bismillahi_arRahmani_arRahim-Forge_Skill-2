package Instructor_Management;

import services.Validation;
import backend.Lesson;
import services.CourseService;
import java.awt.Color;
import java.util.Arrays;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class LESSON extends javax.swing.JDialog {

    private DefaultTableModel Model;
    private int r;
    private String lessonId;
    private String cId;
    private List<String> re;
    private CourseService manager;
    public int selectt;

    public LESSON(java.awt.Frame parent, boolean modal, CourseService manager, String cid, String id, String title, DefaultTableModel model, int r) {//update course
        super(parent, modal);
        initComponents();
        selectt = 1;
        this.lessonId = id;
        this.Model = model;
        this.r = r;
        this.cId = cid;
        this.manager = manager;
        titleField.setText(title);
        for (Lesson c : manager.getLessonsByCourse(cid)) {
            if (c.getId().equals(id)) {
                contentField.setText(c.getContent());
                List<String> resources = c.getResources();
                this.re = resources;
                for (String res : resources) {
                    resourcesField.append(res + "\n");
                }
                break;
            }
        }
        setLocationRelativeTo(null);
        titleField.setText(title);
        // make setText for other fields from database
    }

    public LESSON(java.awt.Frame parent, boolean modal, String cid) {//add course
        super(parent, modal);
        initComponents();
        selectt = 2;
        cId = cid;
        setLocationRelativeTo(null);

    }
  



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
        jtitle = new javax.swing.JLabel();
        jtitle1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        titleField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        resourcesField = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        contentField = new javax.swing.JTextArea();

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

        jtitle.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jtitle.setText("content");
        jtitle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtitleFocusLost(evt);
            }
        });

        jtitle1.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jtitle1.setText(" resources");
        jtitle1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtitle1FocusLost(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Stencil", 1, 48)); // NOI18N
        jLabel15.setText(" LESSON");

        titleField.setBackground(new java.awt.Color(204, 204, 204));
        titleField.setForeground(new java.awt.Color(255, 255, 255));
        titleField.setCaretColor(new java.awt.Color(255, 255, 255));
        titleField.setSelectionColor(new java.awt.Color(255, 255, 255));
        titleField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                titleFieldFocusLost(evt);
            }
        });
        titleField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleFieldActionPerformed(evt);
            }
        });

        resourcesField.setBackground(new java.awt.Color(204, 204, 204));
        resourcesField.setColumns(20);
        resourcesField.setRows(5);
        resourcesField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                resourcesFieldFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(resourcesField);

        contentField.setBackground(new java.awt.Color(204, 204, 204));
        contentField.setColumns(20);
        contentField.setRows(5);
        contentField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                contentFieldFocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(contentField);

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
                                .addComponent(jtitle1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jtitle))))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2)
                            .addComponent(titleField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtitle)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtitle1)
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
        String title = titleField.getText();
        String content = contentField.getText();
        if (!Validation.verifyTitle(title) || !Validation.verifyContent(content)) {
            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), "make sure title is valid and that content is not empty!");
            return;
        }
        if (selectt == 1) {
            Model.setValueAt(lessonId, r, 0);
            Model.setValueAt(title, r, 1);
            manager.editLesson(cId, lessonId, title, content, re);
            dispose();
        } else {
            String resourcesText = resourcesField.getText();

           
            List<String> resources = Arrays.asList(resourcesText.split("\n"));

            Lesson newLesson = new Lesson();
            newLesson.setTitle(title);
            newLesson.setContent(content);
            newLesson.setResources(resources);
            CourseService CC=new CourseService();
            CC.addLesson(cId, newLesson);
            dispose();
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void titleFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleFieldActionPerformed

    private void titleFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_titleFieldFocusLost
        // TODO add your handling code here:
        String title = titleField.getText();
        if(Validation.verifyTitle(title)){
            titleField.setBackground(Color.green);
        }
        else
            titleField.setBackground(Color.red);
    }//GEN-LAST:event_titleFieldFocusLost

    private void jtitleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtitleFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_jtitleFocusLost

    private void jtitle1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtitle1FocusLost

    }//GEN-LAST:event_jtitle1FocusLost

    private void contentFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contentFieldFocusLost
        // TODO add your handling code here:
        String content = contentField.getText();
        if(Validation.verifyContent(content)){
            contentField.setBackground(Color.green);
        }
        else
            contentField.setBackground(Color.red);
    }//GEN-LAST:event_contentFieldFocusLost

    private void resourcesFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_resourcesFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_resourcesFieldFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea contentField;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jtitle;
    private javax.swing.JLabel jtitle1;
    private javax.swing.JTextArea resourcesField;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField titleField;
    // End of variables declaration//GEN-END:variables

}
