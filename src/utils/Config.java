package utils;

import javax.swing.*;
import java.awt.*;

public class Config {

    public static JButton btnConfig(JButton jButton) {
        jButton.setContentAreaFilled(false);
        jButton.setOpaque(true);

        jButton.setBackground(Color.black);
        jButton.setForeground(Color.WHITE);

        jButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton.setBackground(new Color(124, 162, 173));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton.setBackground(Color.BLACK);
            }
        });

        jButton.setFont(new Font("Buttons", Font.BOLD, 15));
        return jButton;
    }
}
