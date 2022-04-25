package view;

import utils.Config;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperacoesPanel extends JPanel implements ActionListener {

    private static char op;
    private static double value1;
    private static double value2;

    private final JButton btnDivisao = new JButton("/");
    private final JButton btnMais = new JButton("+");
    private final JButton btnMenos = new JButton("-");
    private final JButton btnMultip = new JButton("*");
    private final JButton btnIgual = new JButton("=");
    private final JButton btnCE = new JButton("CE");

    private ValuePanel valuePanel;

    public OperacoesPanel(ValuePanel valuePanel) {
        this.valuePanel = valuePanel;

        setBackground(Color.DARK_GRAY);
        setLayout(new GridLayout(4, 1, 3, 3));

        add(getBtnDivisao());
        add(getBtnMais());
        add(getBtnMenos());
        add(getBtnMultip());
    }

    public JButton getBtnDivisao() {
        btnDivisao.addActionListener(this);
        return Config.btnConfig(btnDivisao);
    }

    public JButton getBtnMais() {
        btnMais.addActionListener(this);
        return Config.btnConfig(btnMais);
    }

    public JButton getBtnMenos() {
        btnMenos.addActionListener(this);
        return Config.btnConfig(btnMenos);
    }

    public JButton getBtnMultip() {
        btnMultip.addActionListener(this);
        return Config.btnConfig(btnMultip);
    }

    public JButton getBtnIgual() {
        btnIgual.addActionListener(this);
        return Config.btnConfig(btnIgual);
    }

    public JButton getBtnCE() {
        btnCE.addActionListener(this);
        return Config.btnConfig(btnCE);
    }

    public ValuePanel getValuePanel() {
        return valuePanel;
    }

    public void setValuePanel(ValuePanel valuePanel) {
        this.valuePanel = valuePanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (valuePanel.getTextField().getText().isEmpty()) {
            return;
        }
        JButton btn = (JButton) e.getSource();

        if (btn.equals(btnCE)) {
            op = '\u0000';
            valuePanel.setText("0");
        } else if (btn.equals(btnIgual)) {
            value2 = Double.parseDouble(valuePanel.getTextField().getText());
            double result = 0;

            if (op == '+') {
                result = value1 + value2;
            } else if (op == '-') {
                result = value1 - value2;
            } else if (op == '*') {
                result = value1 * value2;
            } else if (op == '/') {
                result = value1 / value2;
            }

            valuePanel.setText(String.valueOf(result));
            op = '\u0000';
            value1 = result;
            value2 = 0;

        } else {
            op = btn.getText().charAt(0);
            value1 = Double.parseDouble(valuePanel.getTextField().getText());
            valuePanel.setText("");
        }

    }
}
