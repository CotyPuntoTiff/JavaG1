package com.generation.f20220526;

public class FuncionesCalculadora {
    public static void main(String[] args) {
        //libreria Math

        //elevar o potencia   (numero, exponente)
        double numeroElevado = Math.pow(4.5,4);
        System.out.println("elevar o potencia");
        System.out.println(numeroElevado);

        // redondear al entero mayor
        double enteroMayor = Math.ceil(numeroElevado);
        System.out.println("redondea al entero mayor");
        System.out.println(enteroMayor);

        //redondear al entero menor
        double enteroMenor = Math.floor(numeroElevado);
        System.out.println("redondea al entero menor");
        System.out.println(enteroMenor);

        //redondeo
        double enteroRedondeado = Math.round(numeroElevado);
        System.out.println("redondeo");
        System.out.println(enteroRedondeado);

//-----------------Numeros Aleatorios -------------

        //numeros aleatorios entre el 0.0 y 1.0
        double aleatorio = Math.random();
        System.out.println("numeros aleatorios entre el 0.0 y 1.0");
        System.out.println(aleatorio);

        //numeros aleatorios entre 0 y 10
        double num010 = Math.random() * 10;
        System.out.println("numeros aleatorios entre el 0 y 10");
        System.out.println(num010);

        //numeros aleatorios entre 0 y 100
        double num0100 = Math.random() * 100;
        System.out.println("numeros aleatorios entre 0 y 100");
        System.out.println(num0100);

        //numeros aleatorios entre 2 y 8
        //(Math.random() * (maximo-minimo)) + el minimo
        double num28 = (Math.random() * (8-2)) + 2;
        System.out.println("numeros aleatorios entre el 2 y 8");
        System.out.println(num28);
        System.out.println("numero aleatorio con valor absoluto positivo");
        System.out.println(Math.abs(num28));
        System.out.println("numero aleatorio redondeado");
        System.out.println(Math.round(num28));

    }
}
