/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gm;

public class Conexion {

    // Arreglo local: nombre, correo, contraseña, rol
    public static String[][] usuarios = new String[100][4];

    public static int totalUsuarios = 0;

    public static boolean registrarUsuario(String nombre, String correo, String contrasena, String rol) {

        if (totalUsuarios >= usuarios.length) {
            return false;
        }

        if (correoExiste(correo)) {
            return false;
        }

        usuarios[totalUsuarios][0] = nombre;
        usuarios[totalUsuarios][1] = correo;
        usuarios[totalUsuarios][2] = contrasena;
        usuarios[totalUsuarios][3] = rol;

        totalUsuarios++;

        return true;
    }

    public static boolean correoExiste(String correo) {
        for (int i = 0; i < totalUsuarios; i++) {
            if (usuarios[i][1].equalsIgnoreCase(correo)) {
                return true;
            }
        }
        return false;
    }

    public static String validarUsuario(String correo, String contrasena) {
        for (int i = 0; i < totalUsuarios; i++) {
            if (usuarios[i][1].equalsIgnoreCase(correo) && usuarios[i][2].equals(contrasena)) {
                return usuarios[i][3]; // regresa el rol
            }
        }
        return null;
    }
}