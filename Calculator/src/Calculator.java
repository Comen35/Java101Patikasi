import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int number1, number2;
        float result;
        String choosingOperation;

        System.out.println("* * * * * * * * * * * * * * * * * * * * *");
        System.out.println("*                                       *");
        System.out.println("*               CALCULATOR              *");
        System.out.println("*                                       *");
        System.out.println("* * * * * * * * * * * * * * * * * * * * *");
        System.out.println("*   1-) Addition       (Enter a)        *");
        System.out.println("*                                       *");
        System.out.println("*   2-) Extraction     (Enter e)        *");
        System.out.println("*                                       *");
        System.out.println("*   3-) Multiplication (Enter m)        *");
        System.out.println("*                                       *");
        System.out.println("*   4-) Division       (Enter d)        *");
        System.out.println("*                                       *");
        System.out.println("* * * * * * * * * * * * * * * * * * * * *");

        System.out.print("Enter an integer please : ");
        number1 = input.nextInt();

        System.out.print("Enter an integer please : ");
        number2 = input.nextInt();

        input.nextLine();

        System.out.print("Enter your operation please : ");
        choosingOperation = input.nextLine();
        System.out.print("");

        switch (choosingOperation) {
            case "a":
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;
            case "e":
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;
            case "m":
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);

                break;
            case "d":
                if (number2 != 0) {
                    result = number1 / (float) number2;
                    System.out.println(number1 + " / " + number2 + " = " + result);

                } else {
                    System.out.println("A number can't divide to zero!");
                }
                break;
        }
        input.close();
    }
}
