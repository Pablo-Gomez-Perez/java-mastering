package com.ujava.app.strings;

import com.ujava.app.utilsXd.ConsoleUI;

public class ReemplazarSubcadenas {

    private static final String miCadena = "Esto es una fiesta bien loca";

    public static void testito(){

        ConsoleUI.renderTitle("Reemplazar Subcadenas");
        System.out.println("Cadena: " + miCadena);
        ConsoleUI.renderLine(miCadena.length() + 10);

        String nuevaCadena = miCadena.replace("fiesta","vaina");

        System.out.println("nueva cadena: \n" + nuevaCadena);
        ConsoleUI.renderLine(nuevaCadena.length() + 10);

    }

}
