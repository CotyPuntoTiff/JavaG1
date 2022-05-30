package com.generation.f20220530;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //lista de alumno, creando instancia
        //Las interfaces solamente definen los metodos (list)
        //La clase de ArrayList tienen metodos
        //List, amplia las opciones del array, tiene mas usos (ejemplo int e Integer)
        List<Alumno> listaAlumnos = new ArrayList<Alumno>();

        //-------Instancia de una clase\
        //Objeto mayuscula // atributo minuscula
        // contumbre con el mismo nombre diferenciado entre mayuscula y minuscula
        //Se llema al constructor vacio
        Alumno alumno1 = new Alumno("coty", "Mardones", 27,"G1");
        Alumno alumno2 = new Alumno("Hector", "Gomez", 29,"G1");
        Alumno alumno3 = new Alumno("Nicoles","Olivares",28, "G1");
        Alumno alumno4 = new Alumno("Ignacio", "Galaz",29, "G1");
        Alumno alumno5 = new Alumno("Fernando", "Faundez",29, "G1");

        listaAlumnos.add(alumno1);

        //Se usa get para obtener un valor asignado en la variable
        //System.out.println("nombre de alumno 1:" + alumno.getNombre());
        //System.out.println("nombre de alumno 2:" + alumno2.getNombre());

        //Setter / asignacion
        //alumno.setNombre("Coty");
        //System.out.println("nombre entregado para alumno 2" + alumno.getNombre());

        System.out.println("----- Equipo 5 -----");
        System.out.println();

        System.out.println("Datos de alumno 1");
        System.out.println("- Nombre: " + alumno1.getNombre());
        System.out.println("- Apellido: " + alumno1.getApellido());
        System.out.println("- Edad: " + alumno1.getEdad());
        System.out.println("- Curso: " + alumno1.getCurso());
        System.out.println();

        System.out.println("Datos de alumno 2");
        System.out.println("- Nombre: " + alumno2.getNombre());
        System.out.println("- Apellido: " + alumno2.getApellido());
        System.out.println("- Edad: " + alumno2.getEdad());
        System.out.println("- Curso: " + alumno2.getCurso());
        System.out.println();

        System.out.println("Datos de alumno 3");
        System.out.println("- Nombre: " + alumno3.getNombre());
        System.out.println("- Apellido: " + alumno3.getApellido());
        System.out.println("- Edad: " + alumno3.getEdad());
        System.out.println("- Curso: " + alumno3.getCurso());
        System.out.println();

        System.out.println("Datos de alumno 4");
        System.out.println("- Nombre: " + alumno4.getNombre());
        System.out.println("- Apellido: " + alumno4.getApellido());
        System.out.println("- Edad: " + alumno4.getEdad());
        System.out.println("- Curso: " + alumno4.getCurso());
        System.out.println();

        System.out.println("Datos de alumno 5");
        System.out.println("- Nombre: " + alumno5.getNombre());
        System.out.println("- Apellido: " + alumno5.getApellido());
        System.out.println("- Edad: " + alumno5.getEdad());
        System.out.println("- Curso: " + alumno5.getCurso());

        // setter
        System.out.println(alumno1.toString());
        System.out.println(alumno2.toString());
        System.out.println(alumno3.toString());
        System.out.println(alumno4.toString());
        System.out.println(alumno5.toString());

        for (int i = 0; i< listaAlumnos.size(); i++){
            //antes era una variable y ahora
            System.out.println(listaAlumnos.get(i).getNombre());
             System.out.println(listaAlumnos.get(i).getApellido());
        }

        for (Alumno objetoAlumno : listaAlumnos){
            System.out.println("imprime el objetoAlumno de toString:" + objetoAlumno.toString());
        }
    }
}

