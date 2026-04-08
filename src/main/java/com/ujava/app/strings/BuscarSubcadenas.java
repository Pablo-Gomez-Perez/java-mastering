package com.ujava.app.strings;

import com.ujava.app.utilsXd.ConsoleUI;

public class BuscarSubcadenas {

    /**
     * String con el que se estará trabajando
     */
    private static String miCadena = "Hola mundo mundial muldialmente";

    /**
     * Se hace uso de el método {@code indexOf(String str)} que devuelve la primera aparicion de la subcadena buscada
     * útil al momento de buscar fragmentos o palabras en un string.
     */
    public static void testBuscandoSubCadena(){

        ConsoleUI.renderTitle("Buscar Subcadenas");

        System.out.println("cadena: " + miCadena);
        int index = miCadena.indexOf("mundial");
        System.out.println("indice de mundial = " + index);
        int lasIndex = miCadena.lastIndexOf("mundial");
        System.out.println("ultimo indice = " + lasIndex);
    }

}
