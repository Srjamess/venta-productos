package productos.thread;

import java.util.ArrayList;
import java.util.List;
import productos.cliente.producto.ClienteProducto;
import productos.cliente.producto.Producto;

public class MainThreadProducto {
    
    public static void main(String[] args) {
        
        List<Producto> productos = new ArrayList<>();
        setProductos(productos);
        
        ClienteProducto cliente1 = new ClienteProducto("Jorge", productos);
        ClienteProducto cliente2 = new ClienteProducto("James", productos);
        
        long initialTime = System.currentTimeMillis();
        CajeraThreadProducto cajera1 = new CajeraThreadProducto("Leidy", cliente1, initialTime);
        CajeraThreadProducto cajera2 = new CajeraThreadProducto("Nataly", cliente2, initialTime);
        
        cajera1.start();
        cajera2.start();
    }
    
    private static void setProductos(List<Producto> productos) {
        Producto p1 = new Producto("Papaya", 100, 5);
        Producto p2 = new Producto("Pera", 50, 2);
        Producto p3 = new Producto("Pitahaya", 700, 12);
        
        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
    }
    
}
