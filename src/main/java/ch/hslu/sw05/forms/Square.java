/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.sw05.forms;

/**
 * * SW05: Vererbung / Entwicklungsumgebung
 *
 * @author Flavio Waser
 */
public final class Square extends Shape {
    
    private int x;
    private int y;
    private int width;
    
    public Square(int x, int y, int width){
        super(x, y);
        this.width = width;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    
    @Override
    public int getPerimeter(){
        return (4  * width);
    }
    
    public int getArea(){
        return (width * width);        
    }
    
}
