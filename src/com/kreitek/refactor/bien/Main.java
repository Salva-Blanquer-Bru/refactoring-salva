package com.kreitek.refactor.bien;

import static com.kreitek.refactor.bien.insertarDatos.insertarDocumentos;
import static com.kreitek.refactor.bien.operadores.Impresora.PintarDocumentos;
import static com.kreitek.refactor.bien.operadores.Impresora.Titulo;

public class Main {

    public static void main(String[] args) {

        Titulo();

        insertarDocumentos();

        PintarDocumentos();
    }
}