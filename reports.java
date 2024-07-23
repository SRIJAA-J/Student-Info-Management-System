/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;

import javax.swing.JFrame;

/**
 *
 * @author jagab
 */
public class reports extends javax.swing.JFrame {

    /**
     * Creates new form reports
     */
    public reports() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtmin = new javax.swing.JLabel();
        txteno = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtmin1 = new javax.swing.JLabel();
        txtclose = new javax.swing.JLabel();
        txteno1 = new javax.swing.JButton();
        txtdr = new javax.swing.JButton();
        l3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        txtmin.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        txtmin.setForeground(new java.awt.Color(255, 255, 255));
        txtmin.setText("-");
        txtmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtminMouseClicked(evt);
            }
        });

        txteno.setBackground(new java.awt.Color(221, 146, 33));
        txteno.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txteno.setForeground(new java.awt.Color(255, 255, 255));
        txteno.setText("DATAWISE REPORT");
        txteno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtenoMouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 55)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STUDENT DATABASE REPORT");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 850, 39));

        txtmin1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        txtmin1.setForeground(new java.awt.Color(255, 255, 255));
        txtmin1.setText("-");
        txtmin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtmin1MouseClicked(evt);
            }
        });
        getContentPane().add(txtmin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 10, 20, 20));

        txtclose.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtclose.setForeground(new java.awt.Color(255, 255, 255));
        txtclose.setText("X");
        txtclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtcloseMouseClicked(evt);
            }
        });
        getContentPane().add(txtclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 10, -1, -1));

        txteno1.setBackground(new java.awt.Color(221, 146, 33));
        txteno1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txteno1.setForeground(new java.awt.Color(255, 255, 255));
        txteno1.setText("DATAWISE REPORT");
        txteno1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txteno1MouseClicked(evt);
            }
        });
        getContentPane().add(txteno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 330, 228));

        txtdr.setBackground(new java.awt.Color(221, 146, 33));
        txtdr.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtdr.setForeground(new java.awt.Color(255, 255, 255));
        txtdr.setText("DATABASE REPORT");
        txtdr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtdrMouseClicked(evt);
            }
        });
        getContentPane().add(txtdr, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 330, 220));

        l3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        l3.setForeground(new java.awt.Color(255, 255, 255));
        l3.setText("click here to move back to database...");
        l3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l3MouseClicked(evt);
            }
        });
        getContentPane().add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, 410, 26));

        jButton4.setBackground(new java.awt.Color(255, 204, 51));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 32)); // NOI18N
        jButton4.setText("Quit");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 140, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reop1.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtminMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_txtminMouseClicked

    private void txtmin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtmin1MouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_txtmin1MouseClicked

    private void txtcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_txtcloseMouseClicked

    private void txtenoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtenoMouseClicked
        // TODO add your handling code here:
        repohead h=new repohead();
        h.setVisible(true);
        h.pack();
        h.show();
        dispose();
    }//GEN-LAST:event_txtenoMouseClicked

    private void txteno1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txteno1MouseClicked
        // TODO add your handling code here:
        reposhead h=new reposhead();
        h.setVisible(true);
        h.pack();
        h.show();
        dispose();
    }//GEN-LAST:event_txteno1MouseClicked

    private void txtdrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdrMouseClicked
        // TODO add your handling code here:
        reportsdb db=new reportsdb();
        db.setVisible(true);
        db.pack();
        db.show();
        dispose();
    }//GEN-LAST:event_txtdrMouseClicked

    private void l3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l3MouseClicked
        // TODO add your handling code here:
        logindb1 lb=new logindb1();
        lb.setVisible(true);
        lb.pack();
        lb.show();
        dispose();
    }//GEN-LAST:event_l3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reports().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel txtclose;
    private javax.swing.JButton txtdr;
    private javax.swing.JButton txteno;
    private javax.swing.JButton txteno1;
    private javax.swing.JLabel txtmin;
    private javax.swing.JLabel txtmin1;
    // End of variables declaration//GEN-END:variables
}
