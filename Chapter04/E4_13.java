
package Chapter04;

/**
  E4.13 Write a program that reads a number between 1,000 and 999,999 from the user,
  * where the user enters a comma in the input. Then print the number without a comma.
  * Here is a sample dialog; the user input is in color:Please enter an integer between 1,000 and 999,999: 
  * 23,45623456Hint: Read the input as a string. Measure the length of the string. Suppose it contain characters.
  * Then extract substrings consisting of the first n – 4 characters and the last three characters.
 */

import java.util.Scanner;
public class E4_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter an integer between 1,000 and 999,999: ");
        String input = in.next();
        int length = input.length();
        String part1 = input.substring(0,length-4);
        String part2 = input.substring(length-3,length);
        String result = part1 + part2;
        System.out.println(result);
        }
    }
