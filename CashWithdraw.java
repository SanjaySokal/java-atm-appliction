import java.util.Scanner;

import javax.xml.xpath.XPath;

public class CashWithdraw {
    public void Withdraw() {
        System.out.println("Enter amount you want to withdraw");

        Scanner sc = new Scanner(System.in);
        int choice = 0;

        try {
            choice = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Please Enter a Number (Machine crashed)");
        }

        if (choice != 0) {
            System.out.println("Amount " + choice + " is withdrawal successfully!");
        }
    }
}
