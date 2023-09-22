/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cicdcovdemo;

import java.util.Scanner;

/**
 *
 * @author nathane
 */
public class Main {

    public static int collatz(int n)
    {
        int count = 0;
        if (n < 1) throw new IllegalArgumentException("n must be >= 1");
        while (n > 1)
        {
            if (n%2 == 0)
                n = n/2;
            else
                n = 3*n+1;
            count ++;
        }
        return count;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // smoke test:
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        System.out.println("chain length: " + collatz(n));
    }
    
}
