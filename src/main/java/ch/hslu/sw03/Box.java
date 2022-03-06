/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.sw03;

/**
 *
 * @author flaviowaser
 */
public class Box {

    private String wertHeight = "";
    private String wertWidth = "";
    private int height;
    private int widht;
    
    public void printBox(final int height, final int width){
        this.height = height;
        this.widht = width;
        
        for(int i  = 0; i < width; i++){
             wertWidth += "#";
        }
        
        for(int h = 0; h < (height - 2); h++){ 
           wertHeight += "#";
           for(int hi = 0; hi< (width -2); hi++){
               wertHeight += " ";
           }
        }
        
        System.out.println(wertWidth);
        for (int pr = 0; pr < (height -2); pr++){
            System.out.println(wertHeight);
        }
        System.out.println(wertWidth);
        
    }
    
}
