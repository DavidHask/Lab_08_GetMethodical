public class CtoFTableDisplay {
    public static void main(String[] args) {

        double tempF = CtoF(32);

        System.out.println(tempF);

        System.out.println("Temp C     Temp F");

        for (double tempC = -100; tempC <= 100; tempC++) {

            tempF = CtoF(tempC);

            //System.out.println(tempC + "      " + tempF);

            System.out.printf("%.0f     %.1f\n", tempC, tempF);

        }


    }

    public static double CtoF(double Celsius) {

        double fahrenheit = ( Celsius * ((double) 9 / 5) + 32);

        return fahrenheit;


    }

}
