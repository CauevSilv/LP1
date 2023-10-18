package com.lp1.classes;

    public class Trem {
        private String transporte;
        private int qtdvagao;
        private int velocidade;

        public Trem(String transporte, int qtdvagao, int velocidade) {
            this.transporte = transporte;
            this.qtdvagao = qtdvagao;
            this.velocidade = velocidade;
        }

        public void irRapido() {
            System.out.println("A velocidade do trem ta bem alta já ein? Mas vamos multiplicar ela por 2 porque sim.");
            System.out.println("Agora o trem está a "+velocidade*2+"Km/H");
        }
        public void cargaDeBobinas() {
            this.transporte = "Bobinas de metal.";
            System.out.println("Carregar bobinas de metal requer muita força, então o trem ficou um pouco mais devagar.\nNova velocidade do trem " +
                    velocidade/1.1);
        }

        public String getTransporte() {
            return transporte;
        }

        public void setTransporte(String transporte) {
            this.transporte = transporte;
        }


        public int getVelocidade() {
            return velocidade;
        }

        public void setVelocidade(int velocidade) {
            this.velocidade = velocidade;
        }

        public int getQtdvagao() {
            return qtdvagao;
        }

        public void setQtdvagao(int qtdvagao) {
            this.qtdvagao = qtdvagao;
        }

    }

