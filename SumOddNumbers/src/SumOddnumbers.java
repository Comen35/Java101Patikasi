import java.util.Scanner;

public class SumOddnumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sumOddNumbers = 0, number = 0;

        System.out.println("\t\t\t************************************");
        System.out.println("\t\t\t*                                  *");
        System.out.println("\t\t\t*       SUM OF ODD NUMBERS         *");
        System.out.println("\t\t\t* Enter even number for exit   *");
        System.out.println("\t\t\t*                                  *");
        System.out.println("\t\t\t************************************");

        while(number % 2 == 0 ){
            System.out.print("\t\t\t");
            number = input.nextInt();

            if(number % 4 == 0 ){
                sumOddNumbers += number;
            }
        }
        System.out.print("\t\t\t");
        System.out.println("Sum of the odd numbers : " + sumOddNumbers);
    }
}
