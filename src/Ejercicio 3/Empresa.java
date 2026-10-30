
import java.util.Scanner; // Permite ingresar datos por teclado.

public class Empresa { // Define la clase principal.
    public static void main(String[] args) { // Inicia el programa.

        Scanner sc = new Scanner(System.in); // Permite leer datos por teclado.

        int empleados; // Guarda la cantidad de empleados.

        System.out.print("Ingrese la cantidad de empleados: ");
        empleados = sc.nextInt(); // Lee la cantidad de empleados.

        int[] codigo = new int[empleados]; // Guarda los códigos.
        String[] nombre = new String[empleados]; // Guarda los nombres.

        // Ciclo para ingresar los datos de los empleados.
        for (int i = 0; i < empleados; i++) {

            System.out.print("Codigo: ");
            codigo[i] = sc.nextInt(); // Guarda el código del empleado.

            sc.nextLine(); // Limpia el salto de línea pendiente.

            System.out.print("Nombre: ");
            nombre[i] = sc.nextLine(); // Lee el nombre completo.
        }

        // Solicita el código que se desea buscar.
        System.out.print("Ingrese el codigo a buscar: ");
        int buscar = sc.nextInt(); // Guarda el código buscado.

        // Recorre los códigos de los empleados.
        for (int i = 0; i < empleados; i++) {

            // Compara el código registrado con el código buscado.
            if (codigo[i] == buscar) {

                // Muestra el nombre del empleado encontrado.
                System.out.println("Nombre: " + nombre[i]);
            }
        }

        sc.close(); // Cierra el lector de datos.
    }
}
