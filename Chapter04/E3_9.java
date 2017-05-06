package Chapter03;

/*
E3.9
 Add a method printReceipt to the CashRegister class.
The method should print the prices of all purchased items and the total amount due.
Hint: You will need to form a string of all prices.
Use the concat method of the String class to add additional items to that string. 
To turn a price into a string, use the call String.valueOf(price).
 */
public class E3_9 {

    double price;
    String purchased;
    double total;
    String list = "";

    public void getInfo(String purch, double p) {
        purchased = purch;
        price = p;
        total = total + price;
        list = list + "\n" + purchased.concat(String.valueOf(price));
    }

    public void printReceipt() {
        System.out.println("Purchased Items:");
        System.out.println(list);
        System.out.println("The total amount: " + total);
    }
}
