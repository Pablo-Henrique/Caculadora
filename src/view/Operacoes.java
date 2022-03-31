package view;

import javax.swing.*;
import java.awt.*;

public class Operacoes extends JPanel {

    private final JButton btnDivsao = new JButton("/");
    private final JButton btnMais = new JButton("+");
    private final JButton btnMenos = new JButton("-");
    private final JButton btnMultip = new JButton("*");

    public Operacoes() {
        setBackground(Color.DARK_GRAY);
        setLayout(new GridLayout(4, 1, 3, 3));

        add(getBtnDivsao());
        add(getBtnMais());
        add(getBtnMenos());
        add(getBtnMultip());
    }

    public JButton getBtnDivsao() {
        return NumPanel.configBtn(btnDivsao);
    }

    public JButton getBtnMais() {
        return NumPanel.configBtn(btnMais);
    }

    public JButton getBtnMenos() {
        return NumPanel.configBtn(btnMenos);
    }

    public JButton getBtnMultip() {
        return NumPanel.configBtn(btnMultip);
    }
}
