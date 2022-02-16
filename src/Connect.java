
//Import Library Java untuk SQL
import java.sql.*;
public class Connect {
//   Membuat Variable 
    private Connection connect;
    private final String driverName = "com.mysql.jdbc.Driver";//Driver dari library java ke sql
    private final String url =  "jdbc:mysql://localhost:3306/toko_game";//Alamat Localhost
    private final String username = "root";//username root database MySQL
    private final String password = "";//passqord root database MySQL
    
//    Membuat Method untuk mendapatkan Koneksi
    public Connection getConnect() throws SQLException{
//        Jika Koneksi Null, maka program akan membuat koneksi terhadap MySQL
        if (connect == null) {
//            try catch jika ada error
            try {
//             Membuat nama kelas dari Driver
                Class.forName(driverName);
                connect = DriverManager.getConnection(url, username, password);//Sign in dari url,username, password
                System.out.println("Koneksi Ditemukan yaitu : " + connect);//Print jika menemukan Koneksi
                
            } catch (ClassNotFoundException ex) {
                System.out.println("Koneksi Gagal ada Error : " + ex);//Print Error yang terjadi
            }
            
        }
    
    return connect;//Me- return proses koneksi
    }
     public static void main(String[] args) throws SQLException {
//         Buat Objek dari Method yang sudah dibuat
        Connect testKoneksi = new Connect();
        testKoneksi.getConnect();// Run Method
        
    }
}
