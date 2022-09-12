
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
