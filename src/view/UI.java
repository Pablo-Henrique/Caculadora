package view;

import javax.swing.*;
import java.awt.*;

public class UI extends JFrame {

    JTextField textField;

    public UI(Dimension dimension) {
        JFrame frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(dimension);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.add(visor());
    }

    private JTextField visor() {
        textField = new JTextField("0");
        textField.setBounds(0, 0, 30, 50);
        textField.setAlignmentY(getAlignmentY());
        return textField;
    }

}
