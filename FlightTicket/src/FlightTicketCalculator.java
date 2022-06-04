import java.util.Scanner;

public class FlightTicketCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int distance, age, tripType;
        double
                ticketPrice,
                ageDiscount,
                discountedTicketPrice,
                totalTicketPrice, ageDiscountRate = 0,
                tripTypeDiscount,
                tripTypeDiscountRatio = 0;

        System.out.println("\t\t\t************************************");
        System.out.println("\t\t\t*                                  *");
        System.out.println("\t\t\t* Enter distance (as KM) please :  *");
        System.out.println("\t\t\t*                                  *");
        System.out.println("\t\t\t************************************");
        System.out.print("\t\t\t");
        distance = input.nextInt();

        System.out.println("\t\t\t************************************");
        System.out.println("\t\t\t*                                  *");
        System.out.println("\t\t\t*       Enter age please :         *");
        System.out.println("\t\t\t*                                  *");
        System.out.println("\t\t\t************************************");
        System.out.print("\t\t\t");
        age = input.nextInt();

        System.out.println("\t\t\t************************************");
        System.out.println("\t\t\t*                                  *");
        System.out.println("\t\t\t*     Enter travel type please     *");
        System.out.println("\t\t\t*     for One way enter 1          *");
        System.out.println("\t\t\t*     for Round trip enter 2       *");
        System.out.println("\t\t\t************************************");
        System.out.print("\t\t\t");
        tripType = input.nextInt();

        if(distance < 0 || age < 0  || tripType < 1 || tripType > 2) {
            System.out.println("\t\t\tEnter valid values please!!");
        }
        else {
            if(tripType == 2){
                if(age < 12){
                    ageDiscountRate = 0.50;
                }
                else if(age < 24){
                    ageDiscountRate = 0.10;
                }
                else if(age > 65){
                    ageDiscountRate = 0.30;
                }
                tripTypeDiscountRatio = 0.20;
            }

            ticketPrice = distance * 0.10;
            ageDiscount = ticketPrice * ageDiscountRate;
            discountedTicketPrice = ticketPrice - ageDiscount;
            tripTypeDiscount = discountedTicketPrice * tripTypeDiscountRatio;
            totalTicketPrice = (discountedTicketPrice - tripTypeDiscount) * tripType;

            System.out.println("\t\t\tTotal ticket price: " + totalTicketPrice + " TL");
        }

    }
}
