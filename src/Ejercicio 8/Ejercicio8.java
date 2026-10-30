
import java.util.Scanner; // Permite ingresar datos por teclado.
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Lee los datos ingresados.
        int N; // Cantidad de trabajadores.
        System.out.print("Ingrese la cantidad de trabajadores: ");
        N = sc.nextInt(); // Lee la cantidad de trabajadores.
        // Ciclo para ingresar los datos de cada trabajador.
        for (int i = 0; i < N; i++) {
            int codigo; // Codigo del trabajador.
            int horas; // Horas de ausencia.
            int defectuosos; // Cantidad de pupitres defectuosos.
            int producidos; // Cantidad de pupitres producidos.
            int grado = 0; // Grado de eficiencia.
            System.out.print("Codigo del trabajador: ");
            codigo = sc.nextInt(); // Lee el codigo.
            System.out.print("Horas de ausencia: ");
            horas = sc.nextInt(); // Lee las horas de ausencia.
            System.out.print("Pupitres defectuosos: ");
            defectuosos = sc.nextInt(); // Lee los pupitres defectuosos.
            System.out.print("Pupitres producidos: ");
            producidos = sc.nextInt(); // Lee los pupitres producidos.
            // Comprueba las tres condiciones.
            boolean a = horas <= 3; // Primera condicion.
            boolean b = defectuosos < 300; // Segunda condicion.
            boolean c = producidos > 10000; // Tercera condicion.
            // Asigna el grado segun las condiciones cumplidas.
            if (a && b && c) {
                grado = 20; // Cumple las tres condiciones.
            } else if (a && b) {
                grado = 12; // Cumple la primera y segunda.
            } else if (a && c) {
                grado = 13; // Cumple la primera y tercera.
            } else if (b && c) {
                grado = 15; // Cumple la segunda y tercera.
            } else if (a) {
                grado = 7; // Cumple solo la primera.
            } else if (b) {
                grado = 8; // Cumple solo la segunda.
            } else if (c) {
                grado = 9; // Cumple solo la tercera.
            } else {
                grado = 5; // No cumple ninguna condicion.
            }
            // Imprime toda la informacion del trabajador.
            System.out.println("Codigo: " + codigo);
            System.out.println("Horas de ausencia: " + horas);
            System.out.println("Pupitres defectuosos: " + defectuosos);
            System.out.println("Pupitres producidos: " + producidos);
            System.out.println("Grado de eficiencia: " + grado);
            System.out.println("-------------------------");
        }
        sc.close(); // Cierra el lector de datos.
    }
}
