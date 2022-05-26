package com.generation.f20220525;

import java.util.Scanner;

public class CalculadoraComisiones2 {

    public static void main(String[] args) {
        //--------Calculadora de comisiones-------

        /*Aplicación que tome la entrada númerica*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el monto de venta:");
        int montoVenta = sc.nextInt();

        //Variables
        final float porcentaje1 = 0.1f;
        final float porcentaje2 = 0.2f;
        final float porcentaje3 = 0.3f;

        /*Se debe calcular la comisión en función de;
          * Comisión de ventas:
          >= a   $10000 - 30%5
          $5001 - $9999 - 20%
          $5000 no tiene comision
          $1001 - $4999 - 10%
          <= a     $1000 - N/A */

        if (montoVenta >= 10000) {
            System.out.println("Su comision es de: " + montoVenta * porcentaje3 + " pesos");
        } else if (montoVenta >= 5001) {
            System.out.println("Su comision es de: " + montoVenta * porcentaje2 + " pesos");
        } else if (montoVenta < 5000 && montoVenta >= 1001) {
            System.out.println("Su comision es de: " + montoVenta * porcentaje1 + " pesos");
        } else {
            System.out.println("No tiene comision");
        }


//*****Descuento en el Cine ******

//ticket normal  $3500
//<= 15 años   60% descuento
//>= 60 años   55% descuento

// Solicitar su edad por consola
        System.out.println("Ingrese su edad ");
        int edad = sc.nextInt();
        int valorTicket = 3500;
        float descuento60 = valorTicket * 0.4f; //valor final con el descuento
        float descuento55 = valorTicket * 0.45f; //valor final con el descuento
        float ticketMenos60 = valorTicket * 0.6f; // valor descuento
        float ticketMenos55 = valorTicket * 0.55f; // valor descuento

        //////// Ahora estan bien con el proposito realizado    vale gracias

//verificar si el usuario cumple para el descuento

        if (edad <= 15) {//aqui va un 60% de descuento
            System.out.println("Su descuento es de " + ticketMenos60 + " y el valor de su entrada es " + descuento60);
        } else if (edad >= 60) {//aqui va un 55% de descuento
            System.out.println("Su descuento es de " + ticketMenos55 + " y el valor de su entrada es " + descuento55);}
 //       } else (){
  //          System.out.println("El valor de su entrada es" + valorTicket);}
    }

}

