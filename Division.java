
package simple.calculator;
import java.util.Scanner;
public class Division extends Computation {
    public Division() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial simplecalculator/Calculation."<init>":()V
         * 4: return
         *  */
        // </editor-fold>
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
