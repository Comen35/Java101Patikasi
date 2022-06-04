import java.util.Scanner;

public class ChineZodiacCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int birthdayYear;

        System.out.println("\t\t\t************************************");
        System.out.println("\t\t\t*                                  *");
        System.out.println("\t\t\t*   Enter your birthday year :     *");
        System.out.println("\t\t\t*                                  *");
        System.out.println("\t\t\t************************************");
        System.out.print("\t\t\t");
        System.out.println(" ");
        System.out.print("\t\t\t");
        birthdayYear = input.nextInt();
        int zodiacIndex = birthdayYear % 12;

        switch (zodiacIndex) {
            case 0 -> System.out.println("\t\t\tMaymun");
            case 1 -> System.out.println("\t\t\tHoroz");
            case 2 -> System.out.println("\t\t\tKöpek");
            case 3 -> System.out.println("\t\t\tDomuz");
            case 4 -> System.out.println("\t\t\tFare");
            case 5 -> System.out.println("\t\t\tÖküz");
            case 6 -> System.out.println("\t\t\tKaplan");
            case 7 -> System.out.println("\t\t\tTavşan");
            case 8 -> System.out.println("\t\t\tEjderha");
            case 9 -> System.out.println("\t\t\tYılan");
            case 10 -> System.out.println("\t\t\tAt");
            case 11 -> System.out.println("\t\t\tKoyun");
            default -> System.out.println("\t\t\tinvalid value");
        }


    }
}
