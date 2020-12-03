package OFFICE_HOURS.Practice_10_28_2020_StringAndLoop;

import java.util.Scanner;

/*
Credential:
cybertek
cybertek12345
 */
public class Credential {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username");
        String UserName = scan.next();

        System.out.println("Enter your password");
        String Password = scan.next();

        if (UserName.equals("cybertek") && Password.equals("cybertek12345")) {
            // if the credentials are valid, user will be able to login
            System.out.println("Logged In");
        } else { // condition for invalid username and password
            for (int i = 1; i <= 3; i++) {  // i:1,2,3
                if (i == 3) {
                    System.err.println("Your account is locked!!!");
                    System.exit(0);
                }
                System.out.println("Invalid Username or password, please re enter");
                System.out.println("Enter your username");
                UserName = scan.next();
                System.out.println("Enter your password");
                Password = scan.next();

                if (UserName.equals("cybertek") && Password.equals("cybertek12345")) {
                    System.out.println("Logged In");
                    break;
                }
            }
        }
        System.out.println("Hello world");
    }
}