package com.generation.f20220530;

public class Alumno {
    //----------atributos

    private String nombre;
    private String apellido;
    private int edad;
    private String curso;

    //----------contructores
    //Es para asignar valores

    public Alumno(String nombre, String apellido, int edad, String curso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.curso = curso;
    }

    //private //encapsulacion o proteccion de la informacion, solo puede acceder desde la misma clase
    //proteccted // todos dentro del pakage puede acceder

    //-----------geters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    //-----------funciones propias

    // click derecho, generate, toString
    //para imprimir los datos
    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", curso='" + curso + '\'' +
                '}';
    }
}
