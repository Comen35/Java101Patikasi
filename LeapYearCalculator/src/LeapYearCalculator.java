import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isLeapYear = true;

        System.out.print("Enter year please : ");
        int year = input.nextInt();

        if( year % 4 != 0){
            isLeapYear = false;
        }
        else{
            if( year % 100 == 0 && year % 400 != 0){
                isLeapYear = false;
            }
        }
        if(isLeapYear){
            System.out.println(year + " is a leap year.");
        }
        else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
