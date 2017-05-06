
package Chapter05;

import java.util.Scanner;

/**
  E5.7 Write a program that reads in three integers and prints “in order” if they are sorted in
ascending or descending order, or “not in order” otherwise. For example,
1 2 5 in order
1 5 2 not in order
5 2 1 in order
1 2 2 in order
 */
public class E5_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Three Number : ");
        int first = in.nextInt();
        int secend = in.nextInt();
        int third = in.nextInt();
       
        if (first >= secend && secend >= third || first <= secend && secend <= third  )
            System.out.println(" in order");
        else
            System.out.println(" not in order"); 

    }
    
}
