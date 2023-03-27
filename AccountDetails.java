import java.util.Scanner;

public class AccountDetails {
    public void Details(String data) {
        System.out.println("Choose from these account number");
        System.out.println("1) 123     2) 456");
        System.out.println("1) 789     2) 012");
        System.out.println("Enter your account number");
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        try {
            choice = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("You have choosen wrong Account Number. Bye!");
        }

        if (choice == 0) {
            System.out.println("Thankyou for usuing ATM Machine!");
        } else {
            if (data == "balance") {
                int bal = (int) (Math.random() * 100000);
                System.out.println("Your account balance is " + bal);
            } else if (data == "cash") {
                CashWithdraw cashWithdraw = new CashWithdraw();
                cashWithdraw.Withdraw();
            }
        }
        System.out.println("Thankyou for usuing ATM Machine!");
    }
}
