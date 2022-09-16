
package simple.calculator;

import java.util.Scanner;

public class Multiplication extends Computation{
    public Multiplication() {
    }
    
    void result(){
        Scanner product = new Scanner(System.in);
        
        System.out.print("First Num: ");
        int x = product.nextInt();
        
        System.out.print("Second Num: ");
        int y = product.nextInt();
        
        int multiply = x * y;
        System.out.println("The total is " + multiply);
    }
    
}
