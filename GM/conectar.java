/*
@Autor
Capacete
coba
*/


package gm;

import java.sql.Connection;
import java.sql.DriverManager;

public class conectar {
    
    Connection con;

    public Connection getConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/velora_db", "root", "");
        } catch (Exception e) {
            System.out.println("Error en conexión: " + e);
        }
        return con;
    }
}