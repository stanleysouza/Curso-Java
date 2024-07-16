package br.com.cod3r.cm;

import br.com.cod3r.cm.excecao.ExplosaoException;
import br.com.cod3r.cm.modelo.Campo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CampoTeste {

    private Campo campo;
    @BeforeEach
    void iniciarCampo(){
        campo = new Campo(3,3);
    }
    @Test
    void testeVizinhoRealDistancia1Esquerda() {
        Campo vizinho = new Campo(3,2);
        boolean resultado = campo.adicionarVizinho(vizinho);
        Assertions.assertTrue(resultado);
    }
    @Test
    void testeVizinhoRealDistancia1Direita() {
        Campo vizinho = new Campo(3,4);
        boolean resultado = campo.adicionarVizinho(vizinho);
        Assertions.assertTrue(resultado);
    }
    @Test
    void testeVizinhoRealDistancia1Cima() {
        Campo vizinho = new Campo(2,3);
        boolean resultado = campo.adicionarVizinho(vizinho);
        Assertions.assertTrue(resultado);
    }
    @Test
    void testeVizinhoRealDistancia1Baixo() {
        Campo vizinho = new Campo(4,2);
        boolean resultado = campo.adicionarVizinho(vizinho);
        Assertions.assertTrue(resultado);
    }

    @Test
    void testeVizinhoRealDiagonal1() {
        Campo vizinho = new Campo(2,2);
        boolean resultado = campo.adicionarVizinho(vizinho);
        Assertions.assertTrue(resultado);
    }
    @Test
    void testeVizinhoRealDiagonal2() {
        Campo vizinho = new Campo(4,4);
        boolean resultado = campo.adicionarVizinho(vizinho);
        Assertions.assertTrue(resultado);
    }
    @Test
    void testeVizinhoRealDiagonal3() {
        Campo vizinho = new Campo(4,2);
        boolean resultado = campo.adicionarVizinho(vizinho);
        Assertions.assertTrue(resultado);
    }
    @Test
    void testeVizinhoRealDiagonal4() {
        Campo vizinho = new Campo(2,4);
        boolean resultado = campo.adicionarVizinho(vizinho);
        Assertions.assertTrue(resultado);
    }

    @Test
    void testeVizinhoFalsoDiagonalDistancia2() {
        Campo vizinho = new Campo(1,1);
        boolean resultado = campo.adicionarVizinho(vizinho);
        Assertions.assertFalse(resultado);
    }
    @Test
    void testeVizinhoFalsoLinhaDistancia2() {
        Campo vizinho = new Campo(3,1);
        boolean resultado = campo.adicionarVizinho(vizinho);
        Assertions.assertFalse(resultado);
    }

    @Test
    void testeValorPadraoAtributoMarcado() {
        Assertions.assertFalse(campo.isMarcado());
    }
    @Test
    void testeAternarMarcacao() {
        campo.alternarMarcacao();
        Assertions.assertTrue(campo.isMarcado());
    }
    @Test
    void testeAternarMarcacaoDuasChamadas() {
        campo.alternarMarcacao();
        campo.alternarMarcacao();
        Assertions.assertFalse(campo.isMarcado());
    }
    @Test
    void testeAbrirNaoMinadoNaoMarcado(){
        Assertions.assertTrue(campo.abrir());
    }
    @Test
    void testeAbrirNaoMinadoMarcado(){
        campo.alternarMarcacao();
        Assertions.assertFalse(campo.abrir());
    }
    @Test
    void testeAbrirMinadoMarcado(){
        campo.alternarMarcacao();
        campo.minar();
        Assertions.assertFalse(campo.abrir());
    }
    @Test
    void testeAbrirMinadonaoMarccado(){
        campo.minar();
        Assertions.assertThrows(ExplosaoException.class, () ->{
            campo.abrir();
        });
    }
    @Test
    void testeAbrirComVizinhos1(){
        Campo campo11 = new Campo(1,1);
        Campo campo22 = new Campo(2,2);
        campo22.adicionarVizinho(campo11);
        campo.adicionarVizinho(campo22);
        campo.abrir();
        Assertions.assertTrue(campo11.isAberto() && campo22.isAberto());
    }
    @Test
    void testeAbrirComVizinhos2(){
        Campo campo11 = new Campo(1,1);
        Campo campo12 = new Campo(1,2);
        campo12.minar();
        Campo campo22 = new Campo(2,2);
        campo22.adicionarVizinho(campo11);
        campo22.adicionarVizinho(campo12);

        campo.adicionarVizinho(campo22);
        campo.abrir();

        Assertions.assertTrue(campo22.isAberto() && campo11.isFechado());
    }
    @Test
    void testeGetLinha(){
        int linha = campo.getLinha();
        Assertions.assertEquals(3,linha);
    }
    @Test
    void testeGetColuna(){
        int coluna = campo.getColuna();
        Assertions.assertEquals(3,coluna);
    }
    @Test
    void testeObjetivoAlcançadoTrue1(){
        campo.abrir();
        Assertions.assertTrue(campo.objetivoAlcancado());
    }
    @Test
    void testeObjetivoAlcançadoTrue2(){
        campo.minar();
        campo.alternarMarcacao();
        Assertions.assertTrue(campo.objetivoAlcancado());
    }
    @Test
    void testeObjetivoAlcançadoFalse1(){
        Assertions.assertFalse(campo.objetivoAlcancado());
    }
    @Test
    void testeObjetivoAlcançadoFalse2(){
        campo.minar();
        Assertions.assertThrows(ExplosaoException.class, () ->{
            campo.abrir();
        });
    }
    @Test
    void testeMinasNaVizinhaca(){
        Campo vizinho1 = new Campo(3,2);
        vizinho1.minar();
        campo.adicionarVizinho(vizinho1);
        Assertions.assertEquals(1,campo.minasNaVizinhaca());
    }
    @Test
    void testeReiniciar() {
        campo.reiniciar();
        Assertions.assertTrue(campo.isFechado() && campo.isNaoMarcado() && campo.isNaoMinado());
    }
    @Test
    void testeToString(){
        //campo fechado
        String a = campo.toString();
        Assertions.assertEquals("?", a);
        //campo aberto
        campo.abrir();
        String b = campo.toString();
        Assertions.assertEquals(" ", b);
        //campo com vizinho minado
        campo.reiniciar();
        Campo vizinho = new Campo(3,2);
        vizinho.minar();
        campo.adicionarVizinho(vizinho);
        campo.abrir();
        String c = campo.toString();
        Assertions.assertEquals("1", c);
        //campo marcado
        campo.reiniciar();
        campo.alternarMarcacao();
        String d = campo.toString();
        Assertions.assertEquals("x", d);
        //campo minado
        campo.reiniciar();
        campo.minar();
        Assertions.assertThrows(ExplosaoException.class, () ->{
            campo.abrir();
        });
        String e = campo.toString();
        Assertions.assertEquals("*", e);
    }
    @Test
    void testeAbrirCampoAberto(){
        campo.abrir();
        Assertions.assertFalse(campo.abrir());
    }

    @Test
    void testeMarcarCampoAberto() {
        campo.abrir();
        campo.alternarMarcacao();
        Assertions.assertFalse(campo.isMarcado());
    }

}
