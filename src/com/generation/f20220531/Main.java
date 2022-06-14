package com.generation.f20220531;

import com.generation.f20220531.manager.ClienteManager;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Instancia de cliente
        Cliente cliente = new Cliente();
        int opcion = 0;


        //------------arreglo de clientes
        List<Cliente> listaCliente = new ArrayList<>();


        //------------
        /* cliente. Con el punto, vemos qué informacion trae el objeto cliente
        // por default es el contructor vacio, cuando lo construimos es con parametros*/

        cliente.setId(1234);
        cliente.setNombre("Donato");
        cliente.setRut("123456789-0");


        do{

        // Excepciones
        Cliente clienteDatosDinamicos = new Cliente();

        //Solicitando datos del cliente
        System.out.println("Ingrese su id de cliente");
        //Integer id = sc.nextInt();
        //clienteDatosDinamicos.setId(id);
        String idString = sc.nextLine();

        try {
            Integer id = Integer.parseInt(idString);
            clienteDatosDinamicos.setId(id);
        } catch (NumberFormatException nfe) {
            System.out.println("No se puede ingresar una letra como identificador" + nfe);
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error, contacte al administrador" + e);
        }


        //Datos de nombre
        System.out.println("Ingrese el nombre del Cliente");
        String nombre = sc.nextLine();
        clienteDatosDinamicos.setNombre(nombre);

        //Rut del cliente
        System.out.println("Ingrese el rut del Cliente");
        String rut = sc.nextLine();
        clienteDatosDinamicos.setRut(rut);

        //Correo del cliente
        System.out.println("Ingrese el correo del Cliente");
        String correo = sc.nextLine();
        clienteDatosDinamicos.setCorreo(correo);

        //no se puede dividir por 0
        //Integer division = 100/0;
        //System.out.println(division);

   // }catch(ArithmeticException ae;) {
   //     System.out.println("Error al dividir por cero");

    //} catch(NullPointerException npe;) {
    //    System.out.println("No se puede realizar la operacion matematica, un dato es nulo");
    //} catch (
    //InputMismatchException ime;) {
    //    System.out.println("Error en el ingreso de un dato");
    //} catch (NumberFormatException nfe;) {
    //    System.out.println("No puede ingresar un letra como identificador " + nfe);
    //} catch (Exception e) {
    //    System.out.println("Ha ocurrido un error, contecte al administrador " + e);
    //}

            //agregar cliente a la lista
            listaCliente.add(clienteDatosDinamicos);
            //soliocitando el repetir el ingreso de datos
            do {
                System.out.println("Desea ingresar un nuevo cliente (1) si (0) no");
                opcion = sc.nextInt();
            }while (opcion <0 || opcion > 1);
            sc.nextLine();


    }while(opcion ==1);

    // acceder al metodo de otra clase
        //instancia de la clase

        ClienteManager cm = new ClienteManager();
        cm.recorrerrreglo(listaCliente);


    }
}
