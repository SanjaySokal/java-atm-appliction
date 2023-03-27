import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To ATM Machine");
        System.out.println("Please Enter What You Want?");
        System.out.println("Press 0 to exit anytime.");
        System.out.println("1) View Balance             2) Cash Withdrawal");
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        try {
            choice = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Please Enter a Number (Machine crashed)");
        }

        if (choice == 0) {
            System.out.println("Thankyou for usuing ATM Machine!");
        } else {
            AccountDetails accountDetails = new AccountDetails();
            if (choice == 1) {
                accountDetails.Details("balance");
            } else if (choice == 2) {
                accountDetails.Details("cash");
            }
        }
    }
}