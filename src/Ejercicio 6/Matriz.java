
import java.util.Scanner; // Permite ingresar datos por teclado.
public class Matriz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Lee los datos.
        int Vendedores, Anios; // Guarda la cantidad de vendedores y años.
        System.out.print("Ingrese el numero de vendedores: ");
        Vendedores = sc.nextInt(); // Lee la cantidad de vendedores.
        System.out.print("Ingrese el numero de años: ");
        Anios = sc.nextInt(); // Lee la cantidad de años.

        double[][] ventas = new double[Vendedores][Anios]; // Crea la matriz.
        // Ingresa las ventas de cada vendedor en cada año.
        for (int i = 0; i < Vendedores; i++) {
            for (int j = 0; j < Anios; j++) {
                System.out.print("Ventas del vendedor " + (i + 1) + " en el año " + (j + 1) + ": ");
                ventas[i][j] = sc.nextDouble(); // Guarda cada venta.
            }
        }
        // a. Total de ventas de cada vendedor.
        for (int i = 0; i < Vendedores; i++) {
            double total = 0; // Inicia la suma del vendedor.
            for (int j = 0; j < Anios; j++) {
                total = total + ventas[i][j]; // Suma las ventas por año.
            }
            System.out.println("Total del vendedor " + (i + 1) + ": " + total);
        }
        // b. Total de ventas de cada año.
        for (int j = 0; j < Anios; j++) {
            double total = 0; // Inicia la suma del año.
            for (int i = 0; i < Vendedores; i++) {
                total = total + ventas[i][j]; // Suma las ventas de los vendedores.
            }
            System.out.println("Total del año " + (j + 1) + ": " + total);
        }
        // c. Total de ventas de la empresa.
        double totalEmpresa = 0; // Inicia la suma total.
        for (int i = 0; i < Vendedores; i++) {
            for (int j = 0; j < Anios; j++) {
                totalEmpresa = totalEmpresa + ventas[i][j]; // Suma todas las ventas.
            }
        }
        System.out.println("Total de ventas de la empresa: " + totalEmpresa);
        sc.close(); // Cierra el lector de datos.
    }
}
