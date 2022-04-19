package com.kreitek.refactor.bien.validadores;

import com.kreitek.refactor.bien.documento.Documento;

import static com.kreitek.refactor.bien.operadores.operadoresCIF.controlladorCIF;

public class validarCIF {

    public static int validardorCIF(Documento revisarCIF) {
        
        return revisarCIF.nDNI != null ? controlladorCIF(revisarCIF) : 0;
    }

}

