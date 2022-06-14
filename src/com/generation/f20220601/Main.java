package com.generation.f20220601;

import com.generation.f20220601.modelos.Gato;
import com.generation.f20220601.modelos.Mascota;
import com.generation.f20220601.modelos.Mishi;
import com.generation.f20220601.modelos.Perro;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //herencia
        Mascota mascota = new Mascota();
        mascota.setColor("gris");
        mascota.setNombre("tom");

        Perro perro = new Perro();
        perro.setColor("redfaund");
        perro.setNombre("ayun");


        Gato gato = new Gato();
        gato.setEspecie("Felino");
        gato.setPelaje("pelo corto");
        gato.setPeso(5);

        System.out.println(gato.toString());
        System.out.println(perro.toString());

        Mishi mishi = new Mishi();

        System.out.println(mishi.toString());

        //polimorfismo

        List<Mascota> listaMascotas = new ArrayList<Mascota>();
        Mascota regalon = new Mascota("negro", "Canino", "pelo", "firulais", 1.5f,"macho");
        listaMascotas.add(regalon);

        Mascota felix = new Gato();
        felix.setNombre("felix");
        felix.setColor("negro");
        felix.setPeso(3);

        Mascota chocolo = new Perro();
        chocolo.setNombre("chocolo");
        chocolo.setColor("cafe");
        chocolo.setPeso(10);

        ((Gato) felix).hacerSonido();
        chocolo.hacerSonido();
        System.out.println("*********");

        regalon.hacerSonido();;//llamado al metro en mascota
        felix.hacerSonido();
        chocolo.hacerSonido();
        System.out.println("***********");

        //recorrer areglo
        for (Mascota mascota2: listaMascotas) {
            mascota2.hacerSonido();

        }

        // transformar el objeto generico a uno especifico
        Perro perroChocolo = (Perro) chocolo;
        perroChocolo.setCantPaseos(6);

    }


}
