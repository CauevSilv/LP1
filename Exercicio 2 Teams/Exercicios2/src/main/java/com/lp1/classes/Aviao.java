package com.lp1.classes;

public class Aviao extends Veiculo{
    private String tipoMotor;
    private int qtdPassageiros;
    private String linha;

    public Aviao(String tipoMotor, int qtdPassageiros, String linha,String marca,String tipoCombustivel, String corLataria) {
        this.setMarca(marca);
        this.setCorLataria(corLataria);
        this.setTipoCombustivel(tipoCombustivel);
        this.tipoMotor = tipoMotor;
        this.qtdPassageiros = qtdPassageiros;
        this.linha = linha;
    }
    public void bateTorre(){
        System.out.println("É...... se não morreu, você ta preso!");
    }
    public void pilotoAuto(){
        System.out.println("Wow, passou tantos anos treinando para pilotar e no final das contas vc vai só vigiar? Covarde!");
    }
    public void mudaLinha(String linha){
        this.setLinha(linha);
        System.out.println("A nova linha agora é " + linha);
    }


    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }
}
