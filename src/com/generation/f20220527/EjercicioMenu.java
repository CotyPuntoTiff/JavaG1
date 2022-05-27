package com.generation.f20220527;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class EjercicioMenu {
    public static void main(String[] args) {

        //Crear un menu de comida
        //lo crearemos con un HashMap
        //Solicitar al usuario que elija el plato
        //Imprimir el plato

        //Crear un Hashmap menú
        HashMap Carta = new HashMap();
        //Arraylist para cada Menu
        ArrayList<String> Menu1 = new ArrayList<String>();
        Menu1.add("Entrada: Ensalada mixta");
        Menu1.add("Plato de Fondo: Carne Mechada con Puré");
        Menu1.add("Postre: Leche Asada");
        ArrayList<String> Menu2 = new ArrayList<String>();
        Menu2.add("Entrada: Sopa de verduras");
        Menu2.add("Plato de Fondo: Quiché de verduras");
        Menu2.add("Postre: Suspiro Limeño");
        ArrayList<String> Menu3 = new ArrayList<String>();
        Menu3.add("Entrada: Ceviche");
        Menu3.add("Plato de Fondo: Pollo Asado con Arróz");
        Menu3.add("Postre: Macedonia de Frutas");

        // Crear un menú de comida.
        Carta.put("1", Menu1);
        Carta.put("2", Menu2);
        Carta.put("3", Menu3);
        //Mostramos la carta
        System.out.println("Menú 1 " + Menu1);
        System.out.println("Menú 2 " + Menu2);
        System.out.println("Menú 3 " + Menu3);

        //for
        /*Carta.keySet();
		for(Object clave : Carta.keySet()) {
			System.out.println("Menú "+ clave +" "+ Carta.get(clave));
		}*/

        Scanner sc = new Scanner(System.in);
        //Espacio
        System.out.println();
        //variables
        Object opcionDelCliente;

        //Capturando opción del cliente
        System.out.println("Ingrese el menú que desea (1, 2 o 3):");
        opcionDelCliente = sc.nextLine();

        //imprimiendo opción del cliente
        //System.out.println(Carta.(opcionDelCliente));//quería mostrar el menú, pero no pude
        System.out.println(Carta.get(opcionDelCliente));


    }
}



