import java.util.Scanner;

class CalculatorKdv{
    
    static final int KDV_RATIO = 18;
    static final int KDV_RATIO2 = 8;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float price, priceWithKdv = 0, amountOfKdv;

        System.out.print("Enter price please : ");
        price = input.nextFloat();



        amountOfKdv = ( price * (price > 1000 ? KDV_RATIO2 : KDV_RATIO)) / 100;
        priceWithKdv = price + amountOfKdv;

        System.out.println("Amount of KDV : " + amountOfKdv);
        System.out.println("Price with KDV : " + priceWithKdv);
        

        input.close();
        
    }
}
