import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isLeapYaer = true;

        System.out.print("Enter year please : ");
        int year = input.nextInt();

        if( year % 4 != 0){
            isLeapYaer = false;
        }
        else{
            if( year % 100 == 0 && year % 400 != 0){
                isLeapYaer = false;
            }
        }
        if(isLeapYaer){
            System.out.println(year + " is a leap year.");
        }
        else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
