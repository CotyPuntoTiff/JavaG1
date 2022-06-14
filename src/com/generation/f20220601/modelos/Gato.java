package com.generation.f20220601.modelos;

//extence significa que estamos usando herencia
public class Gato extends Mascota {
    private boolean garrasRetractil;
    private boolean visionNocturna;
    private String sonidoVocal;

    public Gato() {

    }

    public Gato(boolean garrasRetractil, boolean visionNocturna, String sonidoVocal) {
        this.garrasRetractil = garrasRetractil;
        this.visionNocturna = visionNocturna;
        this.sonidoVocal = sonidoVocal;
    }

    public boolean isGarrasRetractil() {
        return garrasRetractil;
    }

    public void setGarrasRetractil(boolean garrasRetractil) {
        this.garrasRetractil = garrasRetractil;
    }

    public boolean isVisionNocturna() {
        return visionNocturna;
    }

    public void setVisionNocturna(boolean visionNocturna) {
        this.visionNocturna = visionNocturna;
    }

    public String getSonidoVocal() {
        return sonidoVocal;
    }

    public void setSonidoVocal(String sonidoVocal) {
        this.sonidoVocal = sonidoVocal;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "garrasRetractil=" + garrasRetractil +
                ", visionNocturna=" + visionNocturna +
                ", sonidoVocal='" + sonidoVocal + '\'' +super.toString()+
                '}';
    }
    @Override// identifioca que sobre escribe el metodo
    public void hacerSonido(){
        System.out.println("Miaw, miaw");
    }
}
