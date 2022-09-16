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


package simple.calculator;

import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner pick = new Scanner(System.in);
        
       System.out.println("#########################################################");
       System.out.println("#          S I M P L E   C A L C U L A T O R            #");
        System.out.println("            A. Addition                                 ");
        System.out.println("            B. Subtraction                              ");
        System.out.println("            C. Multiplication                           ");
        System.out.println("            D. Division                                 ");
        System.out.print("            Please choose your operation:                 ");
        
        char choices = pick.next().charAt(0);
        switch(choices){
            case 'A':
                Computation add = new Addition();
                add.result();
                System.out.print("THANK YOU FOR USING SIMPLE CALCULATOR ");
                break;
                
            case 'B':
                Computation subtract = new Subtraction();
                subtract.result();
                System.out.print("THANK YOU FOR USING SIMPLE CALCULATOR ");
                break;
                
            case 'C':
                Computation multiply = new Multiplication();
                multiply.result();
                System.out.print("THANK YOU FOR USING SIMPLE CALCULATOR ");
                break;
                
            case 'D':
                Computation divide = new Division();
                divide.result();
                System.out.print("THANK YOU FOR USING SIMPLE CALCULATOR ");
                break;
                
            default: 
                Computation simple = new Computation();
                    simple.result();
                
                
        }
    }
    
}
