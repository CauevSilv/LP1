package com.lp1.classes;

public class Carro extends Veiculo{
    private int numeroPortas;
    private int numeroRodas;
    private String modelo;

    public Carro(int numeroPortas,int numeroRodas,String modelo,String marca,String tipoCombustivel, String corLataria){
        this.numeroPortas = numeroPortas;
        this.numeroRodas = numeroRodas;
        this.modelo = modelo;
        this.setCorLataria(corLataria);
        this.setMarca(marca);
        this.setTipoCombustivel(tipoCombustivel);
    }
    public void capotar(){
        System.out.println("Você capotou seu Corsa!!!!" +
                "\nQuantidade de rodas reduzidas em 1 e de portas também." +
                "\nBoa sorte pra consertar kkkkkkk");
        numeroRodas -= 1;
        numeroPortas -=1;
    }
    public void pintar(String corNova){
        System.out.println("a cor antiga do carro era " +getCorLataria());
        setCorLataria(corNova);
        System.out.println("A cor agora é " + corNova);
    }
    public void clonar(String modelo){
        System.out.println("Que feio... Clonando um carro?\nEntre com o novo modelo");
        this.modelo = modelo;
        System.out.println("Seu carro agora é um......" + getModelo());
    }
    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroRodas() {
        return numeroRodas;
    }

    public void setNumeroRodas(int numeroRodas) {
        this.numeroRodas = numeroRodas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }



}
