package com.kreitek.refactor.bien.validadores;

import com.kreitek.refactor.bien.documento.Documento;

import static com.kreitek.refactor.bien.operadores.operadoresNIE.ValidadorAscii;
import static com.kreitek.refactor.bien.operadores.operadoresNIE.comprobacionLetra;

public class validarNIE {
    protected static String nie;
    protected static String nieLetter;
    private static boolean esValido;

    public static int validarNIE(Documento revisarNIE) {
        
        nie = revisarNIE.nDNI.toUpperCase();
        
        nieLetter = nie.substring(0, 1);
        
        if (nie.length() == 9 && Character.isLetter(nie.charAt(8)
                
                && nieLetter.equals("X")
                
                || nieLetter.equals("Y")
                
                || nieLetter.equals("Z"))) {
            
            esValido = ValidadorAscii();
        }
        return esValido ? comprobacionLetra() : 0;
    }
}

