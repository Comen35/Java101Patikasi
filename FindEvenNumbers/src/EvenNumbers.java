import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, sum = 0, count = 0;
        double average;

        System.out.print("Enter an integer please : ");
        number = input.nextInt();

        System.out.print("Numbers : ");
        for(int i = 1; i <= number; i ++){
            if( i % 3 == 0 && i % 4 == 0){
                System.out.print(i + " ");
                sum += i;
                count ++;
            }
        }

        average = (double)sum / count;
        System.out.println("");
        System.out.println("Average = " + average);
    }
}
