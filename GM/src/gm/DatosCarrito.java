/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gm;
/**
 *
 * @author nao07
 */
public class DatosCarrito {

    public static String[] productos = new String[100];
    public static int[] cantidades = new int[100];
    public static double[] precios = new double[100];

    public static int totalProductos = 0;

    public static void agregarProducto(String producto, double precio) {
        // Si el producto ya existe, solo aumenta cantidad
        for (int i = 0; i < totalProductos; i++) {
            if (productos[i].equals(producto)) {
                cantidades[i]++;
                return;
            }
        }

        // Si no existe, lo agrega nuevo
        productos[totalProductos] = producto;
        cantidades[totalProductos] = 1;
        precios[totalProductos] = precio;
        totalProductos++;
    }
}
