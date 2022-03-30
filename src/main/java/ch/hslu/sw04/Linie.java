/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.sw04;

/**
 *
 * @author Flavio Waser
 */
public class Linie {

    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private Point point1;
    private Point point2;
    private Point newPoint;
    private Point oldPoint;
    
    /*
    * Linie aufgrund von Koordinaten definieren
    */
    public Linie(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        
        // Punkte generieren
        point1 = new Point(x1, y1);
        point2 = new Point(x2, y2);
    }
    
    /*
    * Linie aufgrund von Objekten erzeugen
    */
    public Linie(Point point1, Point point2){
        this.point1 = new Point(point1.getX(), point1.getY());
        this.point2 = new Point(point2.getX(), point2.getY());
    }
    
    public void movePoint(Point oldPoint, Point newPoint){
        
        if(oldPoint.getX() == point1.getX() && oldPoint.getY() == point1.getY()){
            point1 = newPoint;
        } else if (oldPoint.getX() == point2.getX() && oldPoint.getY() == point2.getY()){
            point2 = newPoint;
        }
    }

    public Point getPoint1() {
        return new Point(point1.getX(), point1.getY());
    }

    public Point getPoint2() {
        return new Point(point2.getX(), point2.getY());
    }
    
    public void setStartPoint(Point newStartPoint){
        this.point1 = new Point(newStartPoint.getX(), newStartPoint.getY());
    }
    
    public void setEndPoint(Point newEndPoint){
        this.point2 = new Point(newEndPoint.getX(), newEndPoint.getY());
    }

    @Override
    public String toString() {
        return "Point[" + "x=" + point1 + ", y=" + point2 + ']';
    }
}
