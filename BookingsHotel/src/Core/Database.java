/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author angga
 */
public class Database {
    public static Connection Connect(){
        Connection conn = null;
        String DRIVER = "com.mysql.jdbc.Driver";
        String DB = "jdbc:mysql://localhost/bookingshotel";
        String USER = "root";
        String PW = "";
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(DB,USER,PW);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot connect to database!\n\n"+ ex.getMessage());
        }
        return conn;
    }
}
