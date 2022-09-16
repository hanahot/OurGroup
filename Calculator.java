package simple.calculator;

import java.util.Scanner;
public class Addition extends Computation{
    public Addition() {

package simple.calculator;

import java.util. Scanner;
public class Subtraction extends Computation{
    public Subtraction() {
        
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
        Scanner difference = new Scanner(System.in);
        
        System.out.print("First Num: ");
        int x = difference.nextInt();
        
        System.out.print("Second Num: ");
        int y = difference.nextInt();
        
        int subtract = x - y;
        System.out.println("The total is "  + subtract);
    }

}
