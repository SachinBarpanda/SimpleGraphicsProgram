package com.platformer.applet;

import com.firstProject.GamePanel;

import javax.swing.*;
import java.awt.*;

public class GameApplet extends JApplet {
    public static final long serialVersionUID = 1L;
    private GamePanel gamePanel;

    public void init(){
        Container pane = getContentPane();
        pane.setLayout(new BorderLayout());
        gamePanel = new GamePanel();
        pane.add(gamePanel);
        this.setSize(GamePanel.WIDTH, GamePanel.HEIGHT);

    }
}
