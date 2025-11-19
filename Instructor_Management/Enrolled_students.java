package Instructor_Management;

import User_Account_Management.InstructorDashboard;
import User_Account_Management.welcome;
import javax.swing.JFrame;

public class Enrolled_students extends javax.swing.JPanel {

    private JFrame frame;
    private String InstructorID;
    public Enrolled_students(String instructorId) {
        initComponents();
        this.InstructorID=instructorId;
    }

    @Override
    public void setVisible(boolean f) {
        if (f) {
            frame = new JFrame("Search and Update Student");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.getContentPane().add(this);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }
    }

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
        updateButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        EDIT_TABLE = new javax.swing.JScrollPane();
        enrolled = new javax.swing.JTable();
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

        updateButton.setBackground(new java.awt.Color(102, 102, 102));
        updateButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("View student");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        jLabel11.setText("my COURSES");

        enrolled.setAutoCreateRowSorter(true);
        enrolled.setBackground(new java.awt.Color(102, 102, 102));
        enrolled.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        enrolled.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        enrolled.setForeground(new java.awt.Color(255, 255, 255));
        enrolled.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"COMP"},
                {null},
                {null}
            },
            new String [] {
                "TITLE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        enrolled.setToolTipText("MMM");
        enrolled.setFillsViewportHeight(true);
        enrolled.setGridColor(new java.awt.Color(255, 255, 255));
        enrolled.setShowGrid(true);
        enrolled.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                enrolledAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        enrolled.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enrolledMouseClicked(evt);
            }
        });
        enrolled.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enrolledKeyPressed(evt);
            }
        });
        EDIT_TABLE.setViewportView(enrolled);

        jButton6.setBackground(new java.awt.Color(102, 102, 102));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("BACK");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(EDIT_TABLE, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(234, 234, 234))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EDIT_TABLE, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         new welcome().setVisible(true);
        frame.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
       
        int r = enrolled.getSelectedRow();
        String courseName = enrolled.getValueAt(r, 1).toString();
         frame.dispose();
        //new lessons(courseName).setVisible(true);
      
        // TODO add your handling code here:

    }//GEN-LAST:event_updateButtonActionPerformed

    private void enrolledAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_enrolledAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_enrolledAncestorAdded

    private void enrolledMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enrolledMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_enrolledMouseClicked

    private void enrolledKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enrolledKeyPressed

    }//GEN-LAST:event_enrolledKeyPressed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
             new InstructorDashboard(InstructorID).setVisible(true);
             frame.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JScrollPane EDIT_TABLE;
    public javax.swing.JTable enrolled;
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
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
