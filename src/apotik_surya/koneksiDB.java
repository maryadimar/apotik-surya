/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apotik_surya;
//header untuk koneksi
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author altec
 */
public class koneksiDB {
   private static Connection koneksi;
   public static Connection getkoneksi()
   {
       if(koneksi==null)
       {
           try {
               Class.forName("com.mysql.jdbc.Driver");
               koneksi = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/db_apotik_surya","root","");
               System.out.println("Database Terkoneksi");
               
           } catch (Exception e) {
               System.out.println("Database Tidak Terkoneksi"+e.getMessage());
           }
       }
       return koneksi ;
   }
   
   public static void main (String[]args){
       koneksiDB test = new koneksiDB();
       test.getkoneksi();
       System.exit(0);
   }
}
