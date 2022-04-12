package view;

import utils.Operacoes;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class ValuePanel extends JPanel {

    private final JTextField valuePanel = new JTextField("0");

    public ValuePanel() {
        setLayout(new BorderLayout());
        setBackground(Color.DARK_GRAY);

        valuePanel.setHorizontalAlignment(JLabel.RIGHT);
        valuePanel.setFont(new Font("label", Font.BOLD, 60));
        valuePanel.setForeground(Color.WHITE);
        valuePanel.setBorder(new LineBorder(Color.GRAY));
        valuePanel.setBackground(Color.DARK_GRAY);

        valuePanel.setEnabled(false);
        add(valuePanel);
    }

    public JTextField getValuePanel() {
        return valuePanel;
    }
}
