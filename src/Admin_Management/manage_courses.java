
package Admin_Management;
import User_Account_Management.AdminDashboard;
import services.*;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import backend.Course;
import javax.swing.JOptionPane;
public class manage_courses extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(manage_courses.class.getName());
    public manage_courses() {
        initComponents();
        load((DefaultTableModel) adminTable.getModel(), CourseService.getCourseByStatus(Course.PENDING));
        setLocationRelativeTo(null);
    }
    
    void load(DefaultTableModel model, List<Course> list) {
        model.setRowCount(0);
         if (list == null) return; 
        for (Course item : list) {
            Object[] row = { item.getId(), item.getTitle(), UserService.getUserByID(item.getInstructorId()).getUsername()};
            model.addRow(row);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        adminTable = new javax.swing.JTable();
        AcceptButton = new javax.swing.JButton();
        rejectButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        adminTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "courseID", "Title", "Instructor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(adminTable);

        AcceptButton.setText("Accept");
        AcceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceptButtonActionPerformed(evt);
            }
        });

        rejectButton.setText("Reject");
        rejectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectButtonActionPerformed(evt);
            }
        });

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        viewButton.setText("view details");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(AcceptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(rejectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rejectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AcceptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
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

    private void AcceptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptButtonActionPerformed
        // TODO add your handling code here:
        int r = adminTable.getSelectedRow();
        if(r == -1){
            JOptionPane.showMessageDialog(this, "Please select a course first.");
            return;
        }
        String courseID = adminTable.getValueAt(r, 0).toString();
        CourseService.AcceptCourse(courseID);
        JOptionPane.showMessageDialog(this, "course marked as accepted!");
        load((DefaultTableModel) adminTable.getModel(), CourseService.getCourseByStatus(Course.PENDING));
    }//GEN-LAST:event_AcceptButtonActionPerformed

    private void rejectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectButtonActionPerformed
        // TODO add your handling code here:
        int r = adminTable.getSelectedRow();
        if(r == -1){
            JOptionPane.showMessageDialog(this, "Please select a course first.");
            return;
        }
        String courseID = adminTable.getValueAt(r, 0).toString();
        CourseService.rejectCourse(courseID);
        JOptionPane.showMessageDialog(this, "course marked as rejected!");
        load((DefaultTableModel) adminTable.getModel(), CourseService.getCourseByStatus(Course.PENDING));
    }//GEN-LAST:event_rejectButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
           // TODO add your handling code here:
        this.dispose();
        new AdminDashboard().setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
        int r = adminTable.getSelectedRow();
        if(r == -1){
            JOptionPane.showMessageDialog(this, "Please select a course first.");
            return;
        }
        String courseID = adminTable.getValueAt(r, 0).toString();
        CourseService service = new CourseService();
        new Details(service.getCoursebyid(courseID)).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_viewButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AcceptButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JTable adminTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton rejectButton;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
