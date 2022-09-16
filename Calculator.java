
package simple.calculator;

import java.util.Scanner;
public class Addition extends Computation{
    public Addition() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial simplecalculator/Calculation."<init>":()V
         * 4: return
         *  */
        // </editor-fold>
    }
    
    void result(){
        Scanner sum = new Scanner(System.in);
        
        System.out.print("First Num: ");
        int x = sum.nextInt();
        
        System.out.print("Second Num: ");
        int y = sum.nextInt();
        
        int add = x + y;
        System.out.println("The total is " + add);
    }
}
