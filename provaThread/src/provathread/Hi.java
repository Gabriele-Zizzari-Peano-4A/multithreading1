/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provathread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zizzari.gabriele
 */
public class Hi extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print("Hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
    }
}
