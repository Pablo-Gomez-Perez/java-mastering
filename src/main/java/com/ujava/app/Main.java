package com.ujava.app;

import com.ujava.app.metodos_de_cadenas.TrabajoConCadenas;
import com.ujava.app.strings.*;
import com.ujava.app.tienda_linea.Producto;
import com.ujava.app.utilsXd.ConsoleUI;

public class Main {

    public static void main(String[] args) {
        System.out.println("Empezamos a aprender Java otra vez ptm XD");
        /*Solucion.solucion(); //Reto detalle Persona*/

        /*String color;
        System.out.println(color);
        color = "rojo";

        //productoSolucion();

        TrabajoConCadenas.test();
        Indices.test();
        ComparandoCadenas.comparaCadena();
        Metodos.test();
        SubCadenas.pruebaSubcadena();*/
        BuscarSubcadenas.testBuscandoSubCadena();
        ReemplazarSubcadenas.testito();
        
    }

    public static void productoSolucion(){
        Producto prod = new Producto("Cocacolita", 25.50, 15, true);
        System.out.println(prod.toString());

        //modificanto datos
        prod.setNombreProducto("Coca Colita fria");
        prod.setPrecio(39.50);
        prod.setCantidad(12);
        prod.setDisponibleParaVenta(true);

        System.out.println(prod.toString());
    }
}