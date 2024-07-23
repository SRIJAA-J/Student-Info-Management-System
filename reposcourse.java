/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author jagab
 */
public class reposcourse extends javax.swing.JFrame {
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    private Object table;

    /**
     * Creates new form reposcourse
     */
    public reposcourse() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        //testData(jTable1);
        //TableCustom.apply(jscrollPanel,TableCustom.TableType.MULTI_LINE);
        this.setLocationRelativeTo(null);
        try{
           Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
           con = java.sql.DriverManager.getConnection("jdbc:ucanaccess://D:\\PROJECT\\Login1\\Database12.accdb");
           pst=con.prepareStatement("select * from dbs");
           txtdata.setVisible(false);
           rs=pst.executeQuery();
           ResultSetMetaData rsmd=(ResultSetMetaData) rs.getMetaData();
           int n = rsmd.getColumnCount();
           DefaultTableModel dtm=(DefaultTableModel) txtdata.getModel();
           dtm.setRowCount(0);
           while(rs.next()){
               Vector v=new Vector();
               for(int i=1;i<=n;i++){
                   v.add(rs.getString("eno"));
                   v.add(rs.getString("name"));
                   v.add(rs.getString("course"));
                   v.add(rs.getString("fees"));
                   v.add(rs.getString("mode"));
               }
               dtm.addRow(v);
           }
              
        } catch (ClassNotFoundException ex) {
        }catch(SQLException ex){
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtmin1 = new javax.swing.JLabel();
        txtclose = new javax.swing.JLabel();
        txtlabel = new javax.swing.JLabel();
        txtcourse = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtdata = new javax.swing.JTable();
        l3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 55)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STUDENT DATABASE REPORT");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 850, 39));

        txtmin1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        txtmin1.setForeground(new java.awt.Color(255, 255, 255));
        txtmin1.setText("-");
        txtmin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtmin1MouseClicked(evt);
            }
        });
        getContentPane().add(txtmin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, 20, 20));

        txtclose.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtclose.setForeground(new java.awt.Color(255, 255, 255));
        txtclose.setText("X");
        txtclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtcloseMouseClicked(evt);
            }
        });
        getContentPane().add(txtclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 10, -1, -1));

        txtlabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        txtlabel.setForeground(new java.awt.Color(255, 255, 255));
        txtlabel.setText("Search ");
        getContentPane().add(txtlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, 73));

        txtcourse.setBackground(new java.awt.Color(221, 146, 33));
        txtcourse.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtcourse.setForeground(new java.awt.Color(255, 255, 255));
        txtcourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DCA", "HDCA", "ADJP", "ADPP", "DFJD", "DFPD", "HDFD", "DPFD", ".NET", "TALLYPRIME", " ", " " }));
        txtcourse.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                txtcourseItemStateChanged(evt);
            }
        });
        txtcourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcourseActionPerformed(evt);
            }
        });
        txtcourse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcourseKeyReleased(evt);
            }
        });
        getContentPane().add(txtcourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 381, 60));

        txtdata.setBackground(new java.awt.Color(221, 146, 33));
        txtdata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Eno", "Name", "Course", "Fees", "Payment mode"
            }
        ));
        txtdata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtdataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(txtdata);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 920, 320));

        l3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        l3.setForeground(new java.awt.Color(255, 255, 255));
        l3.setText("click here to move back to data form...");
        l3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l3MouseClicked(evt);
            }
        });
        getContentPane().add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 580, 410, 26));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reop1.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtmin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtmin1MouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_txtmin1MouseClicked

    private void txtcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_txtcloseMouseClicked

    private void txtcourseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_txtcourseItemStateChanged
        // TODO add your handling code here:
        /*String query=txtcourse.getSelectedItem().toString();
        filter(query);*/
    }//GEN-LAST:event_txtcourseItemStateChanged

    private void txtcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcourseActionPerformed
        // TODO add your handling code here:
        if(txtcourse.isEnabled()){
            txtdata.setVisible(true);
            DefaultTableModel ob=(DefaultTableModel) txtdata.getModel();
            TableRowSorter<DefaultTableModel> obj=new TableRowSorter<>(ob);
            txtdata.setRowSorter(obj);
            obj.setRowFilter(javax.swing.RowFilter.regexFilter("(?i)"+txtcourse.getSelectedItem()));
            txtdata.setVisible(true);
            if(txtcourse.getSelectedItem().equals("")){
                txtdata.setVisible(false);
            }
        }
        else{
            txtdata.setVisible(false);
        }
    }//GEN-LAST:event_txtcourseActionPerformed

    private void txtcourseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcourseKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_txtcourseKeyReleased

    private void txtdataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdataMouseClicked
        // TODO add your handling code here:
        boolean a=txtdata.isEditing();
        if(a==false){
            JOptionPane.showMessageDialog(null,"Data report cannot be edited");
        }
    }//GEN-LAST:event_txtdataMouseClicked

    private void l3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l3MouseClicked
        // TODO add your handling code here:
        reposhead rh=new reposhead();
        rh.setVisible(true);
        rh.pack();
        rh.show();
        dispose();
    }//GEN-LAST:event_l3MouseClicked

    private void cf(){
        txtdata.setVisible(false);
    }
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
            java.util.logging.Logger.getLogger(reposcourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reposcourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reposcourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reposcourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reposcourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel txtclose;
    private javax.swing.JComboBox<String> txtcourse;
    private javax.swing.JTable txtdata;
    private javax.swing.JLabel txtlabel;
    private javax.swing.JLabel txtmin1;
    // End of variables declaration//GEN-END:variables
}
