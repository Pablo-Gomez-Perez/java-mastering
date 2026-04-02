package com.ujava.app._17_reto_detallepersona;

/**
 * Se solicita crear una clase llamada detalle persona que realice lo siguiente: <br>
 * 
 * <p> Debe declarar las siguiente variables y deberas asignar los valores que corresponda, ademas de seleccionar el tipo de dato adecuado
 * para cada variable:</p>
 * 
 * <ul>
 *  <li>Nombre completo</li>
 *  <li>Edad</li>
 *  <li>Altura en metros</li>
 *  <li>Pais de origine</li>
 *  <li>Indicar si es soltero o casado con un solo calacter ejemplo:
 *      'C'- Casado 'S'-soltero</li>
 * </ul>
 * 
 */
public class Solucion {

    public static void solucion(){
        String nombreCompleto = "Juanjo Menites";
        int edad = 25;
        float altura = 1.71f;
        String paisOrigen = "Mexico";
        char estadoCivil = 'S';

        System.out.println("Nombre completo: " + nombreCompleto + "\n"
            + "edad: " + edad + "\n"
            + "Altura: " + altura + "\n"
            + "Pais de origen: " + paisOrigen + "\n"
            + "Estado Civil: " + estadoCivil + "\n");
    }    

}
