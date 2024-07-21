package br.com.stanley.calc.visao;

import br.com.stanley.calc.modelo.Memoria;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class Teclado extends JPanel implements ActionListener {

    private final Color COR_CINZA_ESCURO = new Color(68,68,68);
    private final Color COR_CINZA_CLARO = new Color(99,99,99);
    private final Color COR_LARANJA = new Color(242,163,60);

    public Teclado(){
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();

        setLayout(layout);
        c.weightx = 1;
        c.weighty = 1;
        c.fill = GridBagConstraints.BOTH;

        int Y = 0;
        c.gridwidth = 2;
        adicionarBotao("AC", COR_CINZA_ESCURO, c, 0, Y);
        c.gridwidth = 1;
        adicionarBotao("±", COR_CINZA_ESCURO, c, 2, Y);
        //adicionarBotao("%", COR_CINZA_ESCURO, c, 2, Y);
        adicionarBotao("/", COR_LARANJA, c, 3, Y);

        Y = 1;
        adicionarBotao("7", COR_CINZA_CLARO, c, 0, Y);
        adicionarBotao("8", COR_CINZA_CLARO, c, 1, Y);
        adicionarBotao("9", COR_CINZA_CLARO, c, 2, Y);
        adicionarBotao("*", COR_LARANJA, c, 3, Y);

        Y = 2;
        adicionarBotao("4", COR_CINZA_CLARO, c, 0, Y);
        adicionarBotao("5", COR_CINZA_CLARO, c, 1, Y);
        adicionarBotao("6", COR_CINZA_CLARO, c, 2, Y);
        adicionarBotao("-", COR_LARANJA, c, 3, Y);

        Y = 3;
        adicionarBotao("1", COR_CINZA_CLARO, c, 0, Y);
        adicionarBotao("2", COR_CINZA_CLARO, c, 1, Y);
        adicionarBotao("3", COR_CINZA_CLARO, c, 2, Y);
        adicionarBotao("+", COR_LARANJA, c, 3, Y);

        Y = 4;
        c.gridwidth = 2;
        adicionarBotao("0", COR_CINZA_CLARO, c, 0, Y);
        c.gridwidth = 1;
        adicionarBotao(",", COR_CINZA_CLARO, c, 2, Y);
        adicionarBotao("=", COR_LARANJA, c, 3, Y);



    }

    private void adicionarBotao(String texto, Color cor, GridBagConstraints c, int x, int y) {
        c.gridx = x;
        c.gridy = y;
        Botao botao = new Botao(texto,cor);
        botao.addActionListener(this);
        add(botao,c);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof JButton){
            JButton botao = (JButton) e.getSource();
            Memoria.getInstancia().processarComando(botao.getText());
        }

    }
}
