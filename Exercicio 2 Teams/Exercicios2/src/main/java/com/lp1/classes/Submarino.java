package com.lp1.classes;

public class Submarino {
        private String tipo;
        private double combustivelQtd;
        private int profundidade;

    public void naufragar () {
        System.out.println("Não recomendamos uma viagem de submarino usando um controle da logitech");
        setProfundidade(0);
    }

    public void atirarMisseis (String tipo) {
      if (this.tipo.equals(tipo)){
          System.out.println("Atirando misseis nucleares nas geleiras polares como solicitado!");
        }else {
          System.out.println("Você não tem misseis.\nPorquê vc teria um submarino sem misseis?");
      }
    }

    public void reabastecer (double combustivelAdic) {
        this.combustivelQtd = this.combustivelQtd +combustivelAdic;
        System.out.println("Reabasteceu o tanque com  " +combustivelAdic + " litros");
    }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public double getCombustivelQtd() {
            return combustivelQtd;
        }

        public void setCombustivelQtd(double combustivelQtd) {
            this.combustivelQtd = combustivelQtd;
        }

        public int getProfundidade() {
            return profundidade;
        }

        public void setProfundidade(int profundidade) {
            this.profundidade = profundidade;
        }

        public Submarino(String tipo, double combustivelQtd, int profundidade) {
            this.tipo = tipo;
            this.combustivelQtd = combustivelQtd;
            this.profundidade = profundidade;
        }


    }

