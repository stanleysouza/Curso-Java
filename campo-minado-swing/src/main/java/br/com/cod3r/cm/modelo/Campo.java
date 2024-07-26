package br.com.cod3r.cm.modelo;

import java.util.ArrayList;
import java.util.List;

public class Campo {
    private final int linha;
    private final int coluna;

    private boolean aberto = false;
    private boolean minado = false;
    private boolean marcado = false;



    private List<Campo>  vizinhos = new ArrayList<>();
    private List<CampoObservador> observadores = new ArrayList<>();

    public Campo(int linha, int coluna){
        this.linha = linha;
        this.coluna = coluna;
    }

    public void registrarObservador(CampoObservador observador){
        observadores.add(observador);
    }

    private void notificarObservadores(CampoEvento evento){
        observadores.stream()
                .forEach(o -> o.eventoOcorreu(Campo.this, evento));
    }

    public boolean adicionarVizinho(Campo vizinho) {
        boolean linhaDiferente = linha  != vizinho.linha;
        boolean colunaDiferente = coluna  != vizinho.coluna;
        boolean diagonal = linhaDiferente && colunaDiferente;

        int deltaLinha = Math.abs(linha - vizinho.linha);
        int deltaColuna = Math.abs(coluna - vizinho.coluna);
        int deltaGeral = deltaColuna + deltaLinha;

        if (deltaGeral == 1){
            vizinhos.add(vizinho);
            return true;
        } else if(deltaGeral == 2 && diagonal) {
            vizinhos.add(vizinho);
            return true;
        } else {
            return false;
        }

    }

    public void alternarMarcacao() {
        if(!aberto){
            marcado = !marcado;
            if(marcado){
                notificarObservadores(CampoEvento.MARCAR);
            }else {
                notificarObservadores(CampoEvento.DESMARCAR);
            }
        }
    }
    public void abrir () {
        if(!aberto && !marcado){
            if(minado){
                notificarObservadores(CampoEvento.EXPLODIR);
                //return true;
            }
            setAberto(true);

            if(vizinhancaSegura()){
                vizinhos.parallelStream()
                        .filter(v -> v.isFechado())
                        .forEach(v -> v.abrir());
            }
            //return true;
        }

        //return false;
    }
    boolean vizinhancaSegura() {
        return vizinhos.parallelStream()
                .filter(v -> v.isFechado())
                .noneMatch(v -> v.minado);
    }
    public void minar() {
        minado = true;
    }
    public boolean isMarcado() {
        return marcado;
    }
    public boolean isAberto() {
        return aberto;
    }
    public boolean isFechado() {
        return !isAberto();
    }
    public boolean isNaoMarcado(){return !isMarcado();}
    public boolean isMinado(){return minado;}
    public boolean isNaoMinado(){return !isMinado();}

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
        if (aberto){
            notificarObservadores(CampoEvento.ABRIR);
        }
    }



    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }

    public boolean objetivoAlcancado(){
        boolean desvendado = !minado && aberto;
        boolean protegido = minado && marcado;
        return desvendado || protegido;
    }
    public long minasNaVizinhaca() {
        return vizinhos.stream().filter(v -> v.minado).count();
    }
    public void reiniciar(){
        aberto = false;
        minado = false;
        marcado = false;
        notificarObservadores(CampoEvento.REINICIAR);
    }
}
