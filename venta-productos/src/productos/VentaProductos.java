package productos;

import java.util.ArrayList;
import java.util.List;
import productos.cliente.producto.ClienteProducto;
import productos.cliente.producto.Producto;

public class VentaProductos {

    public static void main(String[] args) {
        
        List<Producto> productos = new ArrayList<>();
        setProductos(productos);
        
        ClienteProducto cliente1 = new ClienteProducto("James", productos);
        ClienteProducto cliente2 = new ClienteProducto("Jorge", productos);
        
        long initialTime = System.currentTimeMillis();
        CajeraProducto cajera1 = new CajeraProducto("Nataly");
        CajeraProducto cajera2 = new CajeraProducto("Leidy");
        
        cajera1.procesarCompra(cliente1, initialTime);
        cajera2.procesarCompra(cliente2, initialTime);
        
    }
        
    private static void setProductos(List<Producto> productos) {
        
        Producto producto1 = new Producto("frijol", 20, 3);
        Producto producto2 = new Producto("sal", 10, 1);
        Producto producto3 = new Producto("chocolate", 5, 5);
        
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);


    }
    
}
