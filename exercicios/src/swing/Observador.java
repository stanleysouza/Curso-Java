package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Observador {

    public static void main(String[] args) {

        JFrame janela = new JFrame("Observador");
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setSize(1200, 600);
        janela.setLayout(new FlowLayout());
        janela.setLocationRelativeTo(null);

        JButton botao = new JButton("Clicar!");
        janela.add(botao);

        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("clicou");
            }
        });

        janela.setVisible(true);
    }
}
