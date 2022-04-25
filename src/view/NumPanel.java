package view;

import utils.Config;

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

    private ValuePanel valuePanel;

    public NumPanel(ValuePanel valuePanel) {
        this.valuePanel = valuePanel;
        OperacoesPanel op = new OperacoesPanel(valuePanel);

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
        add(op.getBtnCE());
        add(getBtnZero());
        add(op.getBtnIgual());

    }

    private JButton getBtnZero() {
        btnZero.addActionListener(this);
        return Config.btnConfig(btnZero);
    }

    public JButton getBtnUm() {
        btnUm.addActionListener(this);
        return Config.btnConfig(btnUm);
    }

    public JButton getBtnDois() {
        btnDois.addActionListener(this);
        return Config.btnConfig(btnDois);
    }

    public JButton getBtnTres() {
        btnTres.addActionListener(this);
        return Config.btnConfig(btnTres);
    }

    public JButton getBtnQuatro() {
        btnQuatro.addActionListener(this);
        return Config.btnConfig(btnQuatro);
    }

    public JButton getBtnCinco() {
        btnCinco.addActionListener(this);
        return Config.btnConfig(btnCinco);
    }

    public JButton getBtnSeis() {
        btnSeis.addActionListener(this);
        return Config.btnConfig(btnSeis);
    }

    public JButton getBtnSete() {
        btnSete.addActionListener(this);
        return Config.btnConfig(btnSete);
    }

    public JButton getBtnOito() {
        btnOito.addActionListener(this);
        return Config.btnConfig(btnOito);
    }

    public JButton getBtnNove() {
        btnNove.addActionListener(this);
        return Config.btnConfig(btnNove);
    }

    public ValuePanel getPanel() {
        return valuePanel;
    }

    public void setPanel(ValuePanel panel) {
        this.valuePanel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        String number = btn.getText();
        if (valuePanel.getTextField().getText().equals("0")) {
            valuePanel.getTextField().setText("");
        }
        if (valuePanel.getTextField().getText().length() == 10) {
            return;
        }
        valuePanel.getTextField().setText(valuePanel.getTextField().getText().concat(number));
    }
}
