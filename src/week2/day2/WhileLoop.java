package week2.day2;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        String userName = "Vadym";
        String password = "Pass";

        Scanner scanner = new Scanner(System.in);

        String enterUserName = "";
        String enterUserPass = "";

        while(!userName.equals(enterUserName) || !enterUserPass.equals(enterUserPass)) {
            System.out.println("Enter user name");
            enterUserName = scanner.nextLine();
            System.out.println("Enter user password");
            enterUserPass = scanner.nextLine();

        }

        if(userName.equals(enterUserName) && password.equals(enterUserPass)) {
            System.out.println("You are log in");
        } else {
            System.out.println("Wrong pass or log");
        }
    }
}
