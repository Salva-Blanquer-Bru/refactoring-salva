package com.kreitek.refactor.bien.operadores;

public class operadoresNIE extends com.kreitek.refactor.bien.validadores.validarNIE {
    private static final char[] asignacionLetra = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X','B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public static boolean ValidadorAscii(){

        boolean validador;

        int i = 1;

        do {
            int caracterASCII = nie.codePointAt(i);

            validador = (caracterASCII > 47 && caracterASCII < 58);

            i++;

        } while(i < nie.length() - 1 && validador);

        return validador;
    }

    public static int comprobacionLetra(){

        if (nieLetter.equals("X")){

            nie = "0" + nie.substring(1,9);

        }else if(nieLetter.equals("Y")){

            nie = "1" + nie.substring(1,9);

        }else {

            nie = "2" +nie.substring(1,9);
        }
        char letra = nie.charAt(8);

        int resto = Integer.parseInt(nie.substring(1, 8)) % 23;

        return letra == asignacionLetra[resto] ? 1:0;
    }
}
