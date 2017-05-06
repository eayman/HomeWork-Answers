package Chapter01;


/*
R1.13 Write an algorithm to settle the following question: A bank account starts out with
$10,000. Interest is compounded monthly at 6 percent per year (0.5 percent per
month). Every month, $500 is withdrawn to meet college expenses. After how many
years is the account depleted?

Answer : 

Step 1 Determine the inputs and outputs .
The inputs are balance, monthly interest and monthly withdraw.
The outputs the number of years that required for depleted account.

Step 2 Break down the problem into smaller tasks.
For each month, we need to know the balance after increase and decrease monthly, the increase is monthly interest is 0.5 % the decrease monthly withdraw is 500, after how many years and months the account depleted.

Step 3 Describe each subtask in pseudocode. Initial balance = 10000 .
Repeat the following steps:
Balance after each month = ( balance * 1.005 ) – 500 .
If balance < 500

Stop you cannot withdraw.

Step 4 Test pseudocode by working a problem.
Initial balance = 10000 $.
Balance after first month = ( 10000 * 1.005 ) – 500 = 9550 .
Balance after second month = (9550 * 1.005 ) – 500 = 9079.75
Balance after third month = (9097.75 * 1.005 ) – 500 = 8643.23875 .
.
.
.
Balance after twenty-one months =
(559.3980531942129 * 1.005 ) – 500 = 62.19504346018391

The balance will depleted after twenty one month that’s mean after 1.75 years the account depleted.
 */
public class R1_13 {

    double balance = 10000;
    double years;
    int months = 0;

    public void getYears() {

        for (; balance >= 500;) {

            balance = balance * 1.005;

            balance = balance - 500;

            months++;
        }

        years = months / 12.0;

        System.out.println("The balance will depleted after " + months + " month");
        System.out.println("that’s mean after " + years + " years the account depleted.");
    }

}
