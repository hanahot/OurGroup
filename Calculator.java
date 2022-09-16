package simple.calculator;

import java.util.Scanner;
public class Addition extends Computation{
    public Addition() {
        
    }
    
    void result(){
        Scanner sum = new Scanner(System.in);
        
        System.out.print("First Num: ");
        int x = sum.nextInt();
        
        System.out.print("Second Num: ");
        int y = sum.nextInt();
        
        int add = x + y;
        System.out.println("The total is " + add);

package simple.calculator;
import java.util.Scanner;
public class Division extends Computation {
    public Division() {
    }
    
    void result(){
        Scanner quotient = new Scanner(System.in);
        
        System.out.print("First Num: ");
        int x = quotient.nextInt();
        
        System.out.print("Second Num: ");
        int y = quotient.nextInt();
        
        int divide = x / y;
        System.out.println("The total is " + divide);
    }
}
