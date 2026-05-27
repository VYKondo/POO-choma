package com.kondo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numeros = {64, 34, 25, 12, 22, 11, 90};
        
        OrdenadorBubbleSort ordenador = new OrdenadorBubbleSort();
        ordenador.ordenar(numeros);
        
        System.out.println(Arrays.toString(numeros));
    }
}