package br.com.cod3r.cm.visao;

import br.com.cod3r.cm.modelo.Tabuleiro;

public class Temp {

    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro(1,1,1);

        tabuleiro.registrarObservador( e -> {
            if(e.isGanhou()){
                System.out.println("Ganhou");
            }else {
                System.out.println("Perdeu");
            }
        });

        tabuleiro.abrir(0,0);
        tabuleiro.alternarMarcacao(0,1);
        tabuleiro.alternarMarcacao(1,0);
        //tabuleiro.alternarMarcacao(1,1);


    }
}
