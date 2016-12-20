/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asmit Joshi
 */
import java.util.Scanner;

public class MinMaxPower {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int x = input.nextInt();
        System.out.println("Enter the second number:");
        int y = input.nextInt();
        if (x < y) {
            System.out.println("MIN= " + x);
            System.out.println("MAX= " + y);
        } else if (x > y) {
            System.out.println("MIN= " + y);
            System.out.println("MAX= " + x);
        } else {
            System.out.println("They are equal.");
        }

        //x^y
        int xPowerY = x;
        for (int i = 1; i < y; i++) {
            xPowerY = x * xPowerY;
        }
        System.out.println(x + "^" + y + " = " + xPowerY);
    }

}
