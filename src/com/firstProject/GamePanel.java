package com.firstProject;

import java.awt.*;
import java.awt.geom.Rectangle2D;
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

        g.setColor(new Color(255,0,0));
        FontMetrics metrics = g.getFontMetrics();
        Rectangle2D strRect = metrics.getStringBounds("JAVA 2D!",g);

        int centrePanelX = WIDTH/2;
        int centrePanelY = HEIGHT/2;

        int strX = centrePanelX-(int)(strRect.getWidth()/2);
        int strY = centrePanelY - (int)(strRect.getHeight()/2);


        g.drawLine(0,strY,WIDTH,strY);
        g.drawLine(centrePanelX,0,centrePanelX,HEIGHT);
//        g.drawString("JAVA 2D!",strX,strY);

        Font myFont =  new Font(Font.MONOSPACED, Font.BOLD, 24);
        g.setFont(myFont);
        g.drawString("JAVA 2D!",strX,strY);
    }
}
