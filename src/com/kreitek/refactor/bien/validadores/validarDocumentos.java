package com.kreitek.refactor.bien.validadores;

import com.kreitek.refactor.bien.documento.Documento;

public class validarDocumentos {
    public static Boolean ValidarDocumento(Documento identificador) {
        return identificador.validarDNI() == 1;
    }
}
