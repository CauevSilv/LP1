package com.lp1.classes;


import java.util.PrimitiveIterator;

public class Computador{
    private String processador;
    private String qtdRAM;
    private String modeloGPU;

    public Computador(String processador, String qtdRAM, String modeloGPU) {
        this.processador = processador;
        this.qtdRAM = qtdRAM;
        this.modeloGPU = modeloGPU;
    }
    public void fazSoma(int num1,int num2){
        int aux = num1 +  num2;
        System.out.println("Uma contina de + cara, era só fazer quale. O resultado é " + aux);
    }
    public void fazSubtracao(int num1,int num2) {
        int aux = num1 - num2;
        System.out.println("O pc fez a subtração, mas você podia ter feito na mão ein? O resultado é "+aux);
    }
    public void rodaJogo(){
        System.out.println("Seu pc não roda jogos.... KKKKKKKKKKKKKK");
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getQtdRAM() {
        return qtdRAM;
    }

    public void setQtdRAM(String qtdRAM) {
        this.qtdRAM = qtdRAM;
    }

    public String getModeloGPU() {
        return modeloGPU;
    }

    public void setModeloGPU(String modeloGPU) {
        this.modeloGPU = modeloGPU;
    }
}
