/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anhplp.main;

import static anhplp.util.MathUtils.computeFactorial;

/**
 *
 * @author theFrozenAdam
 */
public class Main {
    public static void main(String[] args) {
        //hi vọng hàm trả về 120 nếu tính 5!
        System.out.println("5! = " + computeFactorial(5));
        //hi vọng hàm trả về 1 nếu tính 1!
        //expected cF(1) = 1
        System.out.println("1! = " + computeFactorial(1));
        //expected cF(0) = 0 
        System.out.println("0! = " + computeFactorial(0));
        //exception
        System.out.println("-5! = " + computeFactorial(-5));
    }
}
