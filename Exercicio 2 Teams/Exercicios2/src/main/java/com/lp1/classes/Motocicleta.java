package com.lp1.classes;

public class Motocicleta extends Veiculo{
    private double cilindradas;
    private int numeroRodas;
    private String tipoFreio;

    public Motocicleta(double cilindradas, int numeroRodas, String tipoFreio,String marca,String tipoCombustivel, String corLataria) {
        this.cilindradas = cilindradas;
        this.numeroRodas = numeroRodas;
        this.tipoFreio = tipoFreio;
        this.setMarca(marca);
        this.setTipoCombustivel(tipoCombustivel);
        this.setCorLataria(corLataria);
    }

    public void perdeFreio(String tipoFreio){
        System.out.println("Se lascou kkkkkkkkkk BATEU!");
        this.tipoFreio = tipoFreio;
    }
    public void setaQueimada(){
        System.out.println("Você não usa a seta mesmo né.... A seta direita ta queimada. Vai arrumar.");
    }
    public void bateuFeio(){
        System.out.println("Socou a moto no poste e perdeu uma roda.... Gênio.");
        this.numeroRodas = -1;
        System.out.println("Agora vc só tem "+ numeroRodas + "roda.");
    }



    public double getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(double cilindradas) {
        this.cilindradas = cilindradas;
    }

    public int getNumeroRodas() {
        return numeroRodas;
    }

    public void setNumeroRodas(int numeroRodas) {
        this.numeroRodas = numeroRodas;
    }

    public String getTipoFreio() {
        return tipoFreio;
    }

    public void setTipoFreio(String tipoFreio) {
        this.tipoFreio = tipoFreio;
    }
}
