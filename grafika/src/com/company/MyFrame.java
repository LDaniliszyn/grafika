package com.company;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    Graphics graphics;
    Image image;
    Creature[] human;

    MyFrame(){
         human = new Creature[10];
        for (int i = 0; i < human.length; i++) {
            human[i] = new Creature();
        }


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1500,700);
        this.setVisible(true);
    }

    public void paint(Graphics g){

        image = createImage(this.getWidth(),this.getHeight());
        graphics = image.getGraphics();
        for (int i = 0; i < human.length; i++) {
            human[i].rys(g);
            human[i].goRandomly();
            human[i].movement();

        }
    }
}
