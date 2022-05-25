package com.generation.f20220525;

import java.util.Scanner;

public class CalculadoraComisiones {
    public static void main(String[] args) {
        //--------Calculadora de comisiones-------

                /*Se debe calcular la comisión en función de;
          * Comisión de ventas:
          >= a   $10000 - 30%5
          $5001 - $9999 - 20%
          $5000 no tiene comision
          $1001 - $4999 - 10%
          <= a     $1000 - N/A */

        //capturar el ingreso por consola
        /*Aplicación que tome la entrada númerica*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su monto de ventas $");
        int montoDeVentas = sc.nextInt();
        String mensajeComision = "Su comision es $";
        float comision1 = (float) 0.3;
        float comision2 = (float) 0.2;
        float comision3 = (float) 0.1;

        if (montoDeVentas >= 10000) {
            System.out.println(mensajeComision + (montoDeVentas * comision1));
        } else {
            if (montoDeVentas >= 5001) {
                System.out.println(mensajeComision + (montoDeVentas * comision2));
            } else {
                if (montoDeVentas <5000 && montoDeVentas >= 1001) {
                    System.out.println(mensajeComision + (montoDeVentas * comision3));
                } else {
                    System.out.println("Usted no obtuvo comision");
                }
            }
        }

        //*****Descuento en el Cine ******

        //ticket normal  $3500
        //<= 15 años   60% descuento
        //>= 60 años   55% descuento

        int ticketNormal = 3500;
        String mensajeValorTicket = "El valor de su ticket es $";
        float descuentoNino = (float) 0.4;
        float descuentoAbuelo = (float) 0.45;
        float descuentoPorMayor = (float) 0.7;

        System.out.println("Ingrese su edad");
        int edad = sc.nextInt();

        //verificar si el usuario cumple para el descuento
        if( edad <= 15){
            System.out.println(mensajeValorTicket + (ticketNormal * descuentoNino));
        }else{
            if (edad >= 60){
                System.out.println(mensajeValorTicket + (ticketNormal * descuentoAbuelo));
            }else{
                System.out.println(mensajeValorTicket+ ticketNormal);
                System.out.println("\nCuantos ticket desea comprar?");
                int cantidadTickets = sc.nextInt();
                if (cantidadTickets >= 2){
                    System.out.println("Promocion 30% descuento. El valor de sus tickets es $" +(cantidadTickets*ticketNormal*descuentoPorMayor) );
                }else{
                    System.out.println("No aplica descuento, el valor de su ticket es $"+ ticketNormal );
                }
            }
        }
    }
}
