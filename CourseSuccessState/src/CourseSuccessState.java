import java.util.Scanner;

public class CourseSuccessState {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int math, physic, chemistry, turkish, music;
        double averageOfScores;

        System.out.print("Enter Math score: ");
        math = input.nextInt();

        if (!(math >= 0 && math <= 100)) {
            math = 0;
        }

        System.out.print("Enter Physic score: ");
        physic = input.nextInt();

        if (!(physic >= 0 && physic <= 100)) {
            physic = 0;
        }

        System.out.print("Enter Chemistry score: ");
        chemistry = input.nextInt();

        if (!(chemistry >= 0 && chemistry <= 100)) {
            chemistry = 0;
        }

        System.out.print("Enter Turkish score: ");
        turkish = input.nextInt();

        if (!(turkish >= 0 && turkish <= 100)) {
            turkish = 0;
        }

        System.out.print("Enter Music score: ");
        music = input.nextInt();

        if (!(music >= 0 && music <= 100)) {
            music = 0;
        }

        averageOfScores = (math + physic + chemistry + turkish + music) / 5;

        System.out.println("Average of scores = " + averageOfScores);

        if (averageOfScores >= 55) {
            System.out.println("Congratulations!");
        } else {
            System.out.println("Sorry! You have study much more.");
        }
        input.close();
    }
}
