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
public final class Rectangle extends Shape {

    int width;
    private int height;

    public Rectangle(final int x, final int y, final int width, final int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getArea(){
        return (this.width * this.height);
    }
    
    public void changeDimension(final int newWidth, final int newHeight){
        width = newWidth;
        height = newHeight;
    }
    
    @Override
    public int getPerimeter() {
        return (2 * this.width) + (2 * this.height);
    }

}
