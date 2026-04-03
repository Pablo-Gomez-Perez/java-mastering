package com.ujava.app.strings;

/**
 * trabajando con métodos para obtener una nueva cadena de Texto o {@code String} a partir de una cadena
 * original.
 */
public class SubCadenas {

    private static String miCadena = new String("Hola mundo");

    public static void pruebaSubcadena(){

        System.out.println("==================================================");
        System.out.println("cadena original: " + miCadena);
        System.out.println("primer subcadena: " + primerCadena());
        System.out.println("segunda subcadena: " + segundaSubcadena());

    }

    /**
     *
     * @return un nuevo {@code String} empezando desde el indice 5 de {@code miCadena}
     */
    private static String primerCadena(){
        return miCadena.substring(5);
    }

    /**
     *
     * @return un nuevo {@code String} empezando desde el indice 0 hasta el 3 de {@code miCadena}
     */
    private static String segundaSubcadena(){
        return miCadena.substring(0,4);
    }

}
