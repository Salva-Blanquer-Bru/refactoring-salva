package com.kreitek.refactor.bien.validadores;

import com.kreitek.refactor.bien.documento.Documento;

import static com.kreitek.refactor.bien.operadores.operadoresDNI.isNumeric;

public class validarDNI {
    static String dniChars="TRWAGMYFPDXBNJZSQVHLCKE";

    public static int validadorDNI(Documento revisarDocumento){
        
        String intPartDNI = revisarDocumento.nDNI.trim().substring(0, 8);
        
        char ltrDNI = revisarDocumento.nDNI.charAt(8);
        
        int valnDNI = Integer.parseInt(intPartDNI) % 23;
        
        return  revisarDocumento.nDNI.length()!= 9 || !isNumeric(intPartDNI) || dniChars.charAt(valnDNI)!= ltrDNI ?  0: 1;
    }
}
