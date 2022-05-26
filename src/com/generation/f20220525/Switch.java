package com.generation.f20220525;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        //menu
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese opcion");
        System.out.println(" 1 sumar \n 2 restar \n 3 multiplicar \n 4 dividir");
        int opcion = sc.nextInt();
        //int num1 = ;
        //int num2 = ;

        switch (opcion) {
            case 1://sumar
                //accion para la opcion 1
                System.out.println("se suma");
                break;
            case 2://resta
                //accion para la opcion 2
                System.out.println("se resta");
                break;
            case 3://multiplicacion
                //accion para la opcion 3
                System.out.println("se multiplica");
                break;
            case 4://division
                //accion para la opcion 4
                System.out.println("se divide");
                break;

            default:
                System.out.println("opcion invalida, por favor ingrese un numero del 1 al 4.");
                break;
        }
        System.out.println("fuera del switch");
    }
}
