/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AdmissionForm;

/**
 *
 * @author fgbal
 */
public class bagacCampus extends javax.swing.JFrame {

    /**
     * Creates new form BagacCampus
     */
    public bagacCampus() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bpsuHeader = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        bagacCourseTable = new javax.swing.JTable();
        returnbutton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        bpsuHeader.setBackground(new java.awt.Color(255, 255, 255));
        bpsuHeader.setFont(new java.awt.Font("Century Schoolbook", 1, 36)); // NOI18N
        bpsuHeader.setForeground(new java.awt.Color(85, 22, 29));
        bpsuHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bpsuHeader.setText("BAGAC CAMPUS");
        bpsuHeader.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(85, 22, 29), 2));
        bpsuHeader.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        bagacCourseTable.setBackground(new java.awt.Color(204, 204, 204));
        bagacCourseTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(85, 22, 29), 2));
        bagacCourseTable.setForeground(new java.awt.Color(30, 30, 30));
        bagacCourseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Bachelor of Science in Fisheries", "", "All Strands/Tracks", "Grade 11 Final GWA 80"},
                {"Bachelor of Physical Education", "School Physical Education", "All Strands/Tracks", "Grade 11 Final GWA 80"},
                {"Bachelor of Technology Livelihood Education", "Industrial Arts", "All Strands except Sports Track", "Grade 11 Final GWA 85"},
                {"Bachelor of Science in Social Work", "", "STEM & HUMSS", "Grade 11 Final GWA 80"},
                {"Bachelor of Science in Hospitality Management", "", "All Strands/Tracks", "Grade 11 Final GWA 85"},
                {"Bachelor of Science in Tourism Management", null, "All Strands/Tracks", "Grade 11 Final GWA 80"}
            },
            new String [] {
                "PROGRAM", "MAJOR", "STRAND", "MINIMUM GWA"
            }
        ));
        bagacCourseTable.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(bagacCourseTable);

        returnbutton1.setBackground(new java.awt.Color(85, 22, 29));
        returnbutton1.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        returnbutton1.setText("RETURN");
        returnbutton1.setBorder(null);
        returnbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnbutton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(returnbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bpsuHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(bpsuHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(returnbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void returnbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnbutton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new homePage().setVisible(true);
    }//GEN-LAST:event_returnbutton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(bagacCampus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bagacCampus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bagacCampus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bagacCampus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bagacCampus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bagacCourseTable;
    private javax.swing.JLabel bpsuHeader;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton returnbutton1;
    // End of variables declaration//GEN-END:variables
}
