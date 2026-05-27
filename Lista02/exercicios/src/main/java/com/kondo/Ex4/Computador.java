package com.kondo.Ex4;

public class Computador {
    private String marca;
    private String processador;
    private PlacaMae placamae;
    
    public Computador(String marca, String processador, PlacaMae placamae) {
        this.marca = marca;
        this.processador = processador;
        this.placamae = placamae;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getProcessador() {
        return processador;
    }
    public void setProcessador(String processador) {
        this.processador = processador;
    }
    public PlacaMae getPlacamae() {
        return placamae;
    }
    public void setPlacamae(PlacaMae placamae) {
        this.placamae = placamae;
    }

    public void exibirConfiguracao(){
        System.out.println("Marca: " + marca);
        System.out.println("Processador: " + processador);
        System.out.println("Modelo Placa Mãe: " + placamae.getModelo());
        System.out.println("Chipset Placa Mãe: " + placamae.getChipset());
    }
}
