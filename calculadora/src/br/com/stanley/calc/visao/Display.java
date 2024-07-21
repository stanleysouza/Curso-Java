package br.com.stanley.calc.visao;

import br.com.stanley.calc.modelo.Memoria;
import br.com.stanley.calc.modelo.MemoriaObservador;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador {

    private final JLabel label;

    public Display(){
        Memoria.getInstancia().adicionarObservador(this);
        setBackground(new Color(46, 49, 50));
        label = new JLabel(Memoria.getInstancia().getTextoAtual());
        label.setForeground(Color.WHITE);
        label.setFont(new Font("courier",Font.PLAIN,30));

        setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 20));

        add(label);


    }

    @Override
    public void valorAlterado(String novoValor) {
        label.setText(novoValor);
    }
}
