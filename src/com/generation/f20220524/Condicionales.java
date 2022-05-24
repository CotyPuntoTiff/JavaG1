package com.generation.f20220524;

import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //validar la mayoria de edad
        //establecer punto critico ->18

        int mayoriaEdad = 18;

        //solicitar el ingreso de edad
        System.out.println("ingrese su edad");
        int edad = sc.nextInt();// capturando el ingreso por consola

        //validacion de mayoria de edad
        if (edad >= mayoriaEdad){
            System.out.println("usted es mayor de edad");
        }else {
            System.out.println("no esta permitido su ingreso");
        }

        //Solicitar todos los string
        // nombre, apellido, direccion
        // solicitar todo lo que es numerico, edad, numero de direccion
        // pedir saldo ($)

        // validacion
        // mayoria de edad
        // el saldo minimo debe ser de 50.000/ no puede apostar con menos

        // apuesta
        // cuanto va a apostar de los 50.000/ no puede apostar mas de lo que tenga/ minimo de apuesta 10.000



        String nombre = sc.nextLine();
    }
}
