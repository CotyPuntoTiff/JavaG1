package com.generation.f20220531.manager;

import com.generation.f20220531.Cliente;

import java.util.List;

//logica de negocio
public class ClienteManager {

    //recorrer el arreglo e imprimir
    public void recorrerrreglo(List<Cliente>listaCliente){

        for (int i = 0; i < listaCliente.size(); i++){
            //antes era una variable y ahora
            System.out.println("Cliente " + i + ": \n" + listaCliente.toString());
        }

    }
}
