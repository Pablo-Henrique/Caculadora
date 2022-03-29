package view;

import javax.swing.*;
import java.awt.*;

public class ButtonPanel extends JPanel {

    private final JButton btnZero = new JButton("0");
    private final JButton btnUm = new JButton("1");
    private final JButton btnDois = new JButton("1");
    private final JButton btnTres = new JButton("1");
    private final JButton btnQuatro = new JButton("1");
    private final JButton btnCinco = new JButton("1");
    private final JButton btnSeis = new JButton("1");
    private final JButton btnSete = new JButton("1");
    private final JButton btnOito = new JButton("1");
    private final JButton btnNove = new JButton("1");
    private final JButton btnIgual = new JButton("1");
    private final JButton btnCE = new JButton("1");

    public ButtonPanel() {
        setBackground(Color.DARK_GRAY);
        setLayout(new GridLayout(4, 5, 3, 5));

        add(getBtnZero());
        add(getBtnUm());
        add(getBtnDois());
        add(getBtnTres());
        add(getBtnQuatro());
        add(getBtnCinco());
        add(getBtnSeis());
        add(getBtnSete());
        add(getBtnOito());
        add(getBtnNove());
        add(getBtnIgual());
        add(getBtnCE());
    }

    private JButton getBtnZero() {
        return btnConfig(btnZero);
    }

    public JButton getBtnUm() {
        return btnConfig(btnUm);
    }

    public JButton getBtnDois() {
        return btnConfig(btnDois);
    }

    public JButton getBtnTres() {
        return btnConfig(btnTres);
    }

    public JButton getBtnQuatro() {
        return btnConfig(btnQuatro);
    }

    public JButton getBtnCinco() {
        return btnConfig(btnCinco);
    }

    public JButton getBtnSeis() {
        return btnConfig(btnSeis);
    }

    public JButton getBtnSete() {
        return btnConfig(btnSete);
    }

    public JButton getBtnOito() {
        return btnConfig(btnOito);
    }

    public JButton getBtnNove() {
        return btnConfig(btnNove);
    }

    public JButton getBtnIgual() {
        return btnConfig(btnIgual);
    }

    public JButton getBtnCE() {
        return btnConfig(btnCE);
    }

    public static JButton btnConfig(JButton jButton) {
        jButton.setContentAreaFilled(false);
        jButton.setOpaque(true);
        jButton.setBackground(Color.black);
        jButton.setForeground(Color.WHITE);
        jButton.setBounds(new Rectangle(40, 80));

        return jButton;
    }
}
