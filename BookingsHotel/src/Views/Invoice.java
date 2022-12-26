/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Views;

import Core.Database;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author angga
 */
public final class Invoice extends javax.swing.JFrame {

    /**
     * Creates new form Invoice
     */
    
    public String id;
    public int nights;
    public int total;
    
    private final Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public Invoice(String id) {
        initComponents();
        conn = Database.Connect();
        this.id = id;
        getInfoBooking();
        
        // mengambil ukuran layar
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
        // membuat titik x dan y
        int x = layar.width / 2  - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;
        this.setLocation(x, y);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        guest = new javax.swing.JLabel();
        adults = new javax.swing.JLabel();
        childrens = new javax.swing.JLabel();
        checkin = new javax.swing.JLabel();
        checkout = new javax.swing.JLabel();
        malam = new javax.swing.JLabel();
        t = new javax.swing.JLabel();
        btn_stts_checkout = new javax.swing.JButton();
        SERVICE = new javax.swing.JLabel();
        services = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        room = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Invoice");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("GUEST NAME                 :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 160, 20));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("ADULTS CAPACITY          :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 160, 20));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("CHILDREN CAPACITY     :");
        jLabel4.setPreferredSize(new java.awt.Dimension(157, 19));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 160, 20));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText("CHECKING IN                :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 160, 20));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setText("CHECKING OUT             :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 160, 20));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setText("NIGHTS                           :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 160, 20));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel8.setText("TOTAL");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 60, -1));

        guest.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        guest.setPreferredSize(new java.awt.Dimension(160, 19));
        jPanel1.add(guest, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 200, 20));

        adults.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel1.add(adults, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 200, 20));

        childrens.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel1.add(childrens, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 200, 20));

        checkin.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel1.add(checkin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 200, 20));

        checkout.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel1.add(checkout, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 200, 20));

        malam.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel1.add(malam, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 200, 20));

        t.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jPanel1.add(t, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 200, 20));

        btn_stts_checkout.setBackground(new java.awt.Color(230, 155, 6));
        btn_stts_checkout.setFont(new java.awt.Font("Fira Code", 0, 12)); // NOI18N
        btn_stts_checkout.setForeground(new java.awt.Color(255, 255, 255));
        btn_stts_checkout.setText("Confirm");
        btn_stts_checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_stts_checkoutActionPerformed(evt);
            }
        });
        jPanel1.add(btn_stts_checkout, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 128, 33));

        SERVICE.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        SERVICE.setText("SERVICES                       :");
        jPanel1.add(SERVICE, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 160, 20));

        services.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        services.setText("0");
        jPanel1.add(services, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 200, 20));

        cancel.setBackground(new java.awt.Color(255, 0, 0));
        cancel.setFont(new java.awt.Font("Fira Code", 0, 12)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 128, 33));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 420, 350));

        jPanel4.setBackground(new java.awt.Color(230, 155, 6));
        jPanel4.setPreferredSize(new java.awt.Dimension(940, 60));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        room.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        room.setForeground(new java.awt.Color(255, 255, 255));
        room.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        room.setText("000");
        jPanel4.add(room, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 100, 60));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Checking Out Room ");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 60));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_stts_checkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_stts_checkoutActionPerformed
        // TODO add your handling code here:
        try {
            String query = "UPDATE bookings SET status=? WHERE id=?";
            ps = conn.prepareStatement(query);
            ps.setString(1, "Checking Out");
            ps.setString(2, id);
            if(ps.executeUpdate() > 0){
                String toInvoice = "INSERT INTO invoice VALUES(null,?,?,?)";
                ps = conn.prepareStatement(toInvoice);
                ps.setInt(1, nights);
                ps.setInt(2, total);
                ps.setString(3, id);
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null, "Check Out Success!");
                    dispose();
                    Bookings b = new Bookings();
                    b.setVisible(true);
                }
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_stts_checkoutActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        dispose();
        Bookings b = new Bookings();
        b.setVisible(true);
    }//GEN-LAST:event_cancelActionPerformed
    
    public void getInfoBooking(){
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        int price = 0;
        try {
            String query = "SELECT *, b.checkOutDate-b.checkInDate as t_nights FROM bookings b LEFT JOIN rooms r ON r.id=b.roomId WHERE b.id = ?";
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            if(rs.next()){
                this.nights = rs.getInt("t_nights");
                price += rs.getInt("price");
                room.setText(rs.getString("roomNumber"));
                guest.setText(rs.getString("guestName"));
                checkin.setText(rs.getString("checkInDate"));
                checkout.setText(rs.getString("checkOutDate"));
                adults.setText(rs.getString("numberOfAdults"));
                childrens.setText(rs.getString("numberOfChildrens"));
                malam.setText(this.nights+" x "+ currencyFormatter.format(price));
                int total_service = getTotalServices(id);
                t.setText(currencyFormatter.format((this.nights*price)+total_service));
                services.setText(""+currencyFormatter.format(total_service));
                /* Set Variabel */
                this.total = this.nights*price;
                /* End */
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public int getTotalServices(String bookingId){
        String query = "SELECT SUM(total) AS total FROM bookingservice bs " +
                    "INNER JOIN services s ON s.id=bs.serviceId " +
                    "WHERE bs.bookingId=?";
        int total = 0;
        try {
            ps = conn.prepareStatement(query);
            ps.setString(1, bookingId);
            rs = ps.executeQuery();
            if(rs.next()){
                total +=  rs.getInt("total");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        return total;
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SERVICE;
    private javax.swing.JLabel adults;
    private javax.swing.JButton btn_stts_checkout;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel checkin;
    private javax.swing.JLabel checkout;
    private javax.swing.JLabel childrens;
    private javax.swing.JLabel guest;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel malam;
    private javax.swing.JLabel room;
    private javax.swing.JLabel services;
    private javax.swing.JLabel t;
    // End of variables declaration//GEN-END:variables
}