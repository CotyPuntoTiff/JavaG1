package com.generation.f20220526;

import java.util.Scanner;

public class Funciones {
    public static void main(String[] args) {
        //----Funciones---
        // 4 tipos de funciones
        // nombre_funcion se escribe con minuscula la primera letra

        saludo();// llamado al metodo
        calculoSumaPares(true,23,"33",44l,"sumar");

        int edad = obtenerEdad();
        System.out.println(edad);

        boolean mayorOMenor = validarMayorEdad(edad);

        if(mayorOMenor == true ) {
            System.out.println("Puede ingresar al curso");
        }else {
            System.out.println("No tiene la edad suficiente para acceder al curso");
        }
    }




    //static, nos permite acceder al metodo
    public static void saludo(){
        //solicitar el ingreso de datos
        System.out.println("Buenos dias");
    }

    //boolean mayorOMenor = validarMayorEdad(edad);

	//	if(mayorOMenor) {
    //    System.out.println("Puede ingresar al curso");
    //}else {
    //    System.out.println("No tiene la edad suficiente para acceder al curso");
    //}



    // Las funciones de tipo void no retornan, solo ejecutan
    //accesador de tipo_de_retorno nombre_funcion(parametros a recibir)
    public static void calculoSumaPares(boolean verdad, int numero1, String numero2, Long numero3, String accion){
        System.out.println(numero1 + numero3 + Integer.parseInt(numero2));
    }



    public void calculoSumaImpares(){//sin parametros, piden los datos dentro de la funcion
        //solicitar el ingreso de datos
    }



    //funciones que retornan un tipo de datos
    public static Integer obtenerEdad(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese edad");
        Integer edad = scanner.nextInt();//18;
        return edad;//retornar el contenido de la variable
    }



    // va a retornar un boolean, nuestra funcion se llama validarMeyorEdad y le entrego el parametro Integer edad
    public static Boolean validarMayorEdad(Integer edad){

        //retornara true o false
        if(edad >= 18) {
            System.out.println("Es mayor de edad");
            return true;
        }else{
            System.out.println("Es menor de edad");
            return false;
        }

    }


}
