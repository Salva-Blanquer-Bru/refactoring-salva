package com.kreitek.refactor.bien.operadores;

import com.kreitek.refactor.bien.Main;
import com.kreitek.refactor.bien.documento.Documento;

import static com.kreitek.refactor.bien.insertarDatos.documentos;
import static com.kreitek.refactor.bien.validadores.validarDocumentos.ValidarDocumento;

public class Impresora extends Main {
    
    public static void Titulo() {
        
        System.out.println("=====================");
        
        System.out.println("Vamos a refactorizar!");
        
        System.out.println("=====================");
    }

    public static void PintarDocumentos() {
        
        for (Documento documento : documentos) {
            
            Boolean validador = ValidarDocumento(documento);
            
            System.out.println(documento.tipo + " " + documento.nDNI + " es: " + validador);
        }

    }
}
