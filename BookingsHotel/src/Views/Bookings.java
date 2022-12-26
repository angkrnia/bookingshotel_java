/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Views;

import Core.Database;
import UIResource.ScrollBar;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author angga
 */
public final class Bookings extends javax.swing.JFrame {

    /**
     * Creates new form Bookings
     */
    
    private final Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    private final DefaultTableModel tb_model;
    
    public Bookings() {
        initComponents();
        conn = Database.Connect();
        tb_model = (DefaultTableModel) tablebookings.getModel();
        getBookings();
        
        // mengambil ukuran layar
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
        // membuat titik x dan y
        int x = layar.width / 2  - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;
        this.setLocation(x, y);
        
        //ini buat edit scroll bar
        spTable.setVerticalScrollBar(new ScrollBar());
        spTable.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        spTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
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
        cari_input = new javax.swing.JTextField();
        cari_btn = new javax.swing.JButton();
        newbooking = new javax.swing.JButton();
        btn_stts_delete = new javax.swing.JButton();
        btn_stts_cancel = new javax.swing.JButton();
        btn_stts_checkin = new javax.swing.JButton();
        btn_stts_checkout = new javax.swing.JButton();
        spTable = new javax.swing.JScrollPane();
        tablebookings = new UIResource.Table();
        jPanel4 = new javax.swing.JPanel();
        phome = new javax.swing.JPanel();
        home = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BOOKINGS");
        setMinimumSize(new java.awt.Dimension(900, 500));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(cari_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 157, 30));

