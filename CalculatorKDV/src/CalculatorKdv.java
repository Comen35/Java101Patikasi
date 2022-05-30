import java.util.Scanner;

class CalculatorKdv{
    static final int KDV_RATIO = 18;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float price, priceWithKdv = 0, amountOfKdv;

        System.out.print("Enter price please : ");
        price = input.nextFloat();

        amountOfKdv = ( price * KDV_RATIO ) / 100;
        priceWithKdv = price + amountOfKdv;

        System.out.println("Price with KDV : " + priceWithKdv);
        System.out.println("Amount of KDV : " + amountOfKdv);

        input.close();
        
    }
}
