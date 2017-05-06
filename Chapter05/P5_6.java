package Chapter05;

import java.util.Scanner;

/**
 *
 * P5.6 Write a program that reads in the x- and y-coordinates of three corner
 * points of a triangle and prints out whether it has an obtuse angle, a right
 * angle, or only acute angles.
 */
public class P5_6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter x1 y1 x2 y2 x3 y3 : ");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double x3 = in.nextDouble();
        double y3 = in.nextDouble();

        double a = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        double b = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));
        double c = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));

        if (((a * a) == (b * b) + (c * c))
                || ((b * b) == (a * a) + (c * c))
                || ((c * c) == (a * a) + (b * b))) {
            System.out.println("Right angle");
        } else if (((a * a) > (b * b) + (c * c))
                || ((b * b) > (a * a) + (b * b))
                || ((c * c) > (a * a) + (b * b))) {
            System.out.println("Obtuse angle");
        } else {
            System.out.println("Acute angle");
        }
    }

}
