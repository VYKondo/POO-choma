package com.kondo.Ex12;

public class ReservaHotel {
    private String nomeHospede;
    private int quantidadeDiarias;
    private float valorDiaria;

    public ReservaHotel(String nomeHospede, int quantidadeDiarias, float valorDiaria) {
        this.nomeHospede = nomeHospede;
        this.quantidadeDiarias = quantidadeDiarias;
        this.valorDiaria = valorDiaria;
    }
    public String getNomeHospede() {
        return nomeHospede;
    }
    public void setNomeHospede(String nomeHospede) {
        this.nomeHospede = nomeHospede;
    }
    public int getQuantidadeDiarias() {
        return quantidadeDiarias;
    }
    public void setQuantidadeDiarias(int quantidadeDiarias) {
        this.quantidadeDiarias = quantidadeDiarias;
    }
    public float getValorDiaria() {
        return valorDiaria;
    }
    public void setValorDiaria(float valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public float calcularTotal(){
        return Math.round((quantidadeDiarias * valorDiaria) * 100.0f) / 100.0f;
    }

    public void exibirReserva(){
        System.out.println(nomeHospede + "\n Valor total: " + calcularTotal() + "\n Dias Reservados: " + quantidadeDiarias);
    }
    
}
