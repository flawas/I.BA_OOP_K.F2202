/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.sw03;

/**
 *
 * @author Flavio Waser
 */
public class Point {

    private int x;
    private int y;
    
    public Point(int x, int y){
        this.x = x;
        this.y = y;
        
        //System.out.println("X: " + x + "Y: " + y);

    }
    
    public String getQuadrant(){
        if(x < 0 && y < 0){
            return "Quadrant 3";
        } else if (x < 0 && y > 0){
            return "Quadrant 4";
        } else if (x > 0 && y > 0){
           return "Quadrant 1";
        } else if(x > 0 && y < 0){
            return "Quadrant 2";
        } else if (x == 0 || y == 0){
            return "Punkt liegt auf der Achse";
        }
        return "Es ist ein Fehler aufgetreten";
    }
}
