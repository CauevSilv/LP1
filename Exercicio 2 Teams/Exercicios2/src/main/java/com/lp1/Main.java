package com.lp1;

import com.lp1.classes.*;


public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro(4,4,"Corsa Classic","Chevrolet","Flex","Prata");
        carro.capotar();
        carro.clonar("Veyron");

        Motocicleta moto = new Motocicleta(0,2,"Disco","Honda","Gasolina","Vermelha");
        moto.bateuFeio();;
        moto.perdeFreio("Disco");
        moto.setaQueimada();

        Aviao aviao = new Aviao("Jato",200,"São José dos Capos - Jacareí","Boing","Querosene","Branco");
        aviao.bateTorre();
        aviao.pilotoAuto();

        Computador computador = new Computador("i3-3120M","8GB","Intel HD 4000");
        computador.fazSoma(90,20);
        computador.fazSubtracao(90,90);

        Celular celular = new Celular("QuadHD 120hrz","Xiaomi","MIUI 14");
        celular.atualizaS0("MIUI 14.1");
        celular.aumentaBrilho();

        Monitor monitor = new Monitor("Lenovo","Bem pequena","40w");
        monitor.brilhoMaximo();
        monitor.queimou();

        Submarino submarino = new Submarino("Nuclear",1000,100);
        submarino.atirarMisseis("Pesquisa");

        Mouse mouse = new Mouse(800,"Plástico","RGB");
        mouse.mudadpi(3);

        Trem trem = new Trem("Humanos",50,10);
        trem.cargaDeBobinas();
    }
}