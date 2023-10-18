package com.lp1.classes;

public class Monitor {
    private String marca;
    private String borda;
    private String consumo;

    public Monitor(String marca, String borda, String consumo) {
        this.marca = marca;
        this.borda = borda;
        this.consumo = consumo;
    }
    public void queimou(){
        System.out.println("Bom.... compra outro.");
    }
    public void brilhoMaximo(){
        System.out.println("Então vc aumentou o brilho?Aumentou então o consumo!");
        this.consumo += 200;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getBorda() {
        return borda;
    }

    public void setBorda(String borda) {
        this.borda = borda;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }
}
