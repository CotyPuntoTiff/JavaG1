package com.generation.f20220525;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

    //menu
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese opcion");
        System.out.println(" 1 sumar \n 2 restar \n 3 multiplicar \n 4 dividir");
        int opcion = sc.nextInt() ;
        //int num1 = ;
        //int num2 = ;

        switch (opcion) {
            case 1:
                //accion para la opcion 1

                break;
            case 2:
                //accion para la opcion 2

                break;
            case 3:
                //accion para la opcion 3

                break;
            case 4:
                //accion para la opcion 4

                break;

            default:
                System.out.println("opcion invalida, por favor ingrese un numero del 1 al 4.");
                break;
        }
    }
}
