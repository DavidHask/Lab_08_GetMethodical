import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int favInt = SafeInputs.getInt(in, "What is your favorite integer?");
        double favDouble = SafeInputs.getDouble(in, "What is your favorite double number?");

        System.out.println("Your favorite integer is " + favInt);
        System.out.println("Your favorite double number is " + favDouble);

    }
}
