
package simple.calculator;

import java.util. Scanner;
public class Subtraction extends Computation{
    public Subtraction() {
        
    }
    
    void result(){
        Scanner difference = new Scanner(System.in);
        
        System.out.print("First Num: ");
        int x = difference.nextInt();
        
        System.out.print("Second Num: ");
        int y = difference.nextInt();
        
        int subtract = x - y;
        System.out.println("The total is "  + subtract);
    }

}
