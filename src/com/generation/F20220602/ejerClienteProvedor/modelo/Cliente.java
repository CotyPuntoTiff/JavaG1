package com.generation.F20220602.ejerClienteProvedor.modelo;

public class Cliente extends Fabrica {
    //Clase hijo

    //-------Atributos
    private Boolean capacidadDeCompra;
    private Integer dineroComprarMensual;

    //--------Constructor vacio
    public Cliente() {
    }

    //--------Constructor con parametros y atributos
    public Cliente(Boolean capacidadDeCompra, Integer dineroComprarMensual) {
        this.capacidadDeCompra = capacidadDeCompra;
        this.dineroComprarMensual = dineroComprarMensual;
    }

    //--------Getter and Setter
    public Boolean getCapacidadDeCompra() {
        return capacidadDeCompra;
    }

    public void setCapacidadDeCompra(Boolean capacidadDeCompra) {
        this.capacidadDeCompra = capacidadDeCompra;
    }

    public Integer getDineroComprarMensual() {
        return dineroComprarMensual;
    }

    public void setDineroComprarMensual(Integer dineroComprarMensual) {
        this.dineroComprarMensual = dineroComprarMensual;
    }

    //--------To String
    @Override
    public String toString() {
        return "Cliente{" +
                "capacidadDeCompra=" + capacidadDeCompra +
                ", dineroComprarMensual=" + dineroComprarMensual +
                '}';
    }

    //Funcion
    public void comprar() {
        System.out.println("Comprar productos para venta al detalle");
    }
}
