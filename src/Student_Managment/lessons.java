package Student_Managment;
import services.StudentService;
import javax.swing.table.DefaultTableModel;
import backend.*;
import User_Account_Management.welcome;
import java.util.List;
import javax.swing.JFrame;

public class lessons extends javax.swing.JPanel {
    private Student student ;
    private Course course ;
    private JFrame frame;

    public lessons(Student student,Course course) {
        this.student = student;
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
        }
    }

    ///////////////////////////////////////////////////////////  
      //1- LOAD IN TABELE FROM FILES AS NEEDED 
    // 2- handle all button (description/content/optional resource) and add panels for them to view them
    // dont forget to sabe in file the status of completed lessons
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
        jButton5 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        EDIT_TABLE = new javax.swing.JScrollPane();
        lessons = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        updateButton2 = new javax.swing.JButton();
        updateButton3 = new javax.swing.JButton();

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

        jButton5.setBackground(new java.awt.Color(102, 102, 102));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("LOGOUT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        jLabel11.setText("lessons");

        lessons.setAutoCreateRowSorter(true);
        lessons.setBackground(new java.awt.Color(102, 102, 102));
        lessons.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lessons.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lessons.setForeground(new java.awt.Color(255, 255, 255));
        lessons.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"10000", "COMP", "non"},
                {"10000", "MATH", "non"},
                {"30000", "PROG", "non"}
            },
            new String [] {
                "ID", "title", "completed"
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

        updateButton2.setBackground(new java.awt.Color(102, 102, 102));
        updateButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        updateButton2.setForeground(new java.awt.Color(255, 255, 255));
        updateButton2.setText("view optional resources");
        updateButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButton2ActionPerformed(evt);
            }
        });

        updateButton3.setBackground(new java.awt.Color(102, 102, 102));
        updateButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        updateButton3.setForeground(new java.awt.Color(255, 255, 255));
        updateButton3.setText("view content");
        updateButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(updateButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateButton2))
                        .addGap(208, 208, 208)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(EDIT_TABLE, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(13, 13, 13)
                .addComponent(EDIT_TABLE, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new welcome().setVisible(true);
        frame.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void lessonsAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lessonsAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lessonsAncestorAdded

    private void lessonsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lessonsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lessonsMouseClicked

    private void lessonsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lessonsKeyPressed

    }//GEN-LAST:event_lessonsKeyPressed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new Enrolled_courses(student).setVisible(true);
        frame.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void updateButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButton2ActionPerformed
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
    }//GEN-LAST:event_updateButton2ActionPerformed

    private void updateButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButton3ActionPerformed

      int r = lessons.getSelectedRow();
    if (r >= 0) {
        String lessonId = lessons.getValueAt(r, 0).toString();
        Lesson lesson = course.getLessonById(lessonId); 
        
        READING p = new READING(lesson.getTitle(),lesson.getContent());
        p.setVisible(true);        
        
        StudentService ss = new StudentService();
        Course currentCourse = course;
        if (currentCourse != null) {
            ss.lessonAccess(student, currentCourse, currentCourse.getLessonById(lessonId));
        }

        loadLessonsTable();
    }
    }//GEN-LAST:event_updateButton3ActionPerformed

    
    
    

    
    
  private void loadLessonsTable() {
    DefaultTableModel model = (DefaultTableModel) lessons.getModel();
    model.setRowCount(0); 

    if (course == null || student == null) return;

    List<Lesson> lessonList = course.getLessons();
    progress courseProgress = null;
    
    
    
    
    
    for (progress p : student.getProgress()) {
        
        if (p.getCourseId().equals(course.getId())) {
            courseProgress = p;
            break;
        }
    }
    
    
    if (courseProgress == null) return;
    
    System.out.println("done");
    for (Lesson lesson : lessonList) {
        String status = courseProgress.isLessonCompleted(lesson.getId()) 
                        ? "COMPLETED" : "NOT_COMPLETED";

        model.addRow(new Object[]{ lesson.getId(), lesson.getTitle(), status });
    }
}  
    
    
    
    
    
    
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JScrollPane EDIT_TABLE;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JDialog jDialog5;
    private javax.swing.JDialog jDialog6;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTable lessons;
    private javax.swing.JButton updateButton2;
    private javax.swing.JButton updateButton3;
    // End of variables declaration//GEN-END:variables
}
