package com.generation.f20220524;

public class CalculoPromedio {
    public static void main(String[] args) {
        //int cantidadNotas = 12;
        //arreglo notas
        Integer[] notas = {20,-50,67,-99,-10,0,88,77,58,79,33,50};
        // arreglo de notas
        int sumaNotas = 0;//20
        int notasFueraDeRango = 0;


        //como recorrer el arreglo de notas
        for (int i = 0; i < notas.length; i++) {//i=0
            //validar la nota (negativa o mayor a 100)
            if (notas[i] < 0 || notas[i] > 100){

            }

            sumaNotas = sumaNotas + notas[i]; //accedemos a los valores notas [i]
        }
        System.out.println("suma de notas: " + sumaNotas);

        //promedio-> suma todas las notas / cantidad de notas;
        float promedio = sumaNotas / notas.length;
        /* TODO validar el orden >= */
        //101

        // PUNTO CRITICO
        // Reprobado 0 > promedio < 50
        // Aprobado >= 50 promedio <=100
        if(promedio >= 50 && promedio <= 100) {
            System.out.println("Aprobado");
        } else if (promedio >= 0 && promedio < 50) {
            System.out.println("Reprobado");
        } else {
            System.out.println("error de calculo");
        }
    }
}