import java.util.Scanner;

public class CheckOut {
    public static void main(String [] args) {

        Scanner in = new Scanner(System.in);

        double itemPrice = 0.0;
        double totalPrice = 0.0;
        boolean done = false;


        do {

            itemPrice = SafeInputs.getRangedDouble(in, "How much is the item?", 0.50, 10.00);
            totalPrice = totalPrice + itemPrice;
            done = SafeInputs.getYNConfirm(in, "Are you done?");

        } while (!done);

        System.out.printf("The total price of the items is $%.2f", totalPrice);

    }
}
