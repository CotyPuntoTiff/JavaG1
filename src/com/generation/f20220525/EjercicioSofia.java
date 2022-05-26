package com.generation.f20220525;

import java.util.Scanner;

public class EjercicioSofia {
    public static void main(String[] args) {

        //Solicitud de datos al usuario
        //Solicitar edad

        Scanner sc = new Scanner(System.in);
        int edad = 0;
        int opcion = 0;

        //ciclo DoWhile para verificar ingreso de datos positivos

        do{
            System.out.println("Ingrese su edad: ");
            edad = sc.nextInt();


        }while(edad < 18); //si es menor a 0 vuelve a consultar la edad

        //Validacion de la edad
        if (edad >= 70){
            opcion = 1; //valor de entrada para el switch

        }else if (edad >= 50){
            opcion = 2;//valor de entrada para el switch

        }else if (edad >= 30){
            opcion = 3;//valor de entrada para el switch

        }else if (edad >= 18) {
            opcion = 4;//valor de entrada para el switch
        }else{
            opcion = 5;
        }


        //Verificar la edad del usuario
        switch (opcion) {
            //1
            case 1: //Edad mayor a 70
                //
                System.out.println("Usted debe pagar $500");
                break;
            //2
            case 2: //Edad entre 50 y 69
                System.out.println("Uste debe pagar $400");
                break;
            //3
            case 3: //Edad entre 30 y 49
                System.out.println("Usted debe pagar $250");
                break;
            //4
            case 4: //Edad hasta los 29
                System.out.println("Usted debe pagar $100");
                break;
            //numero menor a 0
            case 5:
                System.out.println("Usted es menor de edad");
            default:
                System.out.println("Ingrese su edad ");
                break;
        }
    }
}

