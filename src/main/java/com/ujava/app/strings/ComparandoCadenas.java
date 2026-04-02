package com.ujava.app.strings;

public class ComparandoCadenas {

    public static final void comparaCadena(){

        //Comparando cadenas (Pool de cadenas
        String cadena1 = "Java";
        String cadena2 = "Java";
        String cadena3 = new String("Java");

        System.out.println("la cadena 1 = " + cadena1 + " y cadena2 = " + cadena3 + " son iguales? ");
        System.out.println(cadena1 == cadena3);

    }



}
