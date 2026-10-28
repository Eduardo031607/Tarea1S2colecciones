package ejercicio09; // Paquete del ejercicio
import java.util.Scanner; // Para leer datos por teclado
public class Ejercicio09 { // Clase principal
    static class Medicamento { // Clase auxiliar para guardar los datos
        String nombre; int stock, stockMin; double precio; // Atributos del medicamento
    }

    public static void main(String[] args) { // Aquí empieza el programa
        Scanner teclado = new Scanner(System.in); // Objeto para leer del teclado
        Medicamento[] inventario = new Medicamento[0]; // Arreglo vacío al inicio
        int opcion; // Variable para la opción del menú

        do { // Repetimos el menú hasta salir
            System.out.print("\n--- FARMACIA ---\n1.Registrar\n2.Ver Faltantes\n3.Valor Total\n4.Vender\n5.Reporte\n0.Salir\nOpcion: "); // Menú compacto
            opcion = teclado.nextInt(); // Leemos la opción
            teclado.nextLine(); // Limpiamos el buffer para poder leer textos

            switch (opcion) { // Evaluamos la opción
                case 1: // a) Registrar medicamentos
                    System.out.print("Cuantos medicamentos: "); int n = teclado.nextInt(); // Pedimos cantidad
                    teclado.nextLine(); // Limpiamos buffer
                    inventario = new Medicamento[n]; // Creamos el arreglo con la cantidad
                    for (int i = 0; i < n; i++) { // Recorremos el arreglo
                        inventario[i] = new Medicamento(); // Creamos el objeto
                        System.out.print("Nombre: "); inventario[i].nombre = teclado.nextLine(); // Guardamos nombre
                        System.out.print("Stock actual: "); inventario[i].stock = teclado.nextInt(); // Guardamos stock
                        System.out.print("Stock minimo: "); inventario[i].stockMin = teclado.nextInt(); // Guardamos stock mínimo
                        System.out.print("Precio: "); inventario[i].precio = teclado.nextDouble(); // Guardamos precio
                        teclado.nextLine(); // Limpiamos buffer
                    } break;

                case 2: // b) MOSTRAR los que están debajo del mínimo (No modifica el stock)
                    System.out.println("\nMedicamentos por debajo del stock minimo:");
                    for (int i = 0; i < inventario.length; i++) { // Recorremos todo el inventario
                        // Si el stock actual es menor al mínimo, solo lo mostramos
                        if (inventario[i].stock < inventario[i].stockMin) { 
                            System.out.println("- " + inventario[i].nombre + " (Actual: " + inventario[i].stock + " | Min: " + inventario[i].stockMin + ")"); // Mostramos detalles
                        }
                    } break;

                case 3: // c) Valor total
                    double valorTotal = 0; // Acumulador
                    for (int i = 0; i < inventario.length; i++) // Recorremos
                        valorTotal += inventario[i].stock * inventario[i].precio; // Sumamos stock * precio
                    System.out.println("Valor total del inventario: $" + valorTotal); // Mostramos
                    break;

                case 4: // d) Actualizar stock (Venta)
                    System.out.print("Nombre del medicamento a vender: "); String buscar = teclado.nextLine(); // Pedimos nombre
                    for (int i = 0; i < inventario.length; i++) { // Buscamos en el arreglo
                        if (inventario[i].nombre.equalsIgnoreCase(buscar)) { // Si lo encontramos
                            System.out.print("Cantidad vendida: "); int cant = teclado.nextInt(); // Pedimos cantidad
                            inventario[i].stock -= cant; // RESTAMOS la cantidad vendida del stock actual
                            System.out.println("Venta realizada. Nuevo stock de " + buscar + ": " + inventario[i].stock); // Avisamos
                        }
                    } break;

                case 5: // e) Reporte general
                    System.out.println("\n--- REPORTE GENERAL ---");
                    for (int i = 0; i < inventario.length; i++) { // Recorremos todo
                        System.out.println(inventario[i].nombre + " | Stock: " + inventario[i].stock + " | Min: " + inventario[i].stockMin + " | Precio: $" + inventario[i].precio); // Mostramos los datos
                    } break;

                case 0: System.out.println("Saliendo..."); break; // Salir
                default: System.out.println("Opcion no valida."); // Opción incorrecta
            }
        } while (opcion != 0); // Repetimos si no es 0

        teclado.close(); // Cerramos el teclado
    }
}