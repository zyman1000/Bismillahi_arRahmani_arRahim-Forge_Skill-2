package Adming_Management;
import Student_Managment.*;
import services.StudentService;
import javax.swing.table.DefaultTableModel;
import backend.*;
import User_Account_Management.welcome;
import java.util.List;
import javax.swing.JFrame;

public class Details extends javax.swing.JPanel {
    private Course course ;
    private JFrame frame;

    public Details(Course course) {
        this.course = course;
        initComponents();
        loadLessonsTable();
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
            this.DescriptionField.setText(course.getDescription());
        }
    }

    ///////////////////////////////////////////////////////////  
      //1- LOAD IN TABELE FROM FILES AS NEEDED 
    // 2- handle all button (description/content/optional resource) and add panels for them to view them
    // dont forget to sabe in file the status of completed Details
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
        jLabel11 = new javax.swing.JLabel();
        EDIT_TABLE = new javax.swing.JScrollPane();
        lessons = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        optionalResources = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DescriptionField = new javax.swing.JTextArea();

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

        setBackground(new java.awt.Color(153, 153, 153));

        jLabel11.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel11.setText("lessons");

        lessons.setAutoCreateRowSorter(true);
        lessons.setBackground(new java.awt.Color(102, 102, 102));
        lessons.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lessons.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lessons.setForeground(new java.awt.Color(255, 255, 255));
        lessons.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"10000", "COMP"},
                {"10000", "MATH"},
                {"30000", "PROG"}
            },
            new String [] {
                "ID", "title"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        lessons.setToolTipText("MMM");
        lessons.setFillsViewportHeight(true);
        lessons.setGridColor(new java.awt.Color(255, 255, 255));
        lessons.setShowGrid(true);
        lessons.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lessonsAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        lessons.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lessonsMouseClicked(evt);
            }
        });
        lessons.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lessonsKeyPressed(evt);
            }
        });
        EDIT_TABLE.setViewportView(lessons);
        if (lessons.getColumnModel().getColumnCount() > 0) {
            lessons.getColumnModel().getColumn(0).setPreferredWidth(100);
            lessons.getColumnModel().getColumn(1).setResizable(false);
        }

        jButton6.setBackground(new java.awt.Color(102, 102, 102));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("BACK");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        optionalResources.setBackground(new java.awt.Color(102, 102, 102));
        optionalResources.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        optionalResources.setForeground(new java.awt.Color(255, 255, 255));
        optionalResources.setText("view optional resources");
        optionalResources.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionalResourcesActionPerformed(evt);
            }
        });

        viewButton.setBackground(new java.awt.Color(102, 102, 102));
        viewButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        viewButton.setForeground(new java.awt.Color(255, 255, 255));
        viewButton.setText("view content");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel1.setText("description");

        DescriptionField.setColumns(20);
        DescriptionField.setRows(5);
        jScrollPane1.setViewportView(DescriptionField);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(optionalResources)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(EDIT_TABLE, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane1))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EDIT_TABLE, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optionalResources, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lessonsAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lessonsAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lessonsAncestorAdded

    private void lessonsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lessonsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lessonsMouseClicked

    private void lessonsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lessonsKeyPressed

    }//GEN-LAST:event_lessonsKeyPressed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new manage_courses().setVisible(true);
        frame.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void optionalResourcesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionalResourcesActionPerformed
    int r = lessons.getSelectedRow();
    if (r >= 0) {
        String lessonId = lessons.getValueAt(r, 0).toString();
        Lesson lesson = course.getLessonById(lessonId); 

        
        List<String> resources = lesson.getResources();
        String resourcesText = String.join("\n", resources);

        
        READING p = new READING(lesson.getTitle(),resourcesText);
        p.setVisible(true);
    }
        // GET CONTENT  FROM DATABASE AND WRITE IT IN PANEL READING
    }//GEN-LAST:event_optionalResourcesActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed

      int r = lessons.getSelectedRow();
    if (r >= 0) {
        String lessonId = lessons.getValueAt(r, 0).toString();
        Lesson lesson = course.getLessonById(lessonId); 
        
        READING p = new READING(lesson.getTitle(),lesson.getContent());
        p.setVisible(true);
    }
    }//GEN-LAST:event_viewButtonActionPerformed

    
    
    

    
    
  private void loadLessonsTable() {
    DefaultTableModel model = (DefaultTableModel) lessons.getModel();
    model.setRowCount(0); 

    if (course == null) return;

    List<Lesson> lessonList = course.getLessons();


    for (Lesson lesson : lessonList) {
        model.addRow(new Object[]{ lesson.getId(), lesson.getTitle()});
    }
}  
    
    
    
    
    
    
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea DescriptionField;
    public javax.swing.JScrollPane EDIT_TABLE;
    private javax.swing.JButton jButton6;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JDialog jDialog5;
    private javax.swing.JDialog jDialog6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTable lessons;
    private javax.swing.JButton optionalResources;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
