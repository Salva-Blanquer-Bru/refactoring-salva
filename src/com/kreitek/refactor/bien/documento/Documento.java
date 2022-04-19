package com.kreitek.refactor.bien.documento;

import java.util.Date;

import static com.kreitek.refactor.bien.validadores.validarCIF.validardorCIF;
import static com.kreitek.refactor.bien.validadores.validarDNI.validadorDNI;
import static com.kreitek.refactor.bien.validadores.validarNIE.validarNIE;
public class Documento {

    public tipoDocumento tipo;
    public String nDNI;
    public Date fechaVal;

    public Documento(tipoDocumento tipo, String nDNI, Date fechaVal) {

        this.tipo = tipo;

        this.nDNI = nDNI;

        this.fechaVal = fechaVal;
    }

    public int validarDNI() {

        switch (this.tipo) {

            case DNI:

               return validadorDNI(this);
               
            case CIF:
                
                return validardorCIF(this);
                
            case NIE:
                
               return  validarNIE(this);
               
            default:
                
                return -99;
        }}}
    
