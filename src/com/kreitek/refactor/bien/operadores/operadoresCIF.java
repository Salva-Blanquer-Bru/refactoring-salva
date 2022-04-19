package com.kreitek.refactor.bien.operadores;

import com.kreitek.refactor.bien.documento.Documento;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class operadoresCIF extends com.kreitek.refactor.bien.validadores.validarCIF {
    public static int controlladorCIF(Documento revisarCIF){
        
        final String cifUP = revisarCIF.nDNI.toUpperCase();


        if ("ABCDEFGHJKLMNPQRSUVW".indexOf(cifUP.charAt(0)) == -1) {
            
            return 0;
        }


        final Pattern mask = Pattern
                
                .compile("[ABCDEFGHJKLMNPQRSUVW][0-9]{7}[A-Z0-9]{1}");
        
        final Matcher matcher = mask.matcher(cifUP);
        
        if (!matcher.matches()) {
            
            return 0;
        }

        final char primerCar = cifUP.charAt(0);
        
        final char ultimoCar = cifUP.charAt(cifUP.length() - 1);


        com.kreitek.refactor.bien.documento.tipoUltCaracter tipUltCar;


        if (primerCar == 'P' || primerCar == 'Q' || primerCar == 'S' || primerCar == 'K' || primerCar == 'W') {
            
            tipUltCar = com.kreitek.refactor.bien.documento.tipoUltCaracter.LETRA;
            
            if (!(ultimoCar >= 'A' && ultimoCar <= 'Z')) {
                
                return 0;
            }

        } else if (primerCar == 'A' || primerCar == 'B' || primerCar == 'E'
                
                || primerCar == 'H') {
            
            tipUltCar = com.kreitek.refactor.bien.documento.tipoUltCaracter.NUMERO;
            
            if (!(ultimoCar >= '0' && ultimoCar <= '9')) {
                
                return 0;
            }

        } else {
            
            tipUltCar = com.kreitek.refactor.bien.documento.tipoUltCaracter.AMBOS;
        }


        final String digitos = cifUP.substring(1, cifUP.length() - 1);


        Integer sumaPares = 0;
        
        for (int i = 1; i <= digitos.length() - 1; i = i + 2) {
            
            sumaPares += Integer.parseInt(digitos.substring(i, i + 1));
        }


        Integer sumaImpares = 0;
        
        for (int i = 0; i <= digitos.length() - 1; i = i + 2) {
            
            Integer cal = Integer.parseInt(digitos.substring(i, i + 1)) * 2;
            
            if (cal.toString().length() > 1) {
                
                cal = Integer.parseInt(cal.toString().substring(0, 1))
                        
                        + Integer.parseInt(cal.toString().substring(1, 2));
            }
            sumaImpares += cal;
        }


        final Integer total = sumaPares + sumaImpares;


        Integer numControl = 10 - (total % 10);


        int pos = numControl == 10? 0:numControl;
        
        final char carControl = "JABCDEFGHI".charAt(pos);


        if (tipUltCar == com.kreitek.refactor.bien.documento.tipoUltCaracter.NUMERO) {

            final Integer ultCar = Integer.parseInt(Character
                    
                    .toString(ultimoCar));
            
            if (pos != ultCar) {

                return 0;
            }

        } else if (tipUltCar == com.kreitek.refactor.bien.documento.tipoUltCaracter.LETRA) {
            
            if (carControl != ultimoCar) {
                
                return 0;
            }

        } else {

            Integer ultCar;

            ultCar = "JABCDEFGHI".indexOf(ultimoCar);

            if (ultCar < 0){
                
                ultCar = Integer.parseInt(Character.toString(ultimoCar));
                
                if (pos != ultCar) {
                    
                    return 0;
                }
            }
            if ((pos != ultCar) && (carControl != ultimoCar)) {
                
                return 0;
            }
        }
        return 1;
    }
    }

