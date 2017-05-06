package Chapter02;

// R2.6 What is wrong with the following sequence of statements?
public class R2_6 {

    public static void main(String[] args) {

        int mystery = 1;
        mystery = mystery + 1;
        int mystery = 1 - 2 * mystery;

        /* ERROR
         int mystery = 1 - 2 * mystery;
         TO CORRECT
         mystery  = 1 - 2 * mystery;
         */
    }
}
