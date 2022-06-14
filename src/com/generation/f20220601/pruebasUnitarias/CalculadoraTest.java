package com.generation.f20220601.pruebasUnitarias;

import static org.junit.Assert.*;

public class CalculadoraTest {

    @org.junit.Test
    public void suma() {
    Calculadora calc = new Calculadora();
    int resultado = calc.suma(12, 42);//54
        //assertEquals(valor esperado, respuesta);//compara los valores esperados y el resultado
        assertEquals(54, resultado);

    }

    @org.junit.Test
    public void resta() {
        Calculadora calc = new Calculadora();
        int resultado = calc.resta(42, 12);//30
        //assertEquals(valor esperado, respuesta);//compara los valores esperados y el resultado
        assertEquals(30, resultado);
    }

    @org.junit.Test
    public void multiplicacion() {
        Calculadora calc = new Calculadora();
        int resultado = calc.multiplicacion(10, 5);//50
        //assertEquals(valor esperado, respuesta);//compara los valores esperados y el resultado
        assertEquals(50, resultado);
    }

    @org.junit.Test
    public void division() {
        Calculadora calc = new Calculadora();
        String resultado = calc.division(0, 0);//
        //assertEquals(valor esperado, respuesta);//compara los valores esperados y el resultado

        assertEquals("no se puede dividir por 0", resultado);
        assertNotNull(resultado);
    }

   // @org.junit.Test
    //public void numPar() {
    //    Calculadora calc = new Calculadora();
     //   int resultado = calc.numPar(10, 5);//50
        //assertEquals(valor esperado, respuesta);//compara los valores esperados y el resultado
     //   assertEquals(50, resultado);
   // }
}