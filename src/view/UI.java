package view;

import javax.swing.*;
import java.awt.*;

public class UI extends JFrame {

    public static void init() {
        new UI();
    }

    public UI() {
        super("Calculadora");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.DARK_GRAY);

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        setSize(325, 520);
        setLocationRelativeTo(null);
        setResizable(false);


        add(BorderLayout.NORTH, new TextPanel());
        add(BorderLayout.CENTER, new ButtonPanel());

        setVisible(true);
    }

}
