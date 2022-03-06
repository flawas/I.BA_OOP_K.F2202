/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.sw03;

/**
 *
 * @author flaviowaser
 */
public class Iteration {
    
    public static void forIteration(){
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }
    }
    
    public static void whileIteration(){
        int i = 1;
        while (i <= 10){
        System.out.println(i);
        i++;
        }
    }
    
    public static void dowhileIteration(){
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while(i<=10);
    }
    
    public static void whileFloatIteration(){
        float i = (float) 0.9;
        while (i<= 1.0f){
           System.out.println(i);
           i = i + 0.000025f;
        }
    }
    
    public static void forFloatIteration(){
        float wert = 0.9f; 
        for(int i = 0; i < 4000; i++){
            wert = wert + 0.000025f; 
            System.out.println(wert);
        }
    }

    public static void main(String[] args) {
        System.out.println("-------------------- FOR --------------------");
        forIteration();
        System.out.println("-------------------- WHILE --------------------");
        whileIteration();
        System.out.println("-------------------- DO WHILE --------------------");
        dowhileIteration();
        System.out.println("-------------------- WHILE FLOAT --------------------");
        whileFloatIteration();
        System.out.println("-------------------- FOR FLOAT --------------------");
        forFloatIteration();
    }
    
    
}
