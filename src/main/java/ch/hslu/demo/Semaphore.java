/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.demo;

/**
 *
 * @author Flavio Waser
 */
public final class Semaphore {

    private int sema; // Semaphor Zähler 

    public Semaphore(final int init) {
        sema = init;
    }

    public synchronized void acquire() throws InterruptedException {
        while (sema == 0) {
            this.wait();
        }
        sema--;
    }

    public synchronized void release() {
        sema++;
        this.notifyAll();
    }
}
