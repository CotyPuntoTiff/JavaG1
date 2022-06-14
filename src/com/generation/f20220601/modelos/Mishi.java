package com.generation.f20220601.modelos;

public class Mishi extends Gato{
    private boolean famosoEnInternet;

    public Mishi() {
    }

    public Mishi(boolean famosoEnInternet) {
        this.famosoEnInternet = famosoEnInternet;
    }

    public boolean isFamosoEnInternet() {
        return famosoEnInternet;
    }

    public void setFamosoEnInternet(boolean famosoEnInternet) {
        this.famosoEnInternet = famosoEnInternet;
    }

    @Override
    public String toString() {
        return "Mishi{" +
                "famosoEnInternet=" + famosoEnInternet +
                '}';
    }
}
