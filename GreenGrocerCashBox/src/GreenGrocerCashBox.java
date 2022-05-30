import java.util.Scanner;

public class GreenGrocerCashBox {
    static private double PEAR_PRICE = 2.14;
    static private double APPLE_PRICE = 3.67;
    static private double TOMATO_PRICE = 1.11;
    static private double BANANA_PRICE = 0.95;
    static private double AUBERGINE_PRICE = 5.00;

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int pearAmount, appleAmount, tomatoAmount, bananaAmount, aubergineAmount;

        System.out.print("Amount of pear: ");
        pearAmount = input.nextInt();

        System.out.print("Amount of apple: ");
        appleAmount = input.nextInt();

        System.out.print("Amount of tomato: ");
        tomatoAmount = input.nextInt();

        System.out.print("Amount of banana: ");
        bananaAmount = input.nextInt();

        System.out.print("Amount of aubergine: ");
        aubergineAmount = input.nextInt();

        double totalPrice = (pearAmount * PEAR_PRICE) + (appleAmount * APPLE_PRICE) + (tomatoAmount * TOMATO_PRICE)
                + (bananaAmount * BANANA_PRICE) + (aubergineAmount * AUBERGINE_PRICE);

        System.out.print("Total price : " + totalPrice);

        input.close();

    }
}
