import java.util.Scanner;

public class Taximeter {
    static double minimumPrice = 20;
    static double openingPrice = 10;
    static double pricePerKilometer = 2.20;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalPrice;
        int distance;

        System.out.print("Enter distance please: ");
        distance = input.nextInt();

        totalPrice = openingPrice + (distance * pricePerKilometer);
        double result = totalPrice < 20 ? minimumPrice : totalPrice;

        System.out.println("Total Price : " + result);

        input.close();
        
    }
}
