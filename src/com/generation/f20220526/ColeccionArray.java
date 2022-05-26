package com.generation.f20220526;

import java.util.Arrays;

public class ColeccionArray {
    public static void main(String[] args) {

        //Array o Arreglos ESTATICOS (NO SE LE PUEDEN AGREGAR MAS ELEMENTOS)
        String[] colores = {"red", "blue", "yellow", "orange", "black"};
        Integer[] numerosPares = {2,4,6,8,10,12};
        int[] primerosNumeros = {1,2,3,4,5,6,7,8,9,0};

        //posicion inicial es cero (0)
        System.out.println(colores[0]);
        System.out.println(numerosPares[0]);
        System.out.println(primerosNumeros[0]);

        //nombreArray[posicion]-> accediendo al elemento del arreglo en la posicion
        System.out.println("acceder al puesto 3 de colores: " + colores[3]);
        System.out.println("acceder al puesto 3 de numerosPares: " + numerosPares[3]);
        System.out.println("acceder al puesto 3 de primerosNumeros: " + primerosNumeros[3]);

        numerosPares[3] = 14;//modificando el elemento en esa posicion
        System.out.println("acceder al puesto 3 de numerosPares: " + numerosPares[3]);// ahora es 14

        //Muestra error, dice que esta fuera del indice
        //numerosPares[6] = 14;
        //no podemos agregaar por posicion si no existe el elemento


        System.out.println("longitud de colores: "+colores.length);
        System.out.println("longitud de numerosPares: " + numerosPares.length);
        System.out.println("longitud de primerosNumeros: " + primerosNumeros.length);

        System.out.println("Impresion de colores.toString" + colores.toString());
        System.out.println("Impresion de numerosPares.toString" +numerosPares.toString());
        System.out.println("Impresion de primerosNumeros.toString" +primerosNumeros.toString());

        //imprime el contenido del arreglo
        System.out.println("Imprime el array de colores" + Arrays.toString(colores));
        System.out.println("Imprime el array de numerosPares" +Arrays.toString(numerosPares));
        System.out.println("Imprime el array de PrimerosNumeros" +Arrays.toString(primerosNumeros));

        // Recorrer arreglos

        for (int i = 0 ; i < primerosNumeros.length; i++){
            System.out.print(primerosNumeros[i] + ", ");
        }
        System.out.println("\n");

        //es un foreach
        // saca el primer elemento de la variable y lo asigna en elemento (i)
        //luego lo imprime con el sout
        for (int elemento : primerosNumeros){
            System.out.println(elemento);
        }
        //es un foreach de string
        // saca el primer elemento de la variable y lo asigna en elemento (i)
        //luego lo imprime con el sout
        for (String elemento : colores){
            System.out.println(elemento);
        }

    }
}
