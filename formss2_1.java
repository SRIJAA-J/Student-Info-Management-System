/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;
import java.awt.event.FocusEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.util.*;
import java.util.regex.*;
import java.awt.event.*;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
/**
 *
 * @author jagab
 */
public final class formss2_1 extends javax.swing.JFrame {
    Connection con;
    ResultSet rs;
    ResultSet rs1;
    Statement st;
    PreparedStatement pst;
    PreparedStatement pst1;
    String sql;
    String eno;
    String course;
    String name;
    int fee;
    int n;
    String mode;
    private Object OptionPane;
    private String rno;
    int lastid;

    /**
     * Creates new form formss2_1
     */
    public formss2_1() {
        initComponents();
        combo();
        //getlastid();
        eno="";
        this.setLocationRelativeTo(null);
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://D:\\PROJECT\\Login1\\Database12.accdb");
                txtname.setText("");
                txteno.setText("");
                txtcourse.setSelectedIndex(-1);
                fees.setText("");
                txtcash.setSelected(true);
                txtcard.setSelected(false);
                txtcheque.setSelected(false);
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
        } catch (ClassNotFoundException ex) {
        }catch(SQLException ex){
        }
    }
    
    /*private void max(){
        try{
           Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://D:\\PROJECT\\Login1\\Database12.accdb");
            String sqlquery="SELECT eno FROM dbs";
            PreparedStatement pst=conn.prepareStatement(sqlquery);
            ResultSet rs=pst.executeQuery();
            if(rs.next()){
                int id=rs.getInt(1);
                int n=id+1;
                txteno.setText(Integer.toString(n));
                
                
            }
            System.out.println("Number is"+ n);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }*/
    /*public int max(){
        int id=0;
        Statement st;
        try{
            st=con.createStatement();
            ResultSet rs=st.executeQuery("select max(eno) from dbs");
            while(rs.next()){
                id=rs.getInt(1);
                txteno.setText(Integer.toString(id));
            }
        }catch(Exception e){
            
        }
        return id+1;
        
    }*/
    public void getlastid(){
        try{
            con = DriverManager.getConnection("jdbc:ucanaccess://D:\\PROJECT\\Login1\\Database12.accdb");
            String sql="select max(eno) from dbs order by max(eno) desc ";
            st=con.createStatement();
            rs=st.executeQuery(sql);
            if(rs.next()){
                lastid=rs.getInt(1);
                n=lastid+1;
                txteno.setText(Integer.toString(n));
                System.out.println("Number is"+ n);
                //String n1=Integer.toString(n);
                
            }
             
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }
    
   
    /*private void autoid(){
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://D:\\PROJECT\\Login1\\Database12.accdb");
            String sqlquery="select eno from dbs order by eno desc";
            PreparedStatement pst=con.prepareStatement(sqlquery);
            ResultSet rs=pst.executeQuery();
            if(rs.next()){
                String reno=rs.getString("eno");
                int co=reno.length();
                String txt=reno.substring(0,2);
                String num=reno.substring(2,co);
                int n=Integer.parseInt(num);
                n++;
                String snum=Integer.toString(n);
                String ftxt=txt+snum;
                txteno.setText(ftxt);
                int id=rs.getInt(1);
                int n=id+1;
                txteno.setText(Integer.toString(n));
            }
            else{
                txteno.setText("MI1000");
            }
        }
        catch(Exception e){
            
        }
    }*/
    /*public void invoice(){
        try{
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select Max(eno) from dbs");
        rs.next();
        
        rs.getString("Max(eno)");
        if(rs.getString("Max(eno)")==null){
            txteno.setText("C10001");
        }
        else{
            long id=Long.parseLong(rs.getString("Max(eno)").substring(2,rs.getString("Max(eno)").length()));
            id++;
            txteno.setText("C-"+String.format("%05d",eno));
        }
        }
        catch(SQLException ex){
        }
    }*/
    /*public void eno_autonumber(){
        try{
            //String sql="select eno from dbs order by eno desc limit 1";
            String sql1="select eno from id order by eno desc limit 1";
            pst=con.prepareStatement(sql1);
            rs=pst.executeQuery();
            if(rs.next()){
                //String id=rs.getString(1);
                //String name=rs.getString("COURSE_NAME");
                //int eno=rs.getInt(1);
                //int n=eno+1;
                //txteno.setText(Integer.toString(n));
                String rn=rs.getString("eno");
                int co=rn.length();
                String txt=rn.substring(0,2);
                String num=rn.substring(2,co);
                int n=Integer.parseInt(num);
                n++;
                String snum=Integer.toString(n);
                String ftxt=txt+snum;
                txteno.setText(ftxt);
            }
        } catch (SQLException ex) {
            Logger.getLogger(formss2_1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
    
    
    /*public void autoeno(){
       try{
       Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
       con = DriverManager.getConnection("jdbc:ucanaccess://D:\\PROJECT\\Login1\\Database12.accdb");
       //Statement st =(Statement) con.createStatement();
       Statement st=(Statement) con.createStatement();
       rs=pst.executeQuery("select max(eno) from dbs");
       rs.next();
       rs.getInt("Max(eno)");
       if(rs.getInt("Max(eno)")==null){
           txteno.setText("1001");
       }
       else{
           //String eno=Long.valueOf(rs.getString("Max(eno)"));
           int eno=rs.getInt("Max(eno)");
           eno++;
           txteno.setText(String.format("%04d",eno));
       }
       }catch (ClassNotFoundException | SQLException ex) {
        }
        
    }*/
    
    
    
    public void combo(){
    try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://D:\\PROJECT\\Login1\\Database12.accdb");
            String sql="select * from COURSE_MASTER";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            while(rs.next()){
                String name=rs.getString("COURSE_NAME");
                txtcourse.addItem(name);
            }
    }
    catch(Exception e){
        e.printStackTrace();
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

        jLabel4 = new javax.swing.JLabel();
        txtsave = new javax.swing.JButton();
        txtback1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtmin = new javax.swing.JLabel();
        txtclose = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txteno = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtcourse = new javax.swing.JComboBox<>();
        fees = new javax.swing.JTextField();
        txtcash = new javax.swing.JRadioButton();
        txtcheque = new javax.swing.JRadioButton();
        txtcard = new javax.swing.JRadioButton();
        txtsave1 = new javax.swing.JButton();
        txtclear = new javax.swing.JButton();
        txtback = new javax.swing.JButton();
        l3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("E.No");

        txtsave.setBackground(new java.awt.Color(255, 204, 51));
        txtsave.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtsave.setText("Save");
        txtsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsaveActionPerformed(evt);
            }
        });
        txtsave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsaveKeyPressed(evt);
            }
        });

        txtback1.setBackground(new java.awt.Color(255, 204, 51));
        txtback1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtback1.setText("Back");
        txtback1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtback1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 55)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STUDENT INFO MANAGEMENT SYSTEM");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 1110, 39));

        txtmin.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        txtmin.setForeground(new java.awt.Color(255, 255, 255));
        txtmin.setText("-");
        txtmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtminMouseClicked(evt);
            }
        });
        getContentPane().add(txtmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 10, -1, 20));

        txtclose.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtclose.setForeground(new java.awt.Color(255, 255, 255));
        txtclose.setText("X");
        txtclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtcloseMouseClicked(evt);
            }
        });
        getContentPane().add(txtclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("E.No");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Course");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Fees");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, -1, 41));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Payment Mode");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, -1, 41));

        txteno.setEditable(false);
        txteno.setBackground(new java.awt.Color(255, 255, 255));
        txteno.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        txteno.setForeground(new java.awt.Color(102, 0, 0));
        txteno.setEnabled(false);
        txteno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtenoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtenoMousePressed(evt);
            }
        });
        txteno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtenoActionPerformed(evt);
            }
        });
        txteno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtenoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtenoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtenoKeyTyped(evt);
            }
        });
        getContentPane().add(txteno, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, 311, 50));

        txtname.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        txtname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnameKeyTyped(evt);
            }
        });
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 220, 311, 50));

        txtcourse.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        txtcourse.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                txtcoursePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        txtcourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcourseActionPerformed(evt);
            }
        });
        txtcourse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcourseKeyPressed(evt);
            }
        });
        getContentPane().add(txtcourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 290, 311, 50));

        fees.setBackground(new java.awt.Color(204, 204, 204));
        fees.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        fees.setEnabled(false);
        fees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                feesMousePressed(evt);
            }
        });
        fees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feesActionPerformed(evt);
            }
        });
        fees.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                feesKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                feesKeyTyped(evt);
            }
        });
        getContentPane().add(fees, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 380, 311, 50));

        txtcash.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        txtcash.setForeground(new java.awt.Color(255, 255, 255));
        txtcash.setSelected(true);
        txtcash.setText("Cash");
        txtcash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcashActionPerformed(evt);
            }
        });
        txtcash.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcashKeyPressed(evt);
            }
        });
        getContentPane().add(txtcash, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 470, -1, -1));

        txtcheque.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        txtcheque.setForeground(new java.awt.Color(255, 255, 255));
        txtcheque.setText("Cheque");
        txtcheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtchequeActionPerformed(evt);
            }
        });
        txtcheque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtchequeKeyPressed(evt);
            }
        });
        getContentPane().add(txtcheque, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 470, -1, -1));

        txtcard.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        txtcard.setForeground(new java.awt.Color(255, 255, 255));
        txtcard.setText("Card");
        txtcard.setToolTipText("");
        txtcard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcardActionPerformed(evt);
            }
        });
        txtcard.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcardKeyPressed(evt);
            }
        });
        getContentPane().add(txtcard, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 470, -1, -1));

        txtsave1.setBackground(new java.awt.Color(255, 204, 51));
        txtsave1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtsave1.setText("Save");
        txtsave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsave1ActionPerformed(evt);
            }
        });
        txtsave1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsave1KeyPressed(evt);
            }
        });
        getContentPane().add(txtsave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, 153, 75));

        txtclear.setBackground(new java.awt.Color(255, 204, 51));
        txtclear.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtclear.setText("Clear");
        txtclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclearActionPerformed(evt);
            }
        });
        getContentPane().add(txtclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 560, 150, 70));

        txtback.setBackground(new java.awt.Color(255, 204, 51));
        txtback.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtback.setText("Back");
        txtback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbackActionPerformed(evt);
            }
        });
        getContentPane().add(txtback, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 560, 160, 70));

        l3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        l3.setForeground(new java.awt.Color(255, 255, 255));
        l3.setText("click here to move to Login Page...");
        l3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l3MouseClicked(evt);
            }
        });
        getContentPane().add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 670, 368, 26));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("( ranges from: 10001-99999)");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 220, 30));

        jButton1.setBackground(new java.awt.Color(255, 204, 51));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("Quit");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 560, 150, 70));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sdbs9.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtminMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_txtminMouseClicked

    private void txtcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_txtcloseMouseClicked

    private void txtenoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtenoMouseClicked
        // TODO add your handling code here:
        /*if(txtmodify.isEnabled()){
            txteno.setEditable(false);
        }
        else if(txtadd.isEnabled()){
            txteno.setEditable(true);
        }*/
    }//GEN-LAST:event_txtenoMouseClicked

    private void txtenoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtenoMousePressed
        // TODO add your handling code here:
        /*if(txtupdate.isRequestFocusEnabled()){
            JOptionPane.showMessageDialog(this,"Enrollment Number cannot be edited");
        }*/
    }//GEN-LAST:event_txtenoMousePressed

    private void txtenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtenoActionPerformed
        // TODO add your handling code here:
         try{
            con = DriverManager.getConnection("jdbc:ucanaccess://D:\\PROJECT\\Login1\\Database12.accdb");
            String sql="select max(eno) from dbs order by max(eno) desc ";
            st=con.createStatement();
            rs=st.executeQuery(sql);
            if(rs.next()){
                lastid=rs.getInt(1);
                n=lastid+1;
                //txteno.setText(Integer.toString(n));
                String n1=Integer.toString(n);
                System.out.println("Number is"+ n);
                txteno.setText(n1);
            }
             
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_txtenoActionPerformed

    private void txtenoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtenoKeyPressed
        /*if(evt.getKeyCode()==java.awt.event.KeyEvent.VK_ENTER){
            if(txteno.getText().equals("")){
                JOptionPane.showMessageDialog(this,"Eno needed to be filled");
                String PATTERN="^[0-9]{5}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(txteno.getText());
        if(!match.matches()){
            JOptionPane.showMessageDialog(this, "Enrollment Number is only 5 numbers");
        }
            }
            else{
                txtname.requestFocus();
            }
        }*/
    }//GEN-LAST:event_txtenoKeyPressed

    private void txtenoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtenoKeyReleased
        // TODO add your handling code here:
        /*String PATTERN="^[0-9]{5}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(txteno.getText());
        if(!match.matches()){
            JOptionPane.showMessageDialog(this, "Enrollment Number is only 5 numbers");
        }*/
    }//GEN-LAST:event_txtenoKeyReleased

    private void txtenoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtenoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if(!(Character.isDigit(c)||Character.isISOControl(c))){
            JOptionPane.showMessageDialog(null,"Only Numbers are Accepted");
            getToolkit().beep();
            evt.consume();
        }
        
    }//GEN-LAST:event_txtenoKeyTyped

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==java.awt.event.KeyEvent.VK_ENTER){
            if(txtname.getText().equals("")){
                JOptionPane.showMessageDialog(this,"Name needed to be filled");
            }
            else{
                txtcourse.requestFocus();
            }
        }
        //code for name textfield that accepts letter, whitespace and delete and backspace key only
        char c=evt.getKeyChar();
        //ISO control for edit operation(delete key and backspace key is allowed)
        if(!(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c))){
            JOptionPane.showMessageDialog(null,"Only Alphabets are Accepted");
            getToolkit().beep();
            txtname.setEditable(false);
        }
        else{
            txtname.setEditable(true);
        }
    }//GEN-LAST:event_txtnameKeyPressed

    private void txtnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyReleased
        // TODO add your handling code here:
        int position=txtname.getCaretPosition();
        txtname.setText(txtname.getText().toUpperCase());
        txtname.setCaretPosition(position);
    }//GEN-LAST:event_txtnameKeyReleased

    private void txtnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        //ISO control for edit operation(delete key and backspace key is allowed)
        if(!(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c))){
            JOptionPane.showMessageDialog(null,"Only Alphabets are Accepted");
            getToolkit().beep();
            txtname.setEditable(false);
        }
        else{
            txtname.setEditable(true);
        }
    }//GEN-LAST:event_txtnameKeyTyped

    private void txtcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcourseActionPerformed
        /* try {   // TODO add your handling code here:
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://D:\\PROJECT\\Login1\\Database12.accdb");
            String sql1="select * from Course_Master where Course_Name='"+txtcourse.getSelectedItem()+"'";
            pst1 = con.prepareStatement(sql1);
            rs1 = pst1.executeQuery();
            PreparedStatement pst = con.createStatement();
            rs= pst.executeQuery("select * from Course_Master");
            while(rs.next()){
                String Name=rs.getString("Course_Name");
                txtcourse.addItem("Name");
            }
            con.close();

        } catch(Exception e){

        }*/
    }//GEN-LAST:event_txtcourseActionPerformed

    private void txtcourseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcourseKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==java.awt.event.KeyEvent.VK_ENTER){
            if(txtcourse.getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(this,"Fees needed to be filled");
            }
            else{
                fees.requestFocus();
                txtsave1.requestFocus();
            }
        }
    }//GEN-LAST:event_txtcourseKeyPressed

    private void feesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_feesActionPerformed

    private void feesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_feesKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==java.awt.event.KeyEvent.VK_ENTER){
            if(fees.getText().equals("")){
                JOptionPane.showMessageDialog(this,"Fees needed to be filled");
            }
            else{
                //txtcash.requestFocus();
                //txtcard.requestFocus();
                //txtcheque.requestFocus();
                txtsave1.requestFocus();
            }
        }
    }//GEN-LAST:event_feesKeyPressed

    private void feesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_feesKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if(!(Character.isDigit(c)||Character.isISOControl(c))){
            JOptionPane.showMessageDialog(null,"Only Numbers are Accepted");
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_feesKeyTyped

    private void txtchequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtchequeActionPerformed
        // TODO add your handling code here:
        if(txtcheque.isSelected()){
            txtcash.setSelected(false);
            txtcard.setSelected(false);
        }
    }//GEN-LAST:event_txtchequeActionPerformed

    private void txtchequeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtchequeKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==java.awt.event.KeyEvent.VK_ENTER){
            txtsave1.requestFocus();
        }
    }//GEN-LAST:event_txtchequeKeyPressed

    private void txtcardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcardActionPerformed
        // TODO add your handling code here:
        if(txtcard.isSelected()){
            txtcash.setSelected(false);
            txtcheque.setSelected(false);
        }
    }//GEN-LAST:event_txtcardActionPerformed

    private void txtcardKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcardKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==java.awt.event.KeyEvent.VK_ENTER){
            txtsave1.requestFocus();
        }
    }//GEN-LAST:event_txtcardKeyPressed

    private void txtsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsaveActionPerformed
        // TODO add your handling code here:
        try {
            boolean b=false;
            if(txteno.getText().equals("")){
                b=false;
                JOptionPane.showMessageDialog(null,"Kindly enter the student eno");
                txteno.requestFocus();
            }
            else if(txtname.getText().equals("")){
                b=false;
                JOptionPane.showMessageDialog(null,"Kindly enter the student name");
                txtname.requestFocus();
            }
            else if(txtcourse.getSelectedItem().equals("")){
                b=false;
                JOptionPane.showMessageDialog(this,"Kindly enter the opted course");
                txtcourse.requestFocus();
            }
            else if(fees.getText().equals("")){
                b=false;
                JOptionPane.showMessageDialog(null,"Kindly enter the fees of the opted course");
                fees.requestFocus();
            }
            else{
                // TODO add your handling code here:
                //auto_eno();
                int response = JOptionPane.showConfirmDialog(this, "Do you really want to save the data?","Confirm",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
                if(response==JOptionPane.YES_OPTION)
                {
                    //boolean b=false;
                    if(txtname.getText().equals("")){
                        b=false;
                        JOptionPane.showMessageDialog(null,"Kindly enter the student name");
                        txtname.requestFocus();
                    }
                    else if(txteno.getText().equals("")){
                        b=false;
                        JOptionPane.showMessageDialog(null,"Kindly enter the student enrollment number");
                        txteno.requestFocus();
                    }
                    else if(txtcourse.getSelectedItem().equals("")){
                        b=false;
                        JOptionPane.showMessageDialog(this,"Kindly enter the opted course");
                        txtcourse.requestFocus();
                    }
                    else if(fees.getText().equals("")){
                        b=false;
                        JOptionPane.showMessageDialog(null,"Kindly enter the fees of the opted course");
                        fees.requestFocus();
                    }
                    else{
                        String enrol=txteno.getText();
                        pst=con.prepareStatement("select eno from dbs where eno=?");
                        pst.setString(1,enrol);
                        rs=pst.executeQuery();
                        if(rs.next()==true){
                            JOptionPane.showMessageDialog(this,"This data already Exsist");
                        }
                        else{
                            pst=con.prepareStatement("insert into dbs(name,eno,course,fees,mode)values(?,?,?,?,?)");
                            pst.setString(1, txtname.getText());
                            pst.setString(2, txteno.getText());
                            pst.setString(3, txtcourse.getSelectedItem().toString());
                            pst.setString(4, fees.getText());
                            if(txtcash.isSelected()){
                                pst.setString(5,txtcash.getText());
                            }
                            else if(txtcard.isSelected()){
                                pst.setString(5, txtcard.getText());
                            }
                            else{
                                pst.setString(5,txtcheque.getText());
                            }
                            pst.executeUpdate();
                            JOptionPane.showMessageDialog(this,"Record Saved Successfully...!");
                            JOptionPane.showMessageDialog(this,"Click add button to save the next record...!");
                            clearfields();
                            formss2_1 f2=new formss2_1();
                            f2.setVisible(true);
                            f2.pack();
                            f2.show();
                            dispose();
                        }
                    }
                }
                else if(response==JOptionPane.NO_OPTION){
                    form2_1 f21=new form2_1();
                    f21.setVisible(true);
                    f21.pack();
                    f21.show();
                    dispose();
                }
                else if(response==JOptionPane.CLOSED_OPTION){
                    JOptionPane.showMessageDialog(this,"Data is not saved");
                    clearfields();
                    form2 f2=new form2();
                    f2.setVisible(true);
                    f2.pack();
                    f2.show();
                    dispose();
                }
            }
        }
        catch (SQLException ex) {
        }
    }//GEN-LAST:event_txtsaveActionPerformed

    private void txtsaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsaveKeyPressed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            //auto_eno();
            /*boolean b=false;
            if(txtname.getText().equals("")){
                b=false;
                JOptionPane.showMessageDialog(null,"Kindly enter the student name");
                txtname.requestFocus();
            }
            else if(txteno.getText().equals("")){
                b=false;
                JOptionPane.showMessageDialog(null,"Kindly enter the student enrollment number");
                txteno.requestFocus();
            }
            else if(txtcourse.getSelectedItem().equals("")){
                b=false;
                JOptionPane.showMessageDialog(this,"Kindly enter the opted course");
                txtcourse.requestFocus();
            }
            else if(fees.getText().equals("")){
                b=false;
                JOptionPane.showMessageDialog(null,"Kindly enter the fees of the opted course");
                fees.requestFocus();
            }*/
            //else{
                int response = JOptionPane.showConfirmDialog(this, "Do you really want to delete the data?","Confirm",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
                if(response==JOptionPane.YES_OPTION)
                {
                    String enrol=txteno.getText();
                    pst=con.prepareStatement("select eno from dbs where eno=?");
                    pst.setString(1,enrol);
                    rs=pst.executeQuery();
                    if(rs.next()==true){
                        JOptionPane.showMessageDialog(this,"This data already Exsist");
                    }
                    else{
                        pst=con.prepareStatement("insert into dbs(name,eno,course,fees,mode)values(?,?,?,?,?)");
                        pst.setString(1, txtname.getText());
                        pst.setString(2, txteno.getText());
                        pst.setString(3, txtcourse.getSelectedItem().toString());
                        pst.setString(4, fees.getText());
                        if(txtcash.isSelected()){
                            pst.setString(5,txtcash.getText());
                        }
                        else if(txtcard.isSelected()){
                            pst.setString(5, txtcard.getText());
                        }
                        else{
                            pst.setString(5,txtcheque.getText());
                        }
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(this,"Record Saved Successfully...!");
                        JOptionPane.showMessageDialog(this,"Click add button to save the next record...!");
                        clearfields();
                        formss2_1 f2=new formss2_1();
                        f2.setVisible(true);
                        f2.pack();
                        f2.show();
                        dispose();
                    }
                }
                else if(response==JOptionPane.NO_OPTION){
                    String enrol=txteno.getText();
                    pst=con.prepareStatement("select eno from dbs where eno=?");
                    pst.setString(1,enrol);
                    rs=pst.executeQuery();

                }
                else if(response==JOptionPane.CLOSED_OPTION){
                    JOptionPane.showMessageDialog(this,"Data is not saved");
                    clearfields();
                    formss2 f2=new formss2();
                    f2.setVisible(true);
                    f2.pack();
                    f2.show();
                    dispose();
                }
            }
            catch (SQLException ex) {
            }
    }//GEN-LAST:event_txtsaveKeyPressed

    private void txtsave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsave1ActionPerformed
        // TODO add your handling code here:
        try {
            boolean b=false;
            if(txteno.getText().equals("")){
                b=false;
                JOptionPane.showMessageDialog(null,"Kindly enter the student eno");
                txteno.requestFocus();
            }
            else if(txtname.getText().equals("")){
                b=false;
                JOptionPane.showMessageDialog(null,"Kindly enter the student name");
                txtname.requestFocus();
            }
            else if(txtcourse.getSelectedItem().equals("")){
                b=false;
                JOptionPane.showMessageDialog(this,"Kindly enter the opted course");
                txtcourse.requestFocus();
            }
            else if(fees.getText().equals("")){
                b=false;
                JOptionPane.showMessageDialog(null,"Kindly enter the fees of the opted course");
                fees.requestFocus();
            }
            else{
                // TODO add your handling code here:
                //auto_eno();
                int response = JOptionPane.showConfirmDialog(this, "Do you really want to save the data?","Confirm",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
                if(response==JOptionPane.YES_OPTION)
                {
                    //boolean b=false;
                    if(txtname.getText().equals("")){
                        b=false;
                        JOptionPane.showMessageDialog(null,"Kindly enter the student name");
                        txtname.requestFocus();
                    }
                    else if(txteno.getText().equals("")){
                        b=false;
                        JOptionPane.showMessageDialog(null,"Kindly enter the student enrollment number");
                        txteno.requestFocus();
                    }
                    else if(txtcourse.getSelectedItem().equals("")){
                        b=false;
                        JOptionPane.showMessageDialog(this,"Kindly enter the opted course");
                        txtcourse.requestFocus();
                    }
                    else if(fees.getText().equals("")){
                        b=false;
                        JOptionPane.showMessageDialog(null,"Kindly enter the fees of the opted course");
                        fees.requestFocus();
                    }
                    else{
                        String enrol=txteno.getText();
                        pst=con.prepareStatement("select eno from dbs where eno=?");
                        pst.setString(1,enrol);
                        rs=pst.executeQuery();
                        if(rs.next()==true){
                            JOptionPane.showMessageDialog(this,"This data already Exsist");
                        }
                        else{
                            pst=con.prepareStatement("insert into dbs(name,eno,course,fees,mode)values(?,?,?,?,?)");
                            pst.setString(1, txtname.getText());
                            pst.setString(2, txteno.getText());
                            pst.setString(3, txtcourse.getSelectedItem().toString());
                            pst.setString(4, fees.getText());
                            if(txtcash.isSelected()){
                                pst.setString(5,txtcash.getText());
                            }
                            else if(txtcard.isSelected()){
                                pst.setString(5, txtcard.getText());
                            }
                            else{
                                pst.setString(5,txtcheque.getText());
                            }
                            pst.executeUpdate();
                            JOptionPane.showMessageDialog(this,"Record Saved Successfully...!");
                        JOptionPane.showMessageDialog(this,"Click save button to save the next record...!");
                        clearfields();
                        formss2_1 f2=new formss2_1();
                        f2.setVisible(true);
                        f2.pack();
                        f2.show();
                        dispose();
                        }
                    }
                }
                else if(response==JOptionPane.NO_OPTION){
                    formss2_1 f21=new formss2_1();
                    f21.setVisible(true);
                    f21.pack();
                    f21.show();
                    dispose();
                }
                else if(response==JOptionPane.CLOSED_OPTION){
                    JOptionPane.showMessageDialog(this,"Data is not saved");
                    clearfields();
                    formss2 f2=new formss2();
                    f2.setVisible(true);
                    f2.pack();
                    f2.show();
                    dispose();
                }
            }
        }
        catch (SQLException ex) {
        }
    }//GEN-LAST:event_txtsave1ActionPerformed

    private void txtsave1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsave1KeyPressed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            //auto_eno();
            boolean b=false;
            if(txtname.getText().equals("")){
                b=false;
                JOptionPane.showMessageDialog(null,"Kindly enter the student name");
                txtname.requestFocus();
            }
            else if(txteno.getText().equals("")){
                b=false;
                JOptionPane.showMessageDialog(null,"Kindly enter the student enrollment number");
                txteno.requestFocus();
            }
            else if(txtcourse.getSelectedItem().equals("")){
                b=false;
                JOptionPane.showMessageDialog(this,"Kindly enter the opted course");
                txtcourse.requestFocus();
            }
            else if(fees.getText().equals("")){
                b=false;
                JOptionPane.showMessageDialog(null,"Kindly enter the fees of the opted course");
                fees.requestFocus();
            }
            //else{
                int response = JOptionPane.showConfirmDialog(this, "Do you really want to delete the data?","Confirm",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
                if(response==JOptionPane.YES_OPTION)
                {
                    String enrol=txteno.getText();
                    pst=con.prepareStatement("select eno from dbs where eno=?");
                    pst.setString(1,enrol);
                    rs=pst.executeQuery();
                    if(rs.next()==true){
                        JOptionPane.showMessageDialog(this,"This data already Exsist");
                    }
                    else{
                        pst=con.prepareStatement("insert into dbs(name,eno,course,fees,mode)values(?,?,?,?,?)");
                        pst.setString(1, txtname.getText());
                        pst.setString(2, txteno.getText());
                        pst.setString(3, txtcourse.getSelectedItem().toString());
                        pst.setString(4, fees.getText());
                        if(txtcash.isSelected()){
                            pst.setString(5,txtcash.getText());
                        }
                        else if(txtcard.isSelected()){
                            pst.setString(5, txtcard.getText());
                        }
                        else{
                            pst.setString(5,txtcheque.getText());
                        }
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(this,"Record Saved Successfully...!");
                        JOptionPane.showMessageDialog(this,"Click save button to save the next record...!");
                        clearfields();
                        formss2_1 f2=new formss2_1();
                        f2.setVisible(true);
                        f2.pack();
                        f2.show();
                        dispose();
                    }
                }
                else if(response==JOptionPane.NO_OPTION){
                    String enrol=txteno.getText();
                    pst=con.prepareStatement("select eno from dbs where eno=?");
                    pst.setString(1,enrol);
                    rs=pst.executeQuery();

                }
                else if(response==JOptionPane.CLOSED_OPTION){
                    JOptionPane.showMessageDialog(this,"Data is not deleted");
                    clearfields();
                    formss2 f2=new formss2();
                    f2.setVisible(true);
                    f2.pack();
                    f2.show();
                    dispose();
                }
            }
            catch (SQLException ex) {
            }
    }//GEN-LAST:event_txtsave1KeyPressed

    private void txtclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclearActionPerformed
        // TODO add your handling code here:
        cf();

    }//GEN-LAST:event_txtclearActionPerformed

    private void txtbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbackActionPerformed
        // TODO add your handling code here:
        formss2 f2=new formss2();
        f2.setVisible(true);
        f2.pack();
        f2.show();
        dispose();
    }//GEN-LAST:event_txtbackActionPerformed

    private void txtback1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtback1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtback1ActionPerformed

    private void l3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l3MouseClicked
        // TODO add your handling code here:
        logindb1 lb=new logindb1();
        lb.setVisible(true);
        lb.pack();
        lb.show();
        dispose();
    }//GEN-LAST:event_l3MouseClicked

    private void txtcashKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcashKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==java.awt.event.KeyEvent.VK_ENTER){
            txtsave1.requestFocus();
        }
    }//GEN-LAST:event_txtcashKeyPressed

    private void txtcashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcashActionPerformed
        // TODO add your handling code here
        if(txtcash.isSelected()){
            txtcard.setSelected(false);
            txtcheque.setSelected(false);
        }
    }//GEN-LAST:event_txtcashActionPerformed

    private void txtcoursePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_txtcoursePopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        String item=(String) txtcourse.getSelectedItem();
        String sql1="select Course_Fees from Course_Master where Course_Name=?";
        
        try{
            pst=con.prepareStatement(sql1);
            pst.setString(1, item);
            rs=pst.executeQuery();
            
            if(rs.next()){
                fees.setText(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(formss2_1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtcoursePopupMenuWillBecomeInvisible

    private void feesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feesMousePressed
        // TODO add your handling code here:
        if(fees.isRequestFocusEnabled()){
            JOptionPane.showMessageDialog(this,"Fees cannot be edited");
        }
    }//GEN-LAST:event_feesMousePressed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try{
            con = DriverManager.getConnection("jdbc:ucanaccess://D:\\PROJECT\\Login1\\Database12.accdb");
            String sql="select max(eno) from dbs order by max(eno) desc ";
            st=con.createStatement();
            rs=st.executeQuery(sql);
            if(rs.next()){
                lastid=rs.getInt(1);
                n=lastid+1;
                txteno.setText(Integer.toString(n));
                System.out.println("Number is"+ n);
                //String n1=Integer.toString(n);
                
            }
             
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_formWindowOpened

    public void clearfields(){
        txtname.setText("");
        //txteno.setText("");
        txtcourse.setSelectedIndex(-1);
        fees.setText("");
        txtcash.setSelected(false);
        txtcard.setSelected(false);
        txtcheque.setSelected(false);
        //txtupdate.setVisible(false);
        //txtdelete2.setVisible(false);
        
    }
    public void cf(){
        txtname.setText("");
        //txteno.setText("");
        txtcourse.setSelectedIndex(-1);
        fees.setText("");
        txtcash.setSelected(true);
        txtcard.setSelected(false);
        txtcheque.setSelected(false);
        txtsave.setVisible(true);
        //txtmodify.setVisible(true);
        //txtupdate.setVisible(false);
        //txtdelete2.setVisible(false);
        //txtsearch.setVisible(true);
        
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
            java.util.logging.Logger.getLogger(formss2_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formss2_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formss2_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formss2_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*String prevId="C10001";
        String data=prevId.replace("C","");
        int num=Integer.parseInt(data);
        num=num+1;*/
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formss2_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fees;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel l3;
    private javax.swing.JButton txtback;
    private javax.swing.JButton txtback1;
    private javax.swing.JRadioButton txtcard;
    private javax.swing.JRadioButton txtcash;
    private javax.swing.JRadioButton txtcheque;
    private javax.swing.JButton txtclear;
    private javax.swing.JLabel txtclose;
    private javax.swing.JComboBox<String> txtcourse;
    private javax.swing.JTextField txteno;
    private javax.swing.JLabel txtmin;
    private javax.swing.JTextField txtname;
    private javax.swing.JButton txtsave;
    private javax.swing.JButton txtsave1;
    // End of variables declaration//GEN-END:variables

    private void connectDB() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
