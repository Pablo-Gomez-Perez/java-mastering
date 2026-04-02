package com.ujava.app.strings;

public class Metodos {

    public static String miCadena = new String("Hola Mundo loco");

    public static void test(){
        System.out.println("===============================");
        System.out.println("Cadena: " + miCadena);
        System.out.println("===============================");
        System.out.println("Tamaño: " + largoCadena());
        System.out.println("Nueva: " + reemplazarCaracter());
        System.out.println("En mayusculas: " + convertirMayusculas());
        System.out.println("En minusculas: " + convertirMinusculas());
    }

    private static int largoCadena(){
        return miCadena.length();
    }

    private static String reemplazarCaracter(){
        return miCadena.replace('o','e');
    }

    private static String convertirMayusculas(){
        return miCadena.toUpperCase();
    }

    private static String convertirMinusculas(){
        return miCadena.toLowerCase();
    }
}
