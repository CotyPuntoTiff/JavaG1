package com.generation.F20220602.ejerClienteProvedor.modelo;

public class Fabrica {

    //--------atributos
    private String nombre;
    private String rut;
    private String direccion;
    private String giro;
    private int nroFactura;

    //-------Construtor vacio
    public Fabrica() {
    }

    //------Constructor con parametros y atributos
    public Fabrica(String nombre, String rut, String direccion, String giro, int nroFactura) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
        this.giro = giro;
        this.nroFactura = nroFactura;
    }

    //-------Getter and Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGiro() {
        return giro;
    }

    public void setGiro(String giro) {
        this.giro = giro;
    }

    public int getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(int nroFactura) {
        this.nroFactura = nroFactura;
    }

    //-----------To String

    @Override
    public String toString() {
        return "Fabrica{" +
                "nombre='" + nombre + '\'' +
                ", rut='" + rut + '\'' +
                ", direccion='" + direccion + '\'' +
                ", giro='" + giro + '\'' +
                ", nroFactura=" + nroFactura +
                '}';
    }

    //Funcion
    public void comprar() {
        System.out.println("Comprar materia prima");
    }
}
