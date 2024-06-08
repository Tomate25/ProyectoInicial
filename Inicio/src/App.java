import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
                // Abdias Natanael Lopez Rocha Carnet: 2024-1354U       //  Michelle Carolina Montalban Pérez Carnet: 2024-1382U
                // Isaías Israel Madrigal Brizuela Carnet: 2024-1383U  //   Darien José Mayorga Moreno Carnet: 2024-1356U
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SistemaControl sistemaControl = new SistemaControl();
        while (true) {
            System.out.println("1. Agregar producto");
            System.out.println("2. Lista de productos");
            System.out.println("3. Buscar producto");
            System.out.println("4. Actualizar producto");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese nombre del producto:");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese cantidad del producto:");
                    int cantidad = scanner.nextInt();
                    System.out.println("Ingrese precio del producto:");
                    double precio = scanner.nextDouble();
                    Producto producto = new Producto(nombre, cantidad, precio);
                    sistemaControl.agregarProducto(producto);
                    break;
                case 2:
                    sistemaControl.listarProductos();
                    break;
                case 3:
                    System.out.println("Ingrese nombre del producto a buscar:");
                    nombre = scanner.nextLine();
                    producto = sistemaControl.buscarProducto(nombre);
                    if (producto != null) {
                        System.out.println(producto);
                    } else {
                        System.out.println("Producto no encontrado");
                    }
                    break;
                case 4:
                    System.out.println("Ingrese nombre del producto a actualizar:");
                    nombre = scanner.nextLine();
                    System.out.println("Ingrese nueva cantidad:");
                    cantidad = scanner.nextInt();
                    System.out.println("Ingrese nuevo precio:");
                    precio = scanner.nextDouble();
                    sistemaControl.actualizarProducto(nombre, cantidad, precio);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}
