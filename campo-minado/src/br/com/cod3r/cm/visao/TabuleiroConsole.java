package br.com.cod3r.cm.visao;

import br.com.cod3r.cm.excecao.ExplosaoException;
import br.com.cod3r.cm.excecao.SairException;
import br.com.cod3r.cm.modelo.Tabuleiro;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class TabuleiroConsole {
    private Tabuleiro tabuleiro;
    private Scanner entrada = new Scanner(System.in);

    public TabuleiroConsole(Tabuleiro tabuleiro){
        this.tabuleiro = tabuleiro;
        executarJogo();
    }
    private void executarJogo() {
        try {
            boolean continuar = true;
            while (continuar){
                clicodojogo();
                System.out.println("Outra partida? (S/n) ");
                String resposta = entrada.nextLine();
                if ("n".equalsIgnoreCase(resposta)){
                    continuar = false;
                } else {
                    tabuleiro.reiniciar();
                }
            }
        } catch (SairException e){
            System.out.println("Tchau!!!");
        }finally {
            entrada.close();
        }
    }

    private void clicodojogo() {
        try {
            while (!tabuleiro.objetivoAlcancado()){
                System.out.println(tabuleiro);
                String digitado = capturarValorDigitado("Digite (x, y): ");

                Iterator<Integer> xy = Arrays.stream(digitado.split(","))
                        .map(e -> Integer.parseInt(e.trim())).iterator();
                //tabuleiro.abrir(digitado);
                digitado = capturarValorDigitado("1 - abrir ou 2 - (Des)Marcar : ");
                if("1".equalsIgnoreCase(digitado)){
                    tabuleiro.abrir(xy.next(),xy.next());
                }else if("2".equalsIgnoreCase(digitado)){
                    tabuleiro.alternarMarcacao(xy.next(),xy.next());
                }else {
                    System.out.println("Selecione uma opção valida");
                }

            }
            System.out.println(tabuleiro);
            System.out.println("Você Ganhou!!");
        } catch (ExplosaoException e){
            System.out.println(tabuleiro);
            System.out.println("Você Perdeu");
        }
    }

    private String capturarValorDigitado(String texto){
        System.out.print(texto);
        String digitado = entrada.nextLine();
        if ("sair".equalsIgnoreCase(digitado)){
            throw new SairException();
        }
        return digitado;
    }
}
