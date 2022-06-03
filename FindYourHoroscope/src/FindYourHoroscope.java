import java.util.Objects;
import java.util.Scanner;

public class FindYourHoroscope {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dayOfYourBirthday;
        String monthOfYourBirthday;
        String result = "Enter valid values please!!!";

        System.out.print("Enter day of your birthday(Enter numeric value): ");
        dayOfYourBirthday = input.nextInt();

        input.nextLine();
        System.out.print("Enter month of your birthday : ");
        monthOfYourBirthday = input.nextLine().toLowerCase();

        if(monthOfYourBirthday.equals("April".toLowerCase()) & dayOfYourBirthday < 21 ){
            result = "Aries";
        }
        if(monthOfYourBirthday.equals("May".toLowerCase()) & dayOfYourBirthday < 22){
            result = "Taurus";
        }
        if(monthOfYourBirthday.equals("June".toLowerCase()) & dayOfYourBirthday < 23){
            result = "Gemini";
        }
        if(monthOfYourBirthday.equals("July".toLowerCase()) & dayOfYourBirthday < 23){
            result = "Cancer";
        }
        if(monthOfYourBirthday.equals("August".toLowerCase()) & dayOfYourBirthday < 23){
            result = "Leo";
        }
        if(monthOfYourBirthday.equals("September".toLowerCase()) & dayOfYourBirthday < 23){
            result = "Virgo";
        }
        if(monthOfYourBirthday.equals("October".toLowerCase()) & dayOfYourBirthday < 23){
            result = "Libra";
        }
        if(monthOfYourBirthday.equals("November".toLowerCase()) & dayOfYourBirthday < 22){
            result = "Scorpio";
        }
        if(monthOfYourBirthday.equals("December".toLowerCase()) & dayOfYourBirthday < 22){
            result = "Sagittarius";
        }
        if(monthOfYourBirthday.equals("January".toLowerCase()) & dayOfYourBirthday < 22){
            result = "Capricorn";
        }
        if(monthOfYourBirthday.equals("February".toLowerCase()) & dayOfYourBirthday < 20){
            result = "Aquarius";
        }
        if(monthOfYourBirthday.equals("March".toLowerCase()) & dayOfYourBirthday < 21){
            result = "Pisces";
        }
        System.out.println(result);
    }
}
