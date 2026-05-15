package com.kondo.Ex4;

public class Retangulo {
    private int base;
    private int altura;

    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int calcularArea(){
        int area = base * altura;
        return area;
    }

    public int calcularPerimetro(){
        int perimetro = 2 * altura + 2 * base;
        return perimetro;
    }
    
}
