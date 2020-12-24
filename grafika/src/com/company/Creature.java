package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Creature extends JFrame {
    int x=0; //position x
    int y=0; //position y

    boolean left = false;
    boolean right = false;
    boolean up = false;
    boolean down = false;

    boolean infected = false; //true mean infected
    Random random = new Random();

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    //this method is responsible for movement
    public void movement(){
        //move left
        if (this.left == true && this.x > 0){
            this.x -= 1;
        }
        //move right
        if (this.right == true){
            this.x += 1;
        }
        //move up
        if (this.up == true && this.y > 0){
            this.y -= 1;
        }
        //move down
        if (this.down == true){
            this.y += 1;
        }

    }


    //this method is responsible for calculating randomly movement
   public void goRandomly(){
    int chooseDirection = random.nextInt(100);

    //selected left
    if (chooseDirection <25){
        this.left = true;
        this.right = false;
    }
    //selected right
    if (chooseDirection >=25 && chooseDirection < 50){
        this.left = false;
        this.right = true;
    }
    //selected up
    if (chooseDirection >=50 && chooseDirection < 75){
        this.up = true;
        this.down = false;
    }
    //selected down
    if (chooseDirection >=75){
        this.down = true;
        this.up = false;
    }

    }



    //this method show creature on map
    void display(){

        System.out.println("X: " + this.getX() + " Y: " + this.getY());
    }

    public void rys(Graphics g){
        g.fillRect(this.getX(), this.getY(), 50, 50);

    }

}
