/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch.hslu.sw03;

/**
 *
 * @author flaviowaser
 */
public class SwissCross {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int size = bannerSize;
        while (!(size % 3 == 0)){
            size++;
        }
        
        for(int h = 1; h < size+1; h++){
            if(h <= size/3 || h > size / 3 * 2){
                System.out.println(repeat(size/3, " ") + repeat(size/3, "@") + repeat(size/3, " "));
            } else {
                System.out.println(repeat(size, "@"));
            }
        }
        
    }
    
    private static String repeat(int count, String with) {
        return 
    }
    
}
