
import java.util.Scanner; // Permite ingresar datos por teclado.
public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Lee los datos ingresados.
        int N; // Cantidad de pedidos.
        System.out.print("Ingrese la cantidad de pedidos: ");
        N = sc.nextInt(); // Lee la cantidad de pedidos.
        sc.nextLine(); // Limpia el salto de linea pendiente.
        // Arreglos para guardar la informacion de los pedidos.
        String[] cliente = new String[N]; // Guarda los nombres de los clientes.
        String[] plato = new String[N]; // Guarda los platos solicitados.
        int[] cantidad = new int[N]; // Guarda las cantidades.
        double[] precio = new double[N]; // Guarda los precios unitarios.
        double[] total = new double[N]; // Guarda el total de cada pedido.
        double ingresoTotal = 0; // Acumula los ingresos del restaurante.
        double mayorValor = 0; // Guarda el pedido de mayor valor.
        int pedidoMayor = 0; // Guarda la posicion del pedido mayor.
        // a. Registrar los pedidos.
        for (int i = 0; i < N; i++) {
            System.out.println("Pedido " + (i + 1));
            System.out.print("Nombre del cliente: ");
            cliente[i] = sc.nextLine(); // Lee el nombre del cliente.
            System.out.print("Plato solicitado: ");
            plato[i] = sc.nextLine(); // Lee el nombre del plato.
            System.out.print("Cantidad: ");
            cantidad[i] = sc.nextInt(); // Lee la cantidad solicitada.
            System.out.print("Precio unitario: ");
            precio[i] = sc.nextDouble(); // Lee el precio de cada unidad.
            sc.nextLine(); // Limpia el salto de linea pendiente.
            // b. Calcula el total del pedido.
            total[i] = cantidad[i] * precio[i];
            double totalOriginal = total[i]; // Guarda el total antes del descuento.
            // c. Aplica el descuento si supera los 50 dolares.
            if (total[i] > 50) {
                System.out.println("Total sin descuento: $" + totalOriginal);
                System.out.println("Se aplico un descuento del 10%.");

                total[i] = total[i] - (total[i] * 0.10);

                System.out.println("Total con descuento: $" + total[i]);
            } else {
                System.out.println("No se aplico descuento.");
                System.out.println("Total a pagar: $" + total[i]);
            }
            // d. Acumula los ingresos del restaurante.
            ingresoTotal = ingresoTotal + total[i];
            // e. Busca el pedido de mayor valor.
            if (total[i] > mayorValor || i == 0) {
                mayorValor = total[i];
                pedidoMayor = i;
            }
        }
        // Muestra la informacion de todos los pedidos.
        System.out.println("\nLISTA DE PEDIDOS");
        System.out.println("-------------------------");
        for (int i = 0; i < N; i++) {
            System.out.println("Cliente: " + cliente[i]);
            System.out.println("Plato: " + plato[i]);
            System.out.println("Cantidad: " + cantidad[i]);
            System.out.println("Precio unitario: $" + precio[i]);
            System.out.println("Total a pagar: $" + total[i]);
            System.out.println("-------------------------");
        }
        // d. Muestra el ingreso total del restaurante.
        System.out.println("Ingreso total del restaurante: $" + ingresoTotal);
        System.out.println("-------------------------");
        // e. Muestra el pedido de mayor valor.
        System.out.println("Pedido de mayor valor:");
        System.out.println("Cliente: " + cliente[pedidoMayor]);
        System.out.println("Plato: " + plato[pedidoMayor]);
        System.out.println("Total: $" + mayorValor);

        sc.close(); // Cierra el lector de datos.
    }
}
