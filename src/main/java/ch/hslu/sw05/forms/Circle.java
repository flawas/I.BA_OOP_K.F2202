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
public final class Circle extends Shape {

    private int diameter;
    
    public Circle(final int x, final int y, final int diameter) {
        super(x, y);
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
    
    public int getArea(){
        return (this.diameter * this.diameter);
    }
    
    @Override
    public int getPerimeter() {
        return (4 * this.diameter);
    }

}
