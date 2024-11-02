package Ui;

import Purchase.PurchaseHelper;
import User.Admin;
import User.Student;

import java.util.Scanner;

public class AdminPanel {
    Scanner sc = new Scanner(System.in);

    public static void display (Scanner sc, Admin admin)
    {
        while (true) {
            System.out.println("1. View Request");
            System.out.println("2. Update Menu");
            System.out.println("3. View Purchase History");
            System.out.println("4. Update Price");
            System.out.println("5. Go Back to Main Menu");

            int choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    return;
                default:
                    break;
            }
        }
    }
}
