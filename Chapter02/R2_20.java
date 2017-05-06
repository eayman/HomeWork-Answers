package Chapter02;

import java.awt.Rectangle;
import java.util.Random;

/*
 R2.20 Consult the API documentation to find methods for

*/
public class R2_20 {

    public static void main(String[] args) {
        
        /*
        Concatenating two strings , that is, making a string consisting of the first string
        , followed by the second string.
        */ 
        String first = "eyad ";
        String secend = "ayman";
        String third = first.concat(secend);
        System.out.println(third);
        
        /*
            Class : String
            return type : String
            method name : concat
            types of the arguments : String
         */
      
        /*
        Removing leading and trailing white space of a string.
        */
        String remove = " This is Trim Method ! ";
        System.out.println(remove.trim());
        /*
            Class : String
            return type : String
            method name : trim
            types of the arguments : no arguments
         */
      
        /*
        Converting a rectangle to a string.
        */

        Rectangle box = new Rectangle();
        System.out.println(box.toString());
        /*
            Class : Rectangle
            return type : String
            method name : toString
            types of the arguments : no arguments
         */
       
        /*
        Computing the smallest rectangle that contains two given rectangles.
        */
        Rectangle box1 = new Rectangle(5, 5, 20, 30);
        Rectangle box2 = new Rectangle(20, 30, 20, 30);
        System.out.println(box1.union(box2));
        /*
            Class : Rectangle
            return type : Rectangle
            method name : union
            types of the arguments : Rectangle
         */
     
        /*
        Returning a random floating-point number.
        */
        Random rNumber = new Random();
        System.out.println(rNumber.nextFloat());

        /*
            Class : Random
            return type : float
            method name : nextFloat
            types of the arguments : no arguments 
         */
    }

}
