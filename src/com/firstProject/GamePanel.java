package com.firstProject;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.*;

public class GamePanel extends JPanel {
    public static final long serialVersionUID = 1L;
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;

    public GamePanel(){
        super();
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        setFocusable(true);
        requestFocus();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString("JAVA 2D!",300,220);

    }
}
