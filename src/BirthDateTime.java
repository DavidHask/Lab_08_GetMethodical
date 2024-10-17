import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int daysInMonth = 0;
        int birthYear = SafeInputs.getRangedInt(in, "What year were you born in?", 1950, 2015);
        int birthMonth = SafeInputs.getRangedInt(in, "What month were you born in?", 1, 12);

        switch (birthMonth) {
            case 1, 3, 5, 7, 8, 10, 12:
                daysInMonth = 31;
                break;
            case 4, 6, 9, 11:
                daysInMonth = 30;
                break;
            case 2:
                daysInMonth = 29;
                break;
        }

        int birthDay = SafeInputs.getRangedInt(in, "What day were you born on?", 1, daysInMonth);
        int birthHour = SafeInputs.getRangedInt(in, "What hour were you born on?", 1, 24);
        int birthMinute = SafeInputs.getRangedInt(in, "What minute were you born in?", 1, 59);

        System.out.println("You were born in " + birthYear + ", in month " + birthMonth + " on the "
                + birthDay + " at " + birthHour + ":" + birthMinute);

    }
}
