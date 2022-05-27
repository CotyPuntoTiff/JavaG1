package com.generation.f20220527;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.HashMap;

public class ColeccionesMap {
    public static void main(String[] args) {

        //Colecciones Map
        //Es lo mas cercano a la API
        //paras clave <-> valor
        //no se trabaja con la posicion, se trabaja con clave y valor

        //Estructura del hashMap k=clave v=valor
        //HashMap<k, v> map = new HashMap<k, v>();

        //Se puede escribir asi tambien ye s la que mas se usa
        HashMap objHashMap = new HashMap();

        objHashMap.put("Nombre","Coty");
        objHashMap.put("ApellidoP","Mardones");
        objHashMap.put("ApellidoM","Aravena");
        objHashMap.put("Edad", "27");
        System.out.println("Elementos del mapa");
        System.out.println(objHashMap);

        //si me sale null es por que no encontro la variable
        System.out.println("- obtener un valor a travez de la clave");
        System.out.println(objHashMap.get("ApellidoM"));

        //eliminar la clave y valor
        System.out.println("- Eliminando la clave y valor");
        System.out.println(objHashMap.remove("Edad"));

        System.out.println("- muestra todas las llaves disponibles");
        System.out.println(objHashMap.keySet());

        System.out.println("- mostrar todos los valores en el mapa");
        System.out.println(objHashMap.values());

        ArrayList<String> vocales = new ArrayList<String>();
        vocales.add("a");
        vocales.add("e");
        vocales.add("i");
        vocales.add("o");
        vocales.add("u");

        System.out.println("- mostrando arraylist vocales");
        objHashMap.put("vocales",vocales);
        System.out.println(objHashMap);

        //recorrer un hashmap
        System.out.println("- entrega los valores con un For");
        for(Object clave : objHashMap.keySet()) {
            System.out.println("clave: "+clave +" - valor: "+objHashMap.get(clave));

        }


    }
}
