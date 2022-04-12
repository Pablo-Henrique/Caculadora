package view;

import utils.Config;
import utils.Operacoes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

public class OperacoesPanel extends JPanel implements ActionListener {

    private final JButton btnDivisao = new JButton("/");
    private final JButton btnMais = new JButton("+");
    private final JButton btnMenos = new JButton("-");
    private final JButton btnMultip = new JButton("*");
    private final JButton btnIgual = new JButton("=");
    private final JButton btnCE = new JButton("CE");

    private JButton ultimaOperacao;

    private final Operacoes op;
    private ValuePanel valuePanel;
    private BigDecimal total;


    public OperacoesPanel(ValuePanel valuePanel) {
        this.valuePanel = valuePanel;
        this.op = Operacoes.getInstance();
        total = BigDecimal.ZERO;

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
        JButton btn = (JButton) e.getSource();

        if (btn.equals(btnCE)) {
            valuePanel.getValuePanel().setText("");
            this.op.clean();
        }

        if (btn.equals(btnMais)) {
            this.op.som(new BigDecimal(valuePanel.getValuePanel().getText()), btnMais.getText());
            valuePanel.getValuePanel().setText("");
        }

        if (btn.equals(btnMenos)) {
            this.op.sub(new BigDecimal(valuePanel.getValuePanel().getText()), btnMenos.getText());
            valuePanel.getValuePanel().setText("");
        }

        if (btn.equals(btnDivisao)) {
            this.op.div(new BigDecimal(valuePanel.getValuePanel().getText()), btnDivisao.getText());
            valuePanel.getValuePanel().setText("");
        }

        if (btn.equals(btnMultip)) {
            this.op.mult(new BigDecimal(valuePanel.getValuePanel().getText()), btnMultip.getText());
            valuePanel.getValuePanel().setText("");
        }

        if (btn.equals(btnIgual)) {
            if (this.op.getLastOperation().equals(btnDivisao.getText())) {
                this.total = this.op.div(new BigDecimal(valuePanel.getValuePanel().getText()), btnIgual.getText());
            }
            if (this.op.getLastOperation().equals(btnMultip.getText())) {
                this.total = this.op.mult(new BigDecimal(valuePanel.getValuePanel().getText()), btnIgual.getText());
            }
            if (this.op.getLastOperation().equals(btnMais.getText())) {
                this.total = this.op.som(new BigDecimal(valuePanel.getValuePanel().getText()), btnIgual.getText());
            }
            if (this.op.getLastOperation().equals(btnMenos.getText())) {
                this.total = this.op.sub(new BigDecimal(valuePanel.getValuePanel().getText()), btnIgual.getText());
            }
            valuePanel.getValuePanel().setText(total.toString());
        }
    }
}
