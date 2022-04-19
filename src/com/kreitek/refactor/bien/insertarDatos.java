package com.kreitek.refactor.bien;

import com.kreitek.refactor.bien.documento.Documento;

import java.util.ArrayList;
import java.util.List;


public class insertarDatos {

    public static List<Documento> documentos = new ArrayList<>();
    public static void insertarDocumentos(){

        documentos.add(new Documento(com.kreitek.refactor.bien.documento.tipoDocumento.DNI, "11111111H", null));

        documentos.add(new Documento(com.kreitek.refactor.bien.documento.tipoDocumento.DNI, "24324356A", null));

        documentos.add(new Documento(com.kreitek.refactor.bien.documento.tipoDocumento.NIE, "X0932707B", null));

        documentos.add(new Documento(com.kreitek.refactor.bien.documento.tipoDocumento.NIE, "Z2691139Z", null));

        documentos.add(new Documento(com.kreitek.refactor.bien.documento.tipoDocumento.CIF, "W9696294I", null));

        documentos.add(new Documento(com.kreitek.refactor.bien.documento.tipoDocumento.CIF, "W9696294A", null));
    }
}
