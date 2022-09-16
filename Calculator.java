
package simple.calculator;

import java.util. Scanner;
public class Subtraction extends Computation{
    public Subtraction() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial simplecalculator/Calculation."<init>":()V
         * 4: return
         *  */
        // </editor-fold>
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
