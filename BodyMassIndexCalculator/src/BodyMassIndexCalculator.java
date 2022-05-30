import java.util.Scanner;

public class BodyMassIndexCalculator {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        int weight;
        double height;
        double bodyMassIndex;

        System.out.print("Enter your height(as meter) plese: ");
        height = input.nextDouble();

        System.out.print("Enter your weight please: ");
        weight = input.nextInt();

        bodyMassIndex = weight / (height * height);

        System.out.println("Body Mass Index: " + bodyMassIndex);

        input.close();
    }
}
