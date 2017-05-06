
package Chapter02;
/*
•• E2.9 In the Java library, a color is specified by its red, green, and blue components between 0 and 255 
        (see Table 4 on page 66). 
        Write a program BrighterDemo that constructs a Color object with red, green, and blue values of 50, 100, and 150. 
        Then apply the brighter method of the Color class and print the red, green, and blue values of the resulting color.
        (You won’t actually see the color—see Exercise E2.10 on how to display the color.)

•• Graphics E2.10 Repeat Exercise E2.9, but place your code into the following class. Then the color
will be displayed.
*/

import java.awt.Color;
import javax.swing.JFrame;

public class R2_10 {

    public static void main(String[] args) {

        // Constructs a Color object 
        Color newColor = new Color(50, 100, 150);

        /**
         * E2.9 
         * Print the red, green, and blue values
         * of the newColor after apply the brighter method .
         */
        
        System.out.println(newColor.brighter());

        // E2.10 
        JFrame frame = new JFrame();
        frame.setSize(200, 200);

        // Set newColor after apply the brighter method in myColor Object .
        Color myColor = newColor.brighter();

        // Show myColor in frame background  
        frame.getContentPane().setBackground(myColor);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
    
    
    
