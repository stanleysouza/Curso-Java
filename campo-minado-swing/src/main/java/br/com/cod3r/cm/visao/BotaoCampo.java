package br.com.cod3r.cm.visao;

import br.com.cod3r.cm.modelo.Campo;
import br.com.cod3r.cm.modelo.CampoEvento;
import br.com.cod3r.cm.modelo.CampoObservador;
import com.sun.source.doctree.StartElementTree;
import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

@SuppressWarnings("serial")
public class BotaoCampo extends JButton implements CampoObservador, MouseListener {
    private final Color BG_PADRAO = new Color(184, 184, 184);
    private final Color BG_MARCADO = new Color(8, 179, 247);
    private final Color BG_EXPLOSAO = new Color(189, 66, 68);
    private final Color TEXTO_VERDE = new Color(0, 100, 0);

    private Campo campo;

    public BotaoCampo(Campo campo){
        this.campo = campo;
        setBackground(BG_PADRAO);
        setBorder(BorderFactory.createBevelBorder(0));
        addMouseListener(this);
        setOpaque(true);
        campo.registrarObservador(this);
    }
    public void eventoOcorreu(Campo campo, CampoEvento evento){
        switch (evento){
            case ABRIR: 
                aplicarEstiloAbrir();
                break;
            case MARCAR:
                aplicarEstiloMarcar();
                break;
            case DESMARCAR:
                aplicarEstiloDesMarcar();
                break;
            case EXPLODIR:
                aplicarEstiloExplodir();
                break;
            default:
                aplicarEstiloPadrao();
                break;
        }
    }

    private void aplicarEstiloDesMarcar() {
        setBackground(BG_PADRAO);
        setText("");
    }

    private void aplicarEstiloPadrao() {
        setBackground(BG_PADRAO);
        setText("");
    }

    private void aplicarEstiloExplodir() {
        setBackground(BG_EXPLOSAO);
        setForeground(Color.white);
        setText("X");
    }

    private void aplicarEstiloMarcar() {
        setBackground(BG_MARCADO);
        setForeground(Color.black);
        setText("M");

    }

    private void aplicarEstiloAbrir() {
        setBackground(BG_PADRAO);
        setBorder(BorderFactory.createLineBorder(Color.GRAY));
        if (campo.minasNaVizinhaca() > 0 ){
            switch ((int) campo.minasNaVizinhaca()){
                case 1:
                    setForeground(TEXTO_VERDE);
                    break;
                case 2:
                    setForeground(Color.BLUE);
                    break;
                case 3:
                    setForeground(Color.YELLOW);
                    break;
                case 4:
                case 5:
                case 6:
                setForeground(Color.RED);
                    break;
                default:
                    setForeground(Color.PINK);
            }
            setText(String.valueOf(campo.minasNaVizinhaca()));
        }
    }

    //Interface dos eventos

    @Override
    public void mousePressed(MouseEvent e) {
        if(e.getButton() == 1) {
            campo.abrir();
        }else {
            campo.alternarMarcacao();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
}
