package com.generation.f20220601.pruebasUnitarias;

public class Calculadora {

    public int suma(int numero1, int numero2){
        return numero1 + numero2;
    }

    public int resta(int numero1, int numero2){
        return numero1 - numero2;
    }

    public int multiplicacion(int numero1, int numero2){
        return numero1 * numero2;
    }

    public String division(int numero1, int numero2) {
        if(numero2 != 0) {
            String resultado = Integer.toString(numero1/numero2);
            return resultado;
        }
        return "No se puede dividir por cero";

    }

    // Metodo numero par
    public String numPar(int num1, int i) {
        String resultado;
        if (num1 % 2 == 0) {
            resultado = "Es par";
        } else {
            resultado = "Es Impar";
        }
        return resultado;
    }





}
