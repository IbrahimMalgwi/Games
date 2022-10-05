package brickBreaker;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame gameBoard = new JFrame();
        GamePlay gamePlay = new GamePlay();
        gameBoard.setBounds(10, 10, 700, 600);
        gameBoard.setTitle("Breakout Ball");
        gameBoard.setResizable(false);
        gameBoard.setVisible(true);
        gameBoard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameBoard.add(gamePlay);
    }
}
