import java.util.Scanner;

public class ChallengeSimpleBank {
    public static void main(String[] args) {
        String greenColor = "\u001B[32m";
        String resetColor = "\u001B[0m";
        Scanner reader = new Scanner(System.in);
        String menuLine = "*".repeat(50);
        boolean exit = true;
        int chooseOption;

        String name = "Tiago Barbosa";
        String typeAccount = "Current";
        double balance = 3500.00;

        initialDataClient(menuLine, name, typeAccount, balance, greenColor, resetColor);


        while (exit) {
            double value;
            menu(menuLine);

            System.out.print("Choose an option from the menu: ");
            chooseOption = reader.nextInt();

            if (chooseOption == 4) {
                exit = false;
            } else if (chooseOption == 1) {
                System.out.printf("You current balance is: %s%.2f%s%n%n", greenColor,
                        balance, resetColor);
            } else if (chooseOption == 2) {
                System.out.print("Enter a value for deposit: ");
                value = reader.nextDouble();
                balance += value;
                System.out.printf("Your new balance after deposit is: %s%" +
                        ".2f%s%n%n", greenColor, balance, resetColor);
            } else if (chooseOption == 3) {
                System.out.print("Enter a value to transfer: ");
                value = reader.nextDouble();

                if (value > balance) {
                    System.out.println("You don't have sufficient balance for" +
                            " transfer\n");
                } else {
                    balance -= value;
                    System.out.printf("Your new balance after transfer is: " +
                            "%s%" +
                            ".2f%s%n%n", greenColor, balance, resetColor);
                }
            } else {
                System.out.println("Wrong option.\n");
            }
        }
    }

    private static void menu(String menuLine) {
        System.out.printf("%s%n", menuLine);
        System.out.println("1 - Check balance");
        System.out.println("2 - Deposit values");
        System.out.println("3 - Transfer values");
        System.out.println("4 - Exit");
        System.out.printf("%s%n%n", menuLine);
    }

    private static void initialDataClient(String menuLine, String name,
                                          String typeAccount, double balance,
                                          String color, String resetColor) {
        System.out.println(menuLine);
        System.out.printf("Initial data of client: %n");
        System.out.printf("Name:            %s%s%s%n", color, name, resetColor);
        System.out.printf("Type Account:    %s%s%s%n", color, typeAccount, resetColor);
        System.out.printf("Initial Balance: %s%.2f%s%n", color, balance, resetColor);
        System.out.printf("%s%n%n", menuLine);
    }
}
