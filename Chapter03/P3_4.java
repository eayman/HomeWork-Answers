package Chapter03;

/**
 * P3.4 A microwave control panel has four buttons: one for increasing the time
 * by 30 seconds, one for switching between power levels 1 and 2, a reset
 * button, and a start button. Implement a class that simulates the microwave,
 * with a method for each button. The method for the start button should print a
 * message : “Cooking for ... seconds at level ...”.
 */
public class P3_4 {

    int time = 0;
    int switch_b = 1;

    public void start() {
        System.out.println("Cooking for " + time + " seconds\n" + "at level " + switch_b);
    }

    public void increas() {
        time = time + 30;
    }

    public void switching() {
        if (switch_b == 1) {
            switch_b = 2;
        } else {
            switch_b = 1;
        }
    }

    public void reset() {
        time = 0;
    }

}
