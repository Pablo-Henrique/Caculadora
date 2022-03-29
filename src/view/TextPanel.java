package view;

import javax.swing.*;
import java.awt.*;

public class TextPanel extends JPanel {

    private final JLabel jLabel = new JLabel("0");

    public TextPanel() {
        setLayout(new BorderLayout());
        setSize(40, UI.HEIGHT);
        setBackground(Color.DARK_GRAY);

        jLabel.setHorizontalAlignment(JLabel.RIGHT);
        jLabel.setFont(new Font("label", Font.BOLD, 60));
        jLabel.setForeground(Color.WHITE);
        add(jLabel);
    }

    public JLabel getjLabel() {
        return jLabel;
    }
}
