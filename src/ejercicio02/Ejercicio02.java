package ejercicio02; // Paquete del ejercicio

import java.util.Arrays; // Para imprimir arreglos de forma fácil
import java.util.Random; // Para generar números aleatorios
import java.util.Scanner; // Para leer datos por teclado

public class Ejercicio02 { // Clase principal
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) { // Aquí empieza el programa
        Scanner teclado = new Scanner(System.in); // Objeto para leer del teclado
        Random aleatorio = new Random(); // Objeto para generar números aleatorios

        int[] vector = new int[20]; // Vector original de 20 elementos
        for (int i = 0; i < 20; i++) { // Recorremos las 20 posiciones
            vector[i] = aleatorio.nextInt(50) + 1; // Guardamos un número aleatorio entre 1 y 50
        }
        System.out.println("Vector: " + Arrays.toString(vector)); // Mostramos el vector

        // a) Buscar un número
        System.out.print("Ingrese un número a buscar: "); // Pedimos el número
        int buscado = teclado.nextInt(); // Lo guardamos
        int posicion = -1; // -1 significa "no encontrado"
        for (int i = 0; i < 20; i++) { // Recorremos el vector
            if (vector[i] == buscado) { // Si encontramos el número
                posicion = i; // Guardamos la posición
                break; // Dejamos de buscar
            }
        }
        if (posicion == -1) { // Si no se encontró
            System.out.println("El número no está en el vector."); // Avisamos
        } else { // Si se encontró
            System.out.println("El número está en la posición " + posicion); // Mostramos la posición
        }

        // b) Segundo vector con los índices impares (1, 3, 5, ..., 19)
        int[] impares = new int[10]; // Son 10 elementos
        for (int i = 0; i < 10; i++) { // Recorremos las 10 posiciones del nuevo vector
            impares[i] = vector[2 * i + 1]; // Tomamos las posiciones 1, 3, 5, ... del original
        }
        System.out.println("Vector de índices impares: " + Arrays.toString(impares)); // Lo mostramos

        // c) Contar los mayores a 20
        int contador = 0; // Aquí contamos
        for (int i = 0; i < 10; i++) { // Recorremos el segundo vector
            if (impares[i] > 20) { // Si el elemento es mayor a 20
                contador++; // Sumamos 1
            }
        }
        System.out.println("Elementos mayores a 20: " + contador); // Mostramos el resultado

        teclado.close(); // Cerramos el Scanner
    }
}