package ejercicio01; // Paquete del ejercicio
import java.util.Arrays; // Para imprimir arreglos de forma fácil
import java.util.Scanner; // Para leer datos por teclado

public class Ejercicio01 { // Clase principal
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) { // Aquí empieza el programa
        Scanner teclado = new Scanner(System.in); // Objeto para leer del teclado
        System.out.print("Ingrese N: "); // Pedimos el tamaño de los arreglos
        int n = teclado.nextInt(); // Guardamos N
        long[] matematica = new long[n]; // Cédulas que reprobaron Matemática
        long[] ingles = new long[n]; // Cédulas que reprobaron Inglés
        long[] ambas = new long[n]; // Cédulas que reprobaron las dos materias
        int cantidad = 0; // Cuántas cédulas llevamos en el arreglo "ambas"
        System.out.println("Cédulas que reprobaron MATEMATICA:"); // Mensaje
        for (int i = 0; i < n; i++) { // Repetimos N veces
            matematica[i] = teclado.nextLong(); // Leemos y guardamos una cédula
        }
        System.out.println("Cédulas que reprobaron INGLES:"); // Mensaje
        for (int i = 0; i < n; i++) { // Repetimos N veces
            ingles[i] = teclado.nextLong(); // Leemos y guardamos ua cédula
        }
        for (int i = 0; i < n; i++) { // Tomamos cada cédula de Matemática
            for (int j = 0; j < n; j++) { // Y la comparamos con cada cédula de Inglés
                if (matematica[i] == ingles[j]) { // Si son iguales, reprobó las dos
                    ambas[cantidad] = matematica[i]; // La guardamos en "ambas"
                    cantidad++; // Aumentamos el contador
                }
            }
        }
        System.out.println("Matemática: " + Arrays.toString(matematica)); // Imprimimos el primer arreglo
        System.out.println("Inglés: " + Arrays.toString(ingles)); // Imprimimos el segundo arreglo
        System.out.println("Ambas: " + Arrays.toString(Arrays.copyOf(ambas, cantidad))); // Imprimimos solo las posiciones usadas

        teclado.close(); // Cerramos el Scanner
    }
}