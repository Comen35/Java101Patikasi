import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int mathScore, physicScore, chemistryScore, turkishScore, historyScore, musicScore;
        float averageOfScores;

        System.out.print("Enter your Math Score please : ");
        mathScore = input.nextInt();

        System.out.print("Enter your Physics Score please : ");
        physicScore = input.nextInt();

        System.out.print("Enter your Chemistry Score please : ");
        chemistryScore = input.nextInt();

        System.out.print("Enter your Turkish Score please : ");
        turkishScore = input.nextInt();

        System.out.print("Enter your History Score please : ");
        historyScore = input.nextInt();

        System.out.print("Enter your Music Score please : ");
        musicScore = input.nextInt();

        averageOfScores = (mathScore + physicScore + chemistryScore + turkishScore + historyScore + musicScore) / 6;

        String message = averageOfScores > 60 ? "Pass" : "Fail";

        System.out.println("Average of notes :  " +  averageOfScores);
        System.out.println(message);

        input.close();
    }

}
