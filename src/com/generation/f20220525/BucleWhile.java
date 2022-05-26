package com.generation.f20220525;

import java.lang.invoke.MethodHandles;
import java.util.Scanner;

public class BucleWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // variables
        int limiteSuperior;
        int limiteInferior;
        int numAleatorios;
        int sumaDentroRango = 0;
        int numFueraRango = 0;
        int numIgualRango = 0;

        // Solicitud de limites

        System.out.println("Favor ingrese el limite inferior");
        limiteInferior = sc.nextInt();

        System.out.println("Favor ingresar el limite superior");
        limiteSuperior = sc.nextInt();

        // Validación de los limites
        while (limiteInferior > limiteSuperior) {
            System.out.println("Favor vuelva a ingresar su limite inferior. \nRecuerde que el limite inferior debe ser menor al limite mayor");
            limiteInferior = sc.nextInt();
            System.out.println("Favor vuelva a ingresar su limite superior. \nRecuerde que el limite superior debe ser mayor al limite menor");
            limiteSuperior = sc.nextInt();
        }


        // Solicitud de numeros aleatorios
        do {
            System.out.println("Favor ingrese numeros aliatorios distintos de 0. \nSi desea finalizar solo ingrese el numero 0");
            numAleatorios = sc.nextInt();

            if (numAleatorios != 0) {
                if (numAleatorios >= limiteInferior && numAleatorios <= limiteSuperior) {
                    sumaDentroRango = sumaDentroRango + numAleatorios;
                    if (numAleatorios == limiteInferior || numAleatorios == limiteSuperior) {
                        numIgualRango = numIgualRango + 1;
                    }
                } else {
                    numFueraRango = numFueraRango + 1;
                }
            }
        } while (numAleatorios != 0);

        System.out.println("La suma de los valores que se encuentra dentro de los limites es: " + sumaDentroRango);
        System.out.println("La cantidad de numeros fuera del rango es de: " + numFueraRango);
        System.out.println("La cantidad de numeros iguales a los limites es de: " + numIgualRango);
        System.out.println("Programa Finalizado");
        }
    }
}

