import java.util.Scanner;

public class Metro {

    static Scanner scanner = new Scanner(System.in);
    static double balance = 0.0;

    public static void main(String[] args) {
        int choose = 0;

        do {
            System.out.println("1- Show card balance");
            System.out.println("2- Add money to card ");
            System.out.println("3- Take the subway");
            System.out.println("4- Log out");

            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    showBalance();
                    break;
                case 2:
                    addMoney();
                    break;
                case 3:
                    takeMetro();
                    break;
                case 4:
                    logOut();
                    break;
                default:
                    System.out.println("Wrong choice. Try again!");
            }

        } while (choose != 4);
    }

    private static void logOut() {
        System.exit(0);
    }

    private static void takeMetro() {
        System.out.println("Your ticket: \t\n1- Discounted ticket  \t\n2- Full price ticket ");
        int whichTicket = scanner.nextInt();

        if (whichTicket == 1) {
            System.out.println("Discounted ticket! Welcome to Metro!");
            if (balance < 3.50) {
                System.out.println("Insufficient balance, please add money your card.!");
            } else {
                balance -= 3.50;
                System.out.println(showBalance());
            }
        } else if (whichTicket == 2) {
            if (balance < 5.20) {
                System.out.println("Insufficient balance, please add money your card.!");
            } else {
                System.out.println("Full price ticket! Welcome to Metro!");
                balance -= 5.20;
            }
            System.out.println(showBalance());
        } else {
            System.out.println("Wrong choice. Try again!");
            takeMetro();
        }
    }

    private static void addMoney() {
        System.out.println("Enter the amount you want to add: ");
        balance += scanner.nextDouble();
        showBalance();
    }

    private static String showBalance() {
        String balanceStr = "Your balance : " + balance + " TL.";
        System.out.println(balanceStr);
        return balanceStr;
    }

}
