
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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class NewBooking extends javax.swing.JFrame {
    
    private final Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    private final DefaultTableModel tb_model;
    
    public NewBooking() {
        initComponents();
        conn = (Connection) Database.Connect();
        booking_button.setVisible(false);
        tb_model = (DefaultTableModel) bookingstable.getModel();
        
        // mengambil ukuran layar
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
        // membuat titik x dan y
        int x = layar.width / 2  - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;
        this.setLocation(x, y);
        
        spTable.setVerticalScrollBar(new ScrollBar());
        spTable.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        spTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        room_available = new javax.swing.JPanel();
        getroom = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        adultc = new javax.swing.JTextField();
        childrenc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        guest = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        booking_button = new javax.swing.JButton();
        checkin = new com.toedter.calendar.JDateChooser();
        checkout = new com.toedter.calendar.JDateChooser();
        spTable = new javax.swing.JScrollPane();
        bookingstable = new UIResource.Table();
        jPanel4 = new javax.swing.JPanel();
        phome = new javax.swing.JPanel();
        home = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("NEW BOOKINGS");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        room_available.setBackground(new java.awt.Color(255, 255, 255));
        room_available.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        getroom.setBackground(new java.awt.Color(230, 155, 6));
        getroom.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        getroom.setForeground(new java.awt.Color(255, 255, 255));
        getroom.setText("Get Available Room");
        getroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getroomActionPerformed(evt);
            }
        });
        room_available.add(getroom, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 190, 34));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setText("Check In Date");
        room_available.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Check Out Date");
        room_available.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        adultc.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        room_available.add(adultc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 132, 29));

        childrenc.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        room_available.add(childrenc, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 134, 29));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Adult Capacity");
        room_available.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Children Capacity");
        room_available.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        guest.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        room_available.add(guest, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 200, 29));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText("Guest Name");
        room_available.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, -1));

        booking_button.setBackground(new java.awt.Color(230, 155, 6));
        booking_button.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        booking_button.setForeground(new java.awt.Color(255, 255, 255));
        booking_button.setText("Booked!");
        booking_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booking_buttonActionPerformed(evt);
            }
        });
        room_available.add(booking_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 142, 34));

        checkin.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        room_available.add(checkin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 159, 25));

        checkout.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        room_available.add(checkout, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 149, 25));

        bookingstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Room", "Adult Capacity", "Child Capacity", "Price"
            }
        ));
        bookingstable.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        bookingstable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookingstableMouseClicked(evt);
            }
        });
        spTable.setViewportView(bookingstable);

        room_available.add(spTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 560, 180));

        getContentPane().add(room_available, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 600, 420));

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
        home.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home.setText("<");
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
        phome.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 60));

        jPanel4.add(phome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 60));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Add New Booking");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 60));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void getroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getroomActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd");
        Date checkindate = checkin.getDate();
        Date checkoutdate = checkout.getDate();
        String adult_c = adultc.getText();
        String children_c = childrenc.getText();
        if(children_c.isEmpty() || checkindate == null || checkoutdate == null || adult_c.isEmpty() ){
            JOptionPane.showMessageDialog(null, "Input tidak boleh kosong","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        /*
            Lakukan Validasi Tanggal Check In dan Check Out,
            Tanggal Check Out TIDAK BOLEH Sebelum Tanggal Check In
        */
        String query = "SELECT rooms.* FROM rooms WHERE "
                + "rooms.adultCapacity >= ? and rooms.childrenCapacity >= ? "
                + "AND rooms.id NOT IN (SELECT bookings.roomId FROM bookings "
                + "WHERE NOT (bookings.checkOutDate < ? OR bookings.checkInDate > ? OR bookings.status = ?)) "
                + "ORDER BY rooms.price";
        try {
            ps = conn.prepareStatement(query);
            ps.setString(1, adult_c);
            ps.setString(2, children_c);
            ps.setString(3, SDF.format(checkindate));
            ps.setString(4, SDF.format(checkoutdate));
            ps.setString(5, "Canceled");
            rs = ps.executeQuery();
            tb_model.setNumRows(0);
            int rows = 0;
            while(rs.next()){
                Object data[] = {
                    rs.getString("id"),
                    rs.getInt("roomNumber"),
                    rs.getInt("adultCapacity"),
                    rs.getInt("childrenCapacity"),
                    rs.getInt("price")
                };
                tb_model.addRow(data);
                rows++;
            }
            if(rows==0){
                JOptionPane.showMessageDialog(null, "Tidak ada room yang tersedia!","Sorry...",JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_getroomActionPerformed

    private void booking_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booking_buttonActionPerformed
        // TODO add your handling code here:
        int row = bookingstable.getSelectedRow();
        if(row < 0 || guest.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Nama tamu harap diisi & silahkan pilih room");
            return;
        }
        SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd");
        String room = tb_model.getValueAt(row, 0).toString();
        Date checkindate = checkin.getDate();
        Date checkoutdate = checkout.getDate();
        String adult_c = adultc.getText();
        String children_c = childrenc.getText();
        String nama = guest.getText();
        if(children_c.isEmpty() || checkindate == null || checkoutdate == null || adult_c.isEmpty() || nama.isEmpty()){
            JOptionPane.showMessageDialog(null, "Input tidak boleh kosong","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        /*
            Lakukan Validasi Tanggal Check In dan Check Out,
            Tanggal Check Out TIDAK BOLEH Sebelum Tanggal Check In
        */
        String query = "INSERT INTO bookings VALUES(?,?,?,?,?,?,?,?)";
        try {
            ps = conn.prepareStatement(query);
            ps.setString(1, "B-"+getRandomString(5));
            ps.setString(2, nama);
            ps.setString(3, SDF.format(checkindate));
            ps.setString(4, SDF.format(checkoutdate));
            ps.setInt(5, Integer.parseInt(adult_c));
            ps.setInt(6, Integer.parseInt(children_c));
            ps.setString(7, "Booked");
            ps.setString(8, room);
            if(ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "Booked success!");
                Bookings b = new Bookings();
                b.setVisible(true);
                dispose();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_booking_buttonActionPerformed
    
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
    
    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
        Bookings ad = new Bookings();
        ad.setVisible(true);
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

    private void bookingstableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingstableMouseClicked
        // TODO add your handling code here:
        int selectedRowIndex = bookingstable.getSelectedRow();
        if(selectedRowIndex >= 0){
            booking_button.setVisible(true);
        }
    }//GEN-LAST:event_bookingstableMouseClicked

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
            java.util.logging.Logger.getLogger(NewBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new NewBooking().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adultc;
    private javax.swing.JButton booking_button;
    private UIResource.Table bookingstable;
    private com.toedter.calendar.JDateChooser checkin;
    private com.toedter.calendar.JDateChooser checkout;
    private javax.swing.JTextField childrenc;
    private javax.swing.JButton getroom;
    private javax.swing.JTextField guest;
    private javax.swing.JLabel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel phome;
    private javax.swing.JPanel room_available;
    private javax.swing.JScrollPane spTable;
    // End of variables declaration//GEN-END:variables
}
