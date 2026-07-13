/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nao07
 */
package gm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PruebaConexion {
    public static void main(String[] args) {
        // 1. Instanciar nuestra clase de conexión
        conectar cc = new conectar();
        Connection cn = cc.getConexion();
        
        if (cn != null) {
            System.out.println("-> Intentando leer datos de prueba...");
            
            // 2. Intentaremos traer al Administrador que insertaste ('Carlos Gómez')
            // Nota: Usamos 'correro' tal cual lo definiste en tu script SQL
            String sql = "SELECT nombre_completo, correro, rol FROM usuarios WHERE id_usuario = 1";
            
            try {
                PreparedStatement pst = cn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                
                if (rs.next()) {
                    System.out.println("\n=== USUARIO ENCONTRADO ===");
                    System.out.println("Nombre: " + rs.getString("nombre_completo"));
                    System.out.println("Correo: " + rs.getString("correro"));
                    System.out.println("Rol: " + rs.getString("rol"));
                    System.out.println("==========================\n");
                    System.out.println("¡Todo está perfecto! Tu base de datos y NetBeans están vinculados.");
                }
                
                // Cerrar flujos
                rs.close();
                pst.close();
                cn.close();
                
            } catch (Exception e) {
                System.out.println("Error al consultar datos: " + e.getMessage());
            }
        } else {
            System.out.println("La conexión falló. Verifica que XAMPP esté encendido.");
        }
    }
}
