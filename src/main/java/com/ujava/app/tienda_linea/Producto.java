package com.ujava.app.tienda_linea;

/**
 * En el siguiente reto deben crear varias variables para almacenar el detalle
 * de un producto de una tienda en linea <br>
 * 
 * <p>
 * El detalle a almacenar el producto es el siguiente
 * </p>
 * <ul>
 * <li>Nombre del producto</li>
 * <li>Precio</li>
 * <li>Cantidad</li>
 * <li>Indicar si está disponible para venta</li>
 * </ul>
 * <br>
 * <p>
 * deben asignar valores de prueba en cada variable, escoger el nombre de cada
 * variable aplicando las buenas practicas y mandar a imprimir el valor
 * en cada variable.
 * </p>
 * <p>
 * Finalmente deben modificar el valor de cada variable con nuevos datos y
 * mandar a imprimir el valor de cada variable y así comprobar que se
 * modificaron correctamente.
 * </p>
 */
public class Producto {

    public String nombreProducto;
    public double precio;
    public int cantidad;
    public boolean isDisponibleParaVenta;

    public Producto(String nombreProducto, double precio, int cantidad, boolean isDisponibleParaVenta) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.isDisponibleParaVenta = isDisponibleParaVenta;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isDisponibleParaVenta() {
        return isDisponibleParaVenta;
    }

    public void setDisponibleParaVenta(boolean isDisponibleParaVenta) {
        this.isDisponibleParaVenta = isDisponibleParaVenta;
    }

    @Override
    public String toString() {
        return "Producto [nombreProducto=" + nombreProducto + ", precio=" + precio + ", cantidad=" + cantidad
                + ", isDisponibleParaVenta=" + isDisponibleParaVenta + "]";
    }
    
}
