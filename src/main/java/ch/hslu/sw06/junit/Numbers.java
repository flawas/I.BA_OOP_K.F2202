/*
 * Copyright (c) 2022.
 * Flavio Waser, flaviowaser.ch
 * Version 1.0, 2022.3.31
 */

package ch.hslu.sw06.junit;

import java.util.Random;

public class Numbers {

    /**
     * Attribute
     */
    final int x;
    final int y;
    final int z;
    Random rand = new Random();

    public Numbers(){
        this.x = getRandom(30,10);
        this.y = getRandom(50,30);
        this.z = getRandom(80,60);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public int getMax(){
        if(this.getX() < this.getY()){
            if(this.getY() < this.getZ()){
                return this.getZ();
            } else {
                return this.getY();
            }
        } else {
            return this.getX();
        }

    }

    private int getRandom(final int max, final int min){
        return rand.nextInt(min, max);
    }
}
