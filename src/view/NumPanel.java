package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumPanel extends JPanel implements ActionListener {

    private final JButton btnZero = new JButton("0");
    private final JButton btnUm = new JButton("1");
    private final JButton btnDois = new JButton("2");
    private final JButton btnTres = new JButton("3");
    private final JButton btnQuatro = new JButton("4");
    private final JButton btnCinco = new JButton("5");
    private final JButton btnSeis = new JButton("6");
    private final JButton btnSete = new JButton("7");
    private final JButton btnOito = new JButton("8");
    private final JButton btnNove = new JButton("9");
    private final JButton btnIgual = new JButton("=");
    private final JButton btnCE = new JButton("CE");

    public NumPanel() {
        setBackground(Color.DARK_GRAY);
        setLayout(new GridLayout(4, 4, 3, 3));

        // Primeira linha
        add(getBtnSete());
        add(getBtnOito());
        add(getBtnNove());

        // Segunda linha
        add(getBtnQuatro());
        add(getBtnCinco());
        add(getBtnSeis());

        // Terceira linha
        add(getBtnUm());
        add(getBtnDois());
        add(getBtnTres());

        // Ultima linha
        add(getBtnCE());
        add(getBtnZero());
        add(getBtnIgual());

    }

    private JButton getBtnZero() {
        return configBtn(btnZero);
    }

    public JButton getBtnUm() {
        return configBtn(btnUm);
    }

    public JButton getBtnDois() {
        return configBtn(btnDois);
    }

    public JButton getBtnTres() {
        return configBtn(btnTres);
    }

    public JButton getBtnQuatro() {
        return configBtn(btnQuatro);
    }

    public JButton getBtnCinco() {
        return configBtn(btnCinco);
    }

    public JButton getBtnSeis() {
        return configBtn(btnSeis);
    }

    public JButton getBtnSete() {
        return configBtn(btnSete);
    }

    public JButton getBtnOito() {
        return configBtn(btnOito);
    }

    public JButton getBtnNove() {
        return configBtn(btnNove);
    }

    public JButton getBtnIgual() {
        return configBtn(btnIgual);
    }

    public JButton getBtnCE() {
        return configBtn(btnCE);
    }

    public static JButton configBtn(JButton jButton) {
        jButton.setContentAreaFilled(false);
        jButton.setOpaque(true);

        jButton.setBackground(Color.black);
        jButton.setForeground(Color.WHITE);

        jButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton.setBackground(Color.CYAN);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton.setBackground(Color.BLACK);
            }
        });


        jButton.setFont(new Font("Buttons", Font.BOLD, 15));
        return jButton;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
