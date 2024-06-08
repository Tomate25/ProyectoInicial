import java.util.ArrayList;
import java.util.Scanner;
public class SistemaControl {
    private ArrayList<Producto> inventario = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        inventario.add(producto);
    }

    public void listarProductos() {
        for (Producto producto : inventario) {
            System.out.println(producto);
        }
    }

    public Producto buscarProducto(String nombre) {
        for (Producto producto : inventario) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null;
    }

    public void actualizarProducto(String nombre, int nuevaCantidad, double nuevoPrecio) {
        Producto producto = buscarProducto(nombre);
        if (producto != null) {
            producto.setCantidad(nuevaCantidad);
            producto.setPrecio(nuevoPrecio);
        }
    }
}