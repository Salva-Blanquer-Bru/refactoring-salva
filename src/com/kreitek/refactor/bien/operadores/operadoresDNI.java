package com.kreitek.refactor.bien.operadores;

public class operadoresDNI extends com.kreitek.refactor.bien.validadores.validarDNI {
    public static boolean isNumeric(String strNum) {

        if (strNum == null) {

            return false;
        }
        try {
            Double.parseDouble(strNum);

        } catch (NumberFormatException nfe) {

            return false;
        }
        return true;
    }
}
