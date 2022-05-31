import java.util.Scanner;

public class UserLogin {
    static private String USER_NAME = "JohnDOE";
    static private String PASSWORD = "12345";

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String userName, password;
        boolean isLoggedIn;

        System.out.println("* * * * * * * * * * * * * * * * * * * * *");
        System.out.println("*                                       *");
        System.out.println("*               LOGIN SCREEN            *");
        System.out.println("*                                       *");
        System.out.println("* * * * * * * * * * * * * * * * * * * * *");

        System.out.print("User name: ");
        userName = input.nextLine();

        System.out.print("Password: ");
        password = input.nextLine();
        System.out.println("");
        System.out.println("");

        if (userName.equals(USER_NAME) && password.equals(PASSWORD)) {
            System.out.println("* * * * * * * * * * * * * * * * * * * * *");
            System.out.println("*                                       *");
            System.out.println("*               HOME PAGE               *");
            System.out.println("*                WELCOME!               *");
            System.out.println("*                                       *");
            System.out.println("* * * * * * * * * * * * * * * * * * * * *");
            isLoggedIn = true;
        } else {
            System.out.println("* * * * * * * * * * * * * * * * * * * * *");
            System.out.println("*                                       *");
            System.out.println("*          Check your username or       *");
            System.out.println("*            password please!           *");
            System.out.println("*                                       *");
            System.out.println("* * * * * * * * * * * * * * * * * * * * *");
            isLoggedIn = false;

        }

        if (isLoggedIn == false && !password.equals(PASSWORD)) {
            System.out.println("* * * * * * * * * * * * * * * * * * * * *");
            System.out.println("*                                       *");
            System.out.println("*          Would you like reset         *");
            System.out.println("*            your password?             *");
            System.out.println("*                                       *");
            System.out.println("* * * * * * * * * * * * * * * * * * * * *");

            System.out.println("Enter y/n");
            String choosing = input.nextLine();

            if (choosing.toLowerCase().equals("y")) {
                System.out.println("Enter your new password please : ");
                String newPassword = input.nextLine();

                if (!newPassword.equals(password) && !newPassword.equals(PASSWORD)) {
                    System.out.println("* * * * * * * * * * * * * * * * * * * * *");
                    System.out.println("*                                       *");
                    System.out.println("*          New password created!        *");
                    System.out.println("*                                       *");
                    System.out.println("* * * * * * * * * * * * * * * * * * * * *");
                } else {
                    System.out.println("* * * * * * * * * * * * * * * * * * * * *");
                    System.out.println("*                                       *");
                    System.out.println("*       Passsword couldn't create!      *");
                    System.out.println("*       Enter a new password please.    *");
                    System.out.println("*                                       *");
                    System.out.println("* * * * * * * * * * * * * * * * * * * * *");
                }
            }

        }
        input.close();

    }
}
