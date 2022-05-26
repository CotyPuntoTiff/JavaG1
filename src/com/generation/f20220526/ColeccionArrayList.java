package com.generation.f20220526;

import java.util.ArrayList;
import java.util.Collections;

public class ColeccionArrayList {
    public static void main(String[] args) {
        //ArrayList dinamicos

        //palabra reservada ArrayList<tipoDeDato> = new ArrayList<TipoDeDato>();

        //es una isntancia de clase, definicion de arreglo
        ArrayList<String> colores = new ArrayList<String>();
        ArrayList<Integer> numerosPares = new ArrayList<Integer>();


        //agregar un elemento a la lista
        colores.add("rojo");
        colores.add("azul");
        //si existe un elemento en esa posicion lo desplaza a la derecha (movio al azul, posiciona el verde entre rojo y azul)
        colores.add(1, "verde");

        //no deja agregar en la posicion que no existe
        //colores.add(5,"amarillo");

        System.out.println("- imprime el contenido de colores \n" + colores);

        //acceder al elemento en la posicion solicitada
        System.out.println("- elemento en posicion 1 \n" + colores.get(1));

        //te dice el tama;o del arreglo size()
        System.out.println("- tamano del elemento \n" + colores.size());

        //modificar un elemento
        colores.set(1, "negro");

        //quitar un elemento variable.remove(posicion)
        colores.remove(2);
        System.out.println("- array sin elemento en posicion 2 \n" + colores);


        //recorrer arreglos
        for (int i = 0; i< colores.size(); i++){
            System.out.println("- recorriendo con for \n" + colores.get(i));
        }
        for (String color : colores){
            System.out.println("- recorriendo con forEach \n" +color);
        }

        //ordenar el arreglo de forma ascendente, afecta directamente al arreglo, no es temporal
        Collections.sort(colores);
        System.out.println("- ordeno el arreglo alfabeticamente \n" + colores);



        //quitar todos los elementos
        colores.clear();
        System.out.println("- se elimina el contenido del arreglo colores \n" + colores);

        numerosPares.add(14);
        numerosPares.add(2);
        numerosPares.add(8);
        numerosPares.add(6);
        numerosPares.add(10);
        numerosPares.add(20);

        System.out.println("- Numeros pares desordenados \n" + numerosPares+" ");
        Collections.sort(numerosPares);
        System.out.print("- Numeros pares ordenados \n" + numerosPares+" ");

        //no ordena decendente, solo invierte el orden
        System.out.println();
        Collections.reverse(numerosPares);
        System.out.println("- Numeros pares orden invertido" +
                " \n" + numerosPares + " ");




    }
}
