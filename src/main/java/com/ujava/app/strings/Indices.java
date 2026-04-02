package com.ujava.app.strings;

public class Indices {

    /**
     * Manejo d eindices en una cadena
     */
    public static final void test(){
        /**
         * Los indices deuna cadena en java estan indexados de manera secuencial, comenzando desde 0 hasta la longitud de la cadena menos 1
         */

        String cadena = new String("Hola mundo");

        //Se recupera el primer caracter de `cadena`
        char primero = cadena.charAt(0);

        System.out.println(primero);
    }

}
