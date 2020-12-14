package com.swing;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame() {};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setTitle("Hey Eugene!");
        jFrame.setResizable(false);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2 - 250, dimension.height/2 - 250, 500, 300);
//        jFrame.add(new JLabel(new ImageIcon("/Users/eugeneburdukov/Documents/java/swing/src/com/swing/IMG_9752.JPG")));
    }
}
