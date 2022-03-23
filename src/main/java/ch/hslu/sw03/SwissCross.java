/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch.hslu.sw03;

/**
 *
 * @author Flavio Waser
 */
public class SwissCross {
    
    public SwissCross(final int bannerSize) {
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
        return new String(new char[count]).replace("\0", with);
    }
    
}
