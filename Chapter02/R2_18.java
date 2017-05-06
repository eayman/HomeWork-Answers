package Chapter02;

import java.awt.Rectangle;
// R2.18 Find the errors in the following statements:

public class R2_18 {

    public static void main(String[] args) {
        // a.
        Rectangle r = (5, 10, 15, 20);

        /* ERROR
        Rectangle r = (5, 10, 15, 20);
           TO CORRECT
        Rectangle r = new Rectangle(5, 10, 15, 20);
        */
        
        // b.
        double width = Rectangle(5, 10, 15, 20).getWidth();

        /* ERROR
        double width = Rectangle(5, 10, 15, 20).getWidth();
         TO CORRECT
        double width = new Rectangle(5, 10, 15, 20).getWidth();
         */
        
        // c.
        Rectangle r;
        r.translate(15, 25);

        /* ERROR
        Rectangle r;
        r.translate(15, 25); TO CORRECT
        Rectangle r = new Rectangle();
        r.translate(15, 25);
         */
        
        // d.
        r = new Rectangle();
        r.translate("far, far away!");

        /* ERROR
        r = new Rectangle();
        r.translate(15, 25);
        TO CORRECT
        Rectangle r = new Rectangle();
        r.translate(15, 25);
         */
    }

}
