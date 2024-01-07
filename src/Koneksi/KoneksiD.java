/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Koneksi;

import java.sql.*;

/**
 *
 * @author mmuzaki.a
 */
public class KoneksiD {
    
    public static Connection BukaKoneksi() {   
        Connection con = null;
        String url  = "jdbc:mysql://localhost:3306/aplikasigudang",
        user       = "root",
        pass       = "";
        try {
            con = (Connection) DriverManager.getConnection(url, user, pass);
            System.err.println("Koneksi Berhasil");
        } catch (Exception e) {
            System.err.println("Koneksi Gagal : " + e.getMessage());
        }
        return con;
    }
}
