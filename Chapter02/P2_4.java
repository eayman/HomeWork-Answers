
package Chapter02;

/*
P2.4 The intersection method computes the intersection of two rectangles—that is,
the rectangle that would be formed by two overlapping rectangles if they were drawn, as shown .
You call this method as follows:
Rectangle r3 = r1.intersection(r2);
Write a program IntersectionPrinter that constructs two rectangle objects, prints them as described in Exercise P2.1,
and then prints the rectangle object that describes the intersection. 
Then the program should print the result of the intersection method when the rectangles do not overlap. 
Add a comment to your program that explains how you can tell whether the resulting rectangle is empty.
*/
import java.awt.Rectangle;

public class P2_4 {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(0, 0, 20, 30);
        System.out.println(r1);

        Rectangle r2 = new Rectangle(10, 15, 30, 20);
        System.out.println(r2);

        Rectangle r3 = r1.intersection(r2);
        System.out.println(r3);

        /**
         * I will write comment and code to solve this problem 
  * after this comment you will see code by using if statement 
         * if :
         * sum of X + Width for r1 greater than X for r2 
         * or
         * sum of Y + Height for r1 greater than Y for r2 
         * There is an intersection 
         * else if : 
         * sum of X + Width for r1 less than X for r2 
         * or 
         * sum of Y + Height for r1 less than Y for r2 
         * There is no intersection 
         * else  :
         * sum of X + Width for r1 equal X for r2
         * or 
         * sum of Y + Height for r1 equal Y for r2 
         * Two rectangles touch each other
         */
        
        // p1 = X + Width  for r1
        double p1 = r1.getX() + r1.getWidth();
        // p2 = y + height  for r1
        double p2 = r1.getY() + r1.getHeight();

        // g1 = X  for r2
        double g1 = r2.getX();
        // g2 = Y  for r2
        double g2 = r2.getY();

        // if statemnet to test intersection
        if (p1 > g1 || p2 > g2) {
            System.out.println("There is an Intersection ");
        } else if (p1 < g1 || p2 < g2) {
            System.out.println("There is No Intersection");
        } else if (p1 == g1 || p2 == g2) {
            System.out.println(" Two Rectangles touch each other.");
        } 
          else {
            System.out.println("Error !");
        }
    }


}