        cari_btn.setBackground(new java.awt.Color(230, 155, 6));
        cari_btn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cari_btn.setForeground(new java.awt.Color(255, 255, 255));
        cari_btn.setText("CARI");
        cari_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cari_btnActionPerformed(evt);
            }
        });
        jPanel1.add(cari_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, -1, -1));

        newbooking.setBackground(new java.awt.Color(230, 155, 6));
        newbooking.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        newbooking.setForeground(new java.awt.Color(255, 255, 255));
        newbooking.setText("BOOKING BARU");
        newbooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newbookingActionPerformed(evt);
            }
        });
        jPanel1.add(newbooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, -1));

        btn_stts_delete.setBackground(new java.awt.Color(230, 155, 6));
        btn_stts_delete.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_stts_delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_stts_delete.setText("HAPUS");
        btn_stts_delete.setBorder(null);
        btn_stts_delete.setMaximumSize(new java.awt.Dimension(100, 27));
        btn_stts_delete.setMinimumSize(new java.awt.Dimension(100, 27));
        btn_stts_delete.setPreferredSize(new java.awt.Dimension(100, 27));
        btn_stts_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_stts_deleteActionPerformed(evt);
            }
        });
        jPanel1.add(btn_stts_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        btn_stts_cancel.setBackground(new java.awt.Color(230, 155, 6));
        btn_stts_cancel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_stts_cancel.setForeground(new java.awt.Color(255, 255, 255));
        btn_stts_cancel.setText("CANCEL");
        btn_stts_cancel.setMaximumSize(new java.awt.Dimension(100, 27));
        btn_stts_cancel.setMinimumSize(new java.awt.Dimension(100, 27));
        btn_stts_cancel.setPreferredSize(new java.awt.Dimension(100, 27));
        btn_stts_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_stts_cancelActionPerformed(evt);
            }
        });
        jPanel1.add(btn_stts_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, -1, -1));

        btn_stts_checkin.setBackground(new java.awt.Color(230, 155, 6));
        btn_stts_checkin.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_stts_checkin.setForeground(new java.awt.Color(255, 255, 255));
        btn_stts_checkin.setText("Check In");
        btn_stts_checkin.setMaximumSize(new java.awt.Dimension(105, 27));
        btn_stts_checkin.setMinimumSize(new java.awt.Dimension(105, 27));
        btn_stts_checkin.setPreferredSize(new java.awt.Dimension(105, 27));
        btn_stts_checkin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_stts_checkinActionPerformed(evt);
            }
        });
        jPanel1.add(btn_stts_checkin, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, -1, -1));

        btn_stts_checkout.setBackground(new java.awt.Color(230, 155, 6));
        btn_stts_checkout.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_stts_checkout.setForeground(new java.awt.Color(255, 255, 255));
        btn_stts_checkout.setText("Check Out");
        btn_stts_checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_stts_checkoutActionPerformed(evt);
            }
        });
        jPanel1.add(btn_stts_checkout, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 390, -1, -1));

        tablebookings.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Check In", "Check Out", "Adult", "Children", "Room", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablebookings.setFillsViewportHeight(true);
        tablebookings.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tablebookings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablebookingsMouseClicked(evt);
            }
        });
        spTable.setViewportView(tablebookings);

        jPanel1.add(spTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 860, 300));

        jPanel4.setBackground(new java.awt.Color(230, 155, 6));
        jPanel4.setPreferredSize(new java.awt.Dimension(940, 60));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        phome.setBackground(new java.awt.Color(230, 155, 6));
        phome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phomeMouseClicked(evt);
            }
        });
        phome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        home.setBackground(new java.awt.Color(255, 255, 255));
        home.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home.setText("Home");
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                homeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                homeMouseReleased(evt);
            }
        });
        phome.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 60));

        jPanel4.add(phome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 60));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("List Booking");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_stts_checkinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_stts_checkinActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tablebookings.getSelectedRow();
        if(selectedRowIndex < 0){
           JOptionPane.showMessageDialog(null, "Silahkan pilih tabel dulu...","Error",JOptionPane.ERROR_MESSAGE);
           return;
        }
        
        String id = tb_model.getValueAt(selectedRowIndex, 0).toString();
        String nama = tb_model.getValueAt(selectedRowIndex, 1).toString();
        
        int del = JOptionPane.showConfirmDialog(null, "Apakah anda yakin?", nama, JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(del != 0){
            return;
        }
        
        try {
            String query = "UPDATE bookings SET status=? WHERE id=?";
            ps = conn.prepareStatement(query);
            ps.setString(1, "Checking In");
            ps.setString(2, id);
            if(ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "Guest "+nama+" berhasil Check In");
                getBookings();
            }
           
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btn_stts_checkinActionPerformed

    private void newbookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newbookingActionPerformed
        // TODO add your handling code here:
        dispose();
        NewBooking nb = new NewBooking();
        nb.setVisible(true);
    }//GEN-LAST:event_newbookingActionPerformed

    private void btn_stts_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_stts_deleteActionPerformed
        // TODO add your handling code here:
        int row = tablebookings.getSelectedRow();
        if(row < 0){
            return;
        }
        String value = tb_model.getValueAt(row, 0).toString();
        // CONFIRM DELETE
        int del = JOptionPane.showConfirmDialog(null, "Apakah anda yakin?", value, JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(del != 0){
            return;
        }
        
        try {
            String query = "DELETE FROM bookings WHERE id=?";
            ps = conn.prepareStatement(query);
            ps.setString(1, value);
            if(ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
                getBookings();
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_stts_deleteActionPerformed

    private void btn_stts_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_stts_cancelActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tablebookings.getSelectedRow();
        if(selectedRowIndex < 0){
           JOptionPane.showMessageDialog(null, "Silahkan pilih tabel dulu...","Error",JOptionPane.ERROR_MESSAGE);
           return;
        }
        
        
        String id = tb_model.getValueAt(selectedRowIndex, 0).toString();
        String nama = tb_model.getValueAt(selectedRowIndex, 1).toString();
        
        int del = JOptionPane.showConfirmDialog(null, "Apakah anda yakin?", nama, JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(del != 0){
            return;
        }
        
        try {
            String query = "UPDATE bookings SET status=? WHERE id=?";
            ps = conn.prepareStatement(query);
            ps.setString(1, "Canceled");
            ps.setString(2, id);
            if(ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "Guest "+nama+" Cancel Booking","Canceled", JOptionPane.WARNING_MESSAGE);
                getBookings();
            }
           
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_stts_cancelActionPerformed

    private void btn_stts_checkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_stts_checkoutActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tablebookings.getSelectedRow();
        if(selectedRowIndex < 0){
           JOptionPane.showMessageDialog(null, "Silahkan pilih tabel dulu...","Error",JOptionPane.ERROR_MESSAGE);
           return;
        }
        
        String id = tb_model.getValueAt(selectedRowIndex, 0).toString();
        
        Invoice iv = new Invoice(id);
        dispose();
        iv.setVisible(true);
    }//GEN-LAST:event_btn_stts_checkoutActionPerformed

    private void cari_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cari_btnActionPerformed
        // TODO add your handling code here:
        String keyword = cari_input.getText();
        if(keyword.equals("")){
            JOptionPane.showMessageDialog(null, "Data search masih kosong!","Error",JOptionPane.ERROR_MESSAGE);
            getBookings();
            return; // TO STOP EXECUTE CODE BELOW
        }
        // LOGIC
        try {
            String query = "SELECT * FROM bookings b LEFT JOIN rooms r ON r.id=b.roomId WHERE b.guestName LIKE ? OR r.roomNumber LIKE ?";
            ps = conn.prepareStatement(query);
            ps.setString(1, "%"+ keyword +"%");
            ps.setString(2, "%"+ keyword +"%");
            rs = ps.executeQuery();
            tb_model.setNumRows(0);
            while(rs.next()){
                Object data[] = {
                    rs.getString("id"),
                    rs.getString("guestName"),
                    rs.getString("checkInDate"),
                    rs.getString("checkOutDate"),
                    rs.getInt("numberOfAdults"),
                    rs.getInt("numberOfChildrens"),
                    rs.getInt("roomNumber"),
                    rs.getString("status"),
                };
                tb_model.addRow(data);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cari_btnActionPerformed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
        //Home ad = new Home();
        //ad.setVisible(true);
        dispose();
    }//GEN-LAST:event_homeMouseClicked

    private void homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseEntered
        // TODO add your handling code here:
        home.setForeground(new java.awt.Color(230,155,6));
        phome.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_homeMouseEntered

    private void homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseExited
        // TODO add your handling code here:
        home.setForeground(new java.awt.Color(255, 255, 255));
        phome.setBackground(new java.awt.Color(230,155,6));
    }//GEN-LAST:event_homeMouseExited

    private void homeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMousePressed
        // TODO add your handling code here:
        phome.setBackground(Color.orange);
    }//GEN-LAST:event_homeMousePressed

    private void homeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseReleased
        // TODO add your handling code here:
        phome.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_homeMouseReleased

    private void phomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phomeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_phomeMouseClicked

    private void tablebookingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablebookingsMouseClicked
        // TODO add your handling code here:
        // Menampilkan button checkin checkout sesuai status
        int selectedRowIndex = tablebookings.getSelectedRow();
        if(selectedRowIndex >= 0){
            btn_stts_delete.setVisible(true);            
            checkStatus(tb_model.getValueAt(selectedRowIndex, 7).toString());
        }
    }//GEN-LAST:event_tablebookingsMouseClicked
    
    public void checkStatus(String status){
        switch(status){
            case "Booked":
                btn_stts_checkin.setVisible(true);
                btn_stts_checkout.setVisible(false);
                btn_stts_cancel.setVisible(true);
                break;
            case "Checking In":
                btn_stts_checkin.setVisible(false);
                btn_stts_checkout.setVisible(true);
                btn_stts_cancel.setVisible(false);
                break;
            default:
                btn_stts_checkin.setVisible(false);
                btn_stts_checkout.setVisible(false);
                btn_stts_cancel.setVisible(false);
                btn_stts_delete.setVisible(true);
                break;
        }
    }
    /**
     * @param length
     * @return 
     */
    
    public String getRandomString(int length){
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for(int i = 0; i < length; i++){
            int index = random.nextInt(str.length());
            char randomChar = str.charAt(index);
            sb.append(randomChar);
        }
        String randomString = sb.toString();
        return randomString;
    }
    
    public void getBookings(){
        tb_model.setNumRows(0);
        checkStatus("");
        btn_stts_checkin.setVisible(false);
        btn_stts_checkout.setVisible(false);
        btn_stts_cancel.setVisible(false);
        btn_stts_delete.setVisible(false);
        try {
            Statement stm = conn.createStatement();
            rs = stm.executeQuery("SELECT bookings.*,rooms.roomNumber as room FROM bookings LEFT JOIN rooms ON bookings.roomId=rooms.id ORDER BY id DESC");
            while(rs.next()){
                Object data[] = {
                    rs.getString("id"),
                    rs.getString("guestName"),
                    rs.getString("checkInDate"),
                    rs.getString("checkOutDate"),
                    rs.getInt("numberOfAdults"),
                    rs.getInt("numberOfChildrens"),
                    rs.getInt("room"),
                    rs.getString("status"),
                };
                tb_model.addRow(data);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
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
            java.util.logging.Logger.getLogger(Bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Bookings().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_stts_cancel;
    private javax.swing.JButton btn_stts_checkin;
    private javax.swing.JButton btn_stts_checkout;
    private javax.swing.JButton btn_stts_delete;
    private javax.swing.JButton cari_btn;
    private javax.swing.JTextField cari_input;
    private javax.swing.JLabel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton newbooking;
    private javax.swing.JPanel phome;
    private javax.swing.JScrollPane spTable;
    private UIResource.Table tablebookings;
    // End of variables declaration//GEN-END:variables
}
