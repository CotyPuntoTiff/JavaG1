package com.generation.f20220527;

public class Auto {
    //clase es un modelo o prototipo
    //objeto, nace a partir de la clase, caracteristica o atributo
    //tiene metodos o funciones
    //algo concreto, lo convertimos en abstracto (no tangible)
    //tangible: usamos los 5 sentidos para describir

    //----atributo de colabroracion---
    //toma un objeto y lo usa como atributo

    //atributo
    //accesador tipo nombreDelAtributo
    private String color;
    private String marca;
    private String modelo;
    private Double velocidad;

    //-----------------------constructores-----------------------------------------------------

    //constructor vacio
    public Auto(){

    }

    //--------constructores con parametros------------
    //se escribe automatico
    //click derecho, generate -> constructor y se agregan todos
    public Auto(String color, String marca, String modelo, Double velocidad) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    //---------accesadores y mutadores (get y set)---------
    //se escribe automatico
    //click derecho, generate -> geters y seter y se agregan todos

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }

    //-------metodos o funciones------
    //personalizadas y a mano
    //las funciones creadas dentro de un objeto no lleva la palabra reervada -static-
    public void aumentarVelocidad(){
        //creamos un valor para la variable velocidad
        this.velocidad = 10d;
    }
}
