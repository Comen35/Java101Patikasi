import java.util.Scanner;

public class SuggestionActivityAccordingWeather {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temperature;
        String result = "";

        System.out.print("Enter temperrature please :");
        temperature = input.nextInt();

        if(temperature < 5){
            result = "You can go skiing";
        }
        if(temperature > 5 & temperature < 15){
            result += " You can go cinema";
        }
        if(temperature >10 & temperature < 25){
            result += " You can go picnic";
        }
        if(temperature > 25){
            result += " You can go swimming.";
        }

        System.out.println(result);

    }


}
