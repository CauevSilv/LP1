package com.lp1.classes;


public class Celular{
    private String tela;
    private String marca;
    private String versaoSO;

    public Celular(String tela, String marca, String versaoSO) {
        this.tela = tela;
        this.marca = marca;
        this.versaoSO = versaoSO;
    }

    public void atualizaS0(String versaoSO){
        this.versaoSO = versaoSO;
        System.out.println("A versão do SO agr é "+versaoSO);
    }
    public void aumentaBrilho() {
        System.out.println("Pronto, agora seu celular parece um reator nuclear descontrolado.");
    }
    public void usaOZap(){
        System.out.println("Saia, saia do zap zap imediatamente.");
    }

    public String getTela() {
        return tela;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getVersaoSO() {
        return versaoSO;
    }

    public void setVersaoSO(String versaoSO) {
        this.versaoSO = versaoSO;
    }
}
