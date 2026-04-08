package com.ujava.app.utilsXd;

public class ConsoleUI {

    public static void renderLine(int size){
        String line = prepareLine(size);
        System.out.println(line);
    }

    public static void renderTitle(String tittle){
        String preparedTittle = prepareMarc(tittle);
        System.out.println(preparedTittle);
    }

    private static String prepareLine(int size){

        StringBuilder sb = new StringBuilder();
        sb.repeat("=", Math.max(0, size));
        return sb.toString();
    }

    /**
     * La idea es que dibuje una especie de titulo enmarcado.*
     * @param message es el titulo a enmarcar
     * @return
     */
    private static String prepareMarc(String message){

        StringBuilder sb = new StringBuilder();
        int marcSize = message.length() + 4; //+4 para tener 2 caracteres limpios a inicio y a final;

        sb.append(prepareLine(marcSize)).append("\n");
        sb.append("  ").append(message).append("  \n");
        sb.append(prepareLine(marcSize));

        return sb.toString();
    }
}
