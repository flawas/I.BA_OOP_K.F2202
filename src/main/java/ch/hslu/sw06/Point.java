/*
 * Copyright 2022 Roland Gisler, HSLU Informatik, Switzerland
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ch.hslu.sw06;

import java.util.Objects;

/**
 * Modell eines Punktes im 2D-Raum.
 * Klasse ist Immutable implementiert.
 */
@SuppressWarnings("PMD.ShortVariable")
public class Point {

    /**
     * Punkt keinem Quadrant zugeordnet.
     */
    private static final int NO_QUADRANT = 0;

    /**
     * Quadrant 1. Positiv x, Positiv y.
     */
    private static final int QUADRANT_1 = 1;

    /**
     * Quadrant 1. Negativ x, Positiv y.
     */
    private static final int QUADRANT_2 = 2;

    /**
     * Quadrant 1. Negativ x, Negativ y.
     */
    private static final int QUADRANT_3 = 3;

    /**
     * Quadrant 4. Positiv x, Negativ y.
     */
    private static final int QUADRANT_4 = 4;

    private int x;
    private int y;

    /**
     * Konstruktor für Punkt mit Koordinaten.
     * @param x x-Koordinate.
     * @param y y-Koordinate.
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Überladener Konstruktor mit einem Punkt als Parameter
     * @param point: Punkt als Parameter mitgeben
     */
    public Point(Point point){
        this.x = point.getX();
        this.y = point.getY();
    }

    /**
     * Liefert den Quadranten in welchem der Punkt liegt.
     * Liegen die Koordinaten auf den Achsen oder
     * auf dem Nullpunkt, liefert die Funktion den Wert 0 zurück.
     * @return Nummer des Quadranten.
     */
    public int getQuadrant() {
        int quadrant = NO_QUADRANT;
        if (this.x != 0 && this.y != 0) {
            if (this.x > 0) {
                if (this.y > 0) {
                    quadrant = QUADRANT_1;
                } else {
                    quadrant = QUADRANT_4;
                }
            } else {
                if (this.y > 0) {
                    quadrant = QUADRANT_2;
                } else {
                    quadrant = QUADRANT_3;
                }
            }
        }
        return quadrant;
    }

    /**
     * Liefert x-Koordinate zurück.
     * @return x-Koordinate des Punktes.
     */
    public int getX() {
        return this.x;
    }

    /**
     * Liefert y-Koordinate zurück.
     * @return y-Koordinate des Punktes.
     */
    public int getY() {
        return y;
    }
    
    /**
     * Setzt x-Koordinate
     * @param x: setze neue X-Koordinate
     */
    public void setX(int x){
        this.x = x;
    }

    /**
     * Setzte y-Koordinate
     * @param y : setze neue y-Koordinate
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Zwei Punkte mit identischen Koordinaten sind gleich.
     * {@inheritDoc}.
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Point)) {
            return false;
        }
        final Point other = (Point) obj;
        return this.x == other.x && this.y == other.y;
    }

    /**
     * Liefert Hashcode auf Basis von x und y-Koordinate.
     * {@inheritDoc}.
     */
    @Override
    public int hashCode() {
        return Objects.hash(this.x, this.y);
    }

    /**
     * Liefert eine String-Repräsentation des Punktes.
     * {@inheritDoc}.
     */
    @Override
    public String toString() {
        return "Point[x=" + this.x + ",y=" + this.y + "]";
    }

    public void moveRelative(int xrelative, int yrelative){
        this.x += xrelative;
        this.y += yrelative;
    }

    public void moveRelative(Point newPoint){
        this.x += newPoint.getX();
        this.y += newPoint.getY();
    }

}
