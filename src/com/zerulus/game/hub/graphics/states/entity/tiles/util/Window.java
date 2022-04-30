package com.zerulus.game.hub.graphics.states.entity.tiles.util;

import javax.swing.JFrame;

public class Window extends JFrame {

    public Window() {
        setTitle("Your moon");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new GamePanel( 1280,   720 ));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

    }
}
