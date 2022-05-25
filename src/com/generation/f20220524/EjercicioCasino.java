package com.generation.f20220524;

import java.util.Scanner;

public class EjercicioCasino {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //validar la mayoria de edad
        //establecer punto critico ->18

        //Solicitar todos los string
        //Primer paso, solicitamos los string, nombre, apellido y direccion
        System.out.println("Ingrese su Nombre");
        String nombre = sc.nextLine();
        System.out.println("ingrese su Apellido");
        String apellido = sc.nextLine();
        System.out.println("ingrese su Direccion sin numero");
        String direccion = sc.nextLine();



        //Solicitud de Numeros
        //Como segundo paso solicitamos los datos numericos, edad, numero de direccion
        System.out.println("ingrese el numero de su direccion");
        Integer numeroDireccion = sc.nextInt();
        System.out.println("ingrese su edad");
        Integer edad = sc.nextInt();


        // -----Validaciones-----


        // validacion de la mayoria de edad

        // variable de mayoria de edad
        int mayoriaEdad = 18; // Esta es la edad minima de ingreso


        if (edad >= mayoriaEdad){
            System.out.println("usted es mayor de edad, puede apostar");// respuesta si es mayor de edad

            // Tercer paso ingresar el saldo que tiene ($)
            System.out.println("Ingrese su saldo");
            Integer saldoBolsillo = sc.nextInt();

            // el saldo minimo debe ser de 50.000/ no puede apostar con menos
            if( saldoBolsillo >= 50000) {
                System.out.println("Usted puede ingresar por contar con un saldo mayor a 50000");
                // apuesta
                // cuanto va a apostar de los 50.000/ no puede apostar mas de lo que tenga/ minimo de apuesta 10.000
                Integer saldoMinimoApuesta = 10000;
                Integer saldoMaximoApuesta = saldoBolsillo;

                // Solicitud de apuesta

                System.out.println("Ingrese apuesta (minimo 10000, maximo "+ saldoBolsillo +")");
                Integer apuesta =sc.nextInt();

                if (apuesta >= 10000 && apuesta <= saldoBolsillo){
                    System.out.println("Hola "+ nombre +" "+ apellido + ", usted hizo una puesta por el valor de: " + apuesta);
                }
            }else {
                System.out.println("Usted no puede ingresar por no contar con un saldo minimo de 50000");
            }
        }else {
            System.out.println("no esta permitido su ingreso por ser menor de edad"); //respuesta si es men
        }
    }

    public static class CalculoPromedio {
        public static void main(String[] args) {
            //int cantidadNotas = 12;
            //arreglo notas
            Integer[] notas = {-20,-50,67,-99,-10,0,88,77,58,79,33,50};
            // arreglo de notas
            int sumaNotas = 0;//20
            int notasFueraDeRango = 0;


            //como recorrer el arreglo de notas
            for (int i = 0; i < notas.length; i++) {//i=0
                //validar la nota (negativa o mayor a 100)
                if (notas[i] < 0 || notas[i] > 100){
                    System.out.println("la nota:"+ notas[i] + " en la posicion "+ (i+1) + " esta fuera de rango");
                }

                sumaNotas = sumaNotas + notas[i]; //accedemos a los valores notas [i]
            }
            //System.out.println("Tienes " + notasFueraDeRango++ + " notas fueras de rango");
            //System.out.println("suma de notas: " + sumaNotas);

            if (notasFueraDeRango == 0 ){//no hay notas fuera de rango

            }
            //promedio-> suma todas las notas / cantidad de notas;
            float promedio = sumaNotas / notas.length;


            /* TODO validar el orden >= */
            //101

            // PUNTO CRITICO
            // Reprobado 0 > promedio < 50
            // Aprobado >= 50 promedio <=100
            if(promedio >= 50 && promedio <= 100) {
                System.out.println("Aprobado");
                System.out.println("El promedio es: "+promedio);
            } else if (promedio >= 0 && promedio < 50) {
                System.out.println("Reprobado");
                System.out.println("El promedio es: "+promedio);
            } else {
                System.out.println("error de calculo del promedio");
            }
        }
    }
}
