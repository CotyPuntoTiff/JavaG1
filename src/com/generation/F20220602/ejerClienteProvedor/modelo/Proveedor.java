package com.generation.F20220602.ejerClienteProvedor.modelo;

public class Proveedor extends Fabrica{
    //Clase hijo

    //----------atributos
    private Integer cantidadMinCompra;
    private Integer numCentroDistribucion;
    private Boolean despacho;

    //---------Constructor vacio
    public Proveedor() {
    }

    //---------Constructor con parametros y atributos
    public Proveedor(Integer cantidadMinVenta, Integer numCentroDistribucion, Boolean despacho) {
        this.cantidadMinCompra = cantidadMinVenta;
        this.numCentroDistribucion = numCentroDistribucion;
        this.despacho = despacho;
    }
    //---------Getter and Setter

    public Integer getCantidadMinVenta() {
        return cantidadMinCompra;
    }

    public void setCantidadMinVenta(Integer cantidadMinVenta) {
        this.cantidadMinCompra = cantidadMinVenta;
    }

    public Integer getNumCentroDistribucion() {
        return numCentroDistribucion;
    }

    public void setNumCentroDistribucion(Integer numCentroDistribucion) {
        this.numCentroDistribucion = numCentroDistribucion;
    }

    public Boolean getDespacho() {
        return despacho;
    }

    public void setDespacho(Boolean despacho) {
        this.despacho = despacho;
    }

    //--------To string
    @Override
    public String toString() {
        return "Proveedor{" +
                "cantidadMinVenta=" + cantidadMinCompra +
                ", numCentroDistribucion=" + numCentroDistribucion +
                ", despacho=" + despacho +
                '}';
    }

    //Funcion
    public void comprar() {
        System.out.println("Comprar productos para venta al mayor");
    }
}
