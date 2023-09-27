public class Main {
    public static void main(String[] args) {
        System.out.println("Celsius to Fahrenheit:");

        double temperature01 = 14.5;
        double temperature02 = 28.7;

        double conversion = (temperature01 * 1.8) + 32;
        double conversion02 = (temperature02 * 1.8) + 32;

        System.out.printf("Temperature %.2f in Celsius for Fahrenheit: %.2f%n",
                temperature01, conversion);

        System.out.printf("Temperature %.2f in Celsius for Fahrenheit: %.2f%n",
                temperature02, conversion02);

        String corVerde = "\u001B[32m";

        System.out.printf("%sTestando cor diferente",corVerde);
    }
}