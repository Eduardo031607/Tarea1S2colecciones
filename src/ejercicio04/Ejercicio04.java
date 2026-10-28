package ejercicio04; // Paquete del ejercicio
import java.util.Random; // Para generar números aleatorios
import java.util.Scanner; // Para leer datos por teclado
public class Ejercicio04 { // Clase principal
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) { // Aquí empieza el programa
        Scanner teclado = new Scanner(System.in); // Objeto para leer del teclado
        Random aleatorio = new Random(); // Objeto para generar números aleatorios
        System.out.print("Filas A: "); int filasA = teclado.nextInt(); // Pedimos filas de A
        System.out.print("Columnas A: "); int columnasA = teclado.nextInt(); // Pedimos columnas de A
        System.out.print("Filas B: "); int filasB = teclado.nextInt(); // Pedimos filas de B
        System.out.print("Columnas B: "); int columnasB = teclado.nextInt(); // Pedimos columnas de B
        int[][] A = new int[filasA][columnasA]; // Creamos la matriz A
        int[][] B = new int[filasB][columnasB]; // Creamos la matriz B
        for (int i = 0; i < filasA; i++) // Recorremos filas de A
            for (int j = 0; j < columnasA; j++) A[i][j] = aleatorio.nextInt(10); // Llenamos con aleatorios 0-9
        for (int i = 0; i < filasB; i++) // Recorremos filas de B
            for (int j = 0; j < columnasB; j++) B[i][j] = aleatorio.nextInt(10); // Llenamos con aleatorios 0-9
        System.out.println("\nMatriz A:"); // Mostramos título A
        mostrar(A); // Llamamos a imprimir A
        System.out.println("\nMatriz B:"); // Mostramos título B
        mostrar(B); // Llamamos a imprimir B
        int opcion; // Variable de opción
        do { // Repetimos el menú hasta salir
            System.out.print("\n--- MENU ---\n1.Sumar\n2.Restar\n3.Multiplicar\n4.Trasp.A\n5.Trasp.B\n0.Salir\nOpcion: "); // Menú 
            opcion = teclado.nextInt(); // Leemos la opción
            switch (opcion) { // Evaluamos la opción
                case 1: sumar(A, B); break; // Llamamos a sumar
                case 2: restar(A, B); break; // Llamamos a restar
                case 3: multiplicar(A, B); break; // Llamamos a multiplicar
                case 4: trasponer(A); break; // Trasponemos A
                case 5: trasponer(B); break; // Trasponemos B
                case 0: System.out.println("Fin."); break; // Salimos
                default: System.out.println("Opción inválida."); // Error
            }
        } while (opcion != 0); // Repetimos si no es 0
        teclado.close(); // Cerramos el teclado
    }

    static void mostrar(int[][] m) { // Método para imprimir matriz
        for (int i = 0; i < m.length; i++) { // Recorremos filas
            for (int j = 0; j < m[i].length; j++) System.out.print(m[i][j] + "\t"); // Imprimimos valores
            System.out.println(); // Salto de línea
        }
    }

    static void sumar(int[][] A, int[][] B) { // Método sumar
        if (A.length != B.length || A[0].length != B[0].length) { System.out.println("Error: dimensiones distintas."); return; } // Validamos
        int[][] C = new int[A.length][A[0].length]; // Matriz resultado
        for (int i = 0; i < A.length; i++) // Recorremos filas
            for (int j = 0; j < A[0].length; j++) C[i][j] = A[i][j] + B[i][j]; // Sumamos
        System.out.println("Resultado A + B:"); mostrar(C); // Mostramos resultado
    }

    static void restar(int[][] A, int[][] B) { // Método restar
        if (A.length != B.length || A[0].length != B[0].length) { System.out.println("Error: dimensiones distintas."); return; } // Validamos
        int[][] C = new int[A.length][A[0].length]; // Matriz resultado
        for (int i = 0; i < A.length; i++) // Recorremos filas
            for (int j = 0; j < A[0].length; j++) C[i][j] = A[i][j] - B[i][j]; // Restamos
        System.out.println("Resultado A - B:"); mostrar(C); // Mostramos resultado
    }

    static void multiplicar(int[][] A, int[][] B) { // Método multiplicar
        if (A[0].length != B.length) { System.out.println("Error: col. A diferentea fil. B."); return; } // Validamos
        int[][] C = new int[A.length][B[0].length]; // Matriz resultado
        for (int i = 0; i < A.length; i++) { // Recorremos filas A
            for (int j = 0; j < B[0].length; j++) { // Recorremos columnas B
                for (int k = 0; k < A[0].length; k++) C[i][j] += A[i][k] * B[k][j]; // Multiplicamos y acumulamos
            }
        }
        System.out.println("Resultado A x B:"); mostrar(C); // Mostramos resultado
    }

    static void trasponer(int[][] M) { // Método traspuesta
        int[][] T = new int[M[0].length][M.length]; // Matriz traspuesta
        for (int i = 0; i < M.length; i++) // Recorremos filas
            for (int j = 0; j < M[0].length; j++) T[j][i] = M[i][j]; // Intercambiamos
        System.out.println("Traspuesta:"); mostrar(T); // Mostramos resultado
    }
}