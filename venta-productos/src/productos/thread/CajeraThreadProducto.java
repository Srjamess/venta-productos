package productos.thread;

import productos.cliente.producto.ClienteProducto;
import productos.cliente.producto.Producto;

public class CajeraThreadProducto extends Thread {

    private String nombre;
    private ClienteProducto cliente;
    private long initialTime;

    public CajeraThreadProducto(String nombre, ClienteProducto cliente, long initialTime) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.initialTime = initialTime;
    }
    
    
    @Override
    public void run() {
        System.out.println("La cajera " + this.nombre + " comienza a procesar la compra del cliente "
                + this.cliente.getNombre() + " en el tiempo : " + (System.currentTimeMillis() - this.initialTime) / 1000 + " seg");

        int contCliente = 1;
        for (Producto producto : cliente.getProductos()) {
            this.esperarXsegundos();
            System.out.println("Procesado el producto " + contCliente + " nombre producto " + producto.getNombre()
                    + " precio producto " + producto.getPrecio() + " cantidad de productos " + producto.getCantidad()
                    + " costo total del producto " + producto.getCantidad() * producto.getPrecio()
                    + " Tiempo: " + (System.currentTimeMillis() - this.initialTime) / 1000
                    + " seg");
            contCliente++;
        }

        System.out.println("La cajera " + this.nombre + " ha terminado de procesar " + this.cliente.getNombre()
                + " en el tiempo: " + (System.currentTimeMillis() - this.initialTime) / 1000 + " seg");

    }
    
    private void esperarXsegundos() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
