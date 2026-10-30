
import java.util.Scanner; // Permite ingresar datos por teclado.
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Lee los datos ingresados.
        int N; // Cantidad de estudiantes.
        System.out.print("Ingrese la cantidad de estudiantes: ");
        N = sc.nextInt(); // Lee la cantidad de estudiantes.
        int[] codigo = new int[N]; // Guarda el codigo de cada estudiante.
        double[][] notas = new double[N][8]; // Guarda las 8 notas de cada estudiante.
        // Ingresar los codigos y las notas de los estudiantes.
        for (int i = 0; i < N; i++) {
            System.out.print("Codigo del estudiante " + (i + 1) + ": ");
            codigo[i] = sc.nextInt(); // Guarda el codigo.

            for (int j = 0; j < 8; j++) {
                System.out.print("Nota de la materia " + (j + 1) + ": ");
                notas[i][j] = sc.nextDouble(); // Guarda la nota.
            }
        }
        // a. El promedio de las calificaciones obtenidas por cada estudiante.
        double mayorPromedio = 0; // Guarda el promedio mas alto.
        int codigoMayor = 0; // Guarda el codigo del estudiante con mayor promedio.
        for (int i = 0; i < N; i++) {
            double suma = 0; // Acumula las notas del estudiante.
            for (int j = 0; j < 8; j++) {
                suma = suma + notas[i][j]; // Suma las 8 notas.
            }
            double promedio = suma / 8; // Calcula el promedio.
            System.out.println("a. Promedio del estudiante " + codigo[i] + ": " + promedio);
            // c. Buscar el estudiante con mayor promedio.
            if (promedio > mayorPromedio || i == 0) {
                mayorPromedio = promedio; // Guarda el promedio mayor.
                codigoMayor = codigo[i]; // Guarda su codigo.
            }
        }
       // b. Calcular el promedio de cada materia.
            for (int j = 0; j < 8; j++) {
                    double suma = 0; // Acumula las notas de la materia.
                    for (int i = 0; i < N; i++) {
                        suma = suma + notas[i][j]; // Suma las notas de los estudiantes.
                    }
                    System.out.println("b. Promedio de la materia " + (j + 1) + ": " + (suma / N));
                }
        // c. Mostrar el estudiante con mayor promedio.
        System.out.println("c. Estudiante con mayor promedio: " + codigoMayor);
        System.out.println("c. Mayor promedio: " + mayorPromedio);
        // d. Contar los estudiantes aprobados por materia.
        for (int j = 0; j < 8; j++) {
            int aprobados = 0; // Cuenta los aprobados.

            for (int i = 0; i < N; i++) {
                if (notas[i][j] >= 7 && notas[i][j] <= 10) {
                    aprobados++; // Aumenta el contador.
                }
            }
            System.out.println("Materia " + (j + 1));
            System.out.println("Aprobados: " + aprobados);
        }
        // e. Contar los estudiantes reprobados por materia.
        for (int j = 0; j < 8; j++) {
            int reprobados = 0; // Cuenta los reprobados.

            for (int i = 0; i < N; i++) {
                if (notas[i][j] < 7) {
                    reprobados++; // Aumenta el contador.
                }
            }
            System.out.println("Materia " + (j + 1));
            System.out.println("Reprobados: " + reprobados);
        }
        sc.close(); // Cierra el lector de datos.
    }
}
