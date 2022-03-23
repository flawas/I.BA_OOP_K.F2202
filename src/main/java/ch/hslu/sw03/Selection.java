/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.sw03;

/**
 *
 * @author Flavio Waser
 */
public class Selection {
    
    public Selection(){
        
    }
    
    public static int max(int a, int b){
        if(a > b) {
            return a;
        } else {
            return b;
        }
    }
    
    public static int min(int a, int b){
        if(a < b) {
            return a;
        } else {
            return b;
        }        
    }

    public static int max(int a, int b, int c){
        if(a > b && a > c){
            return a;
        } else if(b > a && b > c){
            return b;
        } else {
            return c;
        }
    }
    
}
