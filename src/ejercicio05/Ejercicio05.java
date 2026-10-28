package ejercicio05; // Paquete del ejercicio

import java.util.Scanner; // Para leer datos por teclado

public class Ejercicio05 { // Clase principal

    public static void main(String[] args) { // Aquí empieza el programa
        Scanner teclado = new Scanner(System.in); // Objeto para leer del teclado

        System.out.print("Articulos (N): "); int n = teclado.nextInt(); // Pedimos cantidad de articulos
        System.out.print("Sucursales (M): "); int m = teclado.nextInt(); // Pedimos cantidad de sucursales

        double[][] precios = new double[n][m]; // Matriz para guardar los precios
        int[][] cantidades = new int[n][m]; // Matriz para guardar las cantidades vendidas
        double[] totalArticulo = new double[n]; // Arreglo para el total por cada articulo
        double[] totalSucursal = new double[m]; // Arreglo para el total por cada sucursal

        for (int i = 0; i < n; i++) { // Recorremos los articulos (filas)
            for (int j = 0; j < m; j++) { // Recorremos las sucursales (columnas)
                System.out.print("Precio Art." + (i+1) + " Suc." + (j+1) + ": "); // Pedimos el precio
                precios[i][j] = teclado.nextDouble(); // Guardamos el precio
                
                System.out.print("Cantidad vendida: "); // Pedimos la cantidad
                cantidades[i][j] = teclado.nextInt(); // Guardamos la cantidad
                
                double venta = precios[i][j] * cantidades[i][j]; // Calculamos el subtotal (precio x cantidad)
                totalArticulo[i] += venta; // Acumulamos la venta al total del articulo
                totalSucursal[j] += venta; // Acumulamos la venta al total de la sucursal
            }
        }

        System.out.println("\n--- RESULTADOS ---"); // Mostramos titulo
        for (int i = 0; i < n; i++) // Recorremos articulos
            System.out.println("Total Articulo " + (i+1) + ": $" + totalArticulo[i]); // Imprimimos total articulo
            
        for (int j = 0; j < m; j++) // Recorremos sucursales
            System.out.println("Total Sucursal " + (j+1) + ": $" + totalSucursal[j]); // Imprimimos total sucursal

        teclado.close(); // Cerramos el teclado
    }
}