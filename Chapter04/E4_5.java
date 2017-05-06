
package Chapter04;
/*


•• E4.4 Write a program that prompts the user for two integers and then prints
• The sum
• The difference
• The product
• The average
• The distance (absolute value of the difference)
• The maximum (the larger of the two)
• The minimum (the smaller of the two)
Hint: The max and min functions are declared in the Math class.

•• E4.5 Enhance the output of Exercise E4.4 so that the numbers are properly aligned:
Sum: 45
Difference: -5
Product: 500
Average: 22.50
Distance: 5
Maximum: 25
Minimum: 20
*/

import java.util.Scanner;

public class E4_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter First Number : ");
        double first = in.nextDouble();
        System.out.println("Please enter Secend Number : ");
        double secend = in.nextDouble();
        System.out.println("The sum: " + (first + secend));
        System.out.println("The difference: " + (first - secend));
        System.out.println("The product: " + (first * secend));
        System.out.println("The average: " + (first + secend) / 2);
        System.out.println("The distance: " + Math.abs(first - secend));
        System.out.println("The maximum: " + Math.max(first, secend));
        System.out.println("The minimum: " + Math.min(first, secend));
    }
}
