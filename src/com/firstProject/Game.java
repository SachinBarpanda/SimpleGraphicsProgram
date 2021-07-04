package com.firstProject;


import javax.swing.*;

public class Game {
    public static void main(String[] args) {
        JFrame window = new JFrame("Simple Program");
        window.setContentPane(new GamePanel());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        System.out.println("Width : " + window.getWidth());
        System.out.println("Height : "+ window.getHeight());
    }
}
