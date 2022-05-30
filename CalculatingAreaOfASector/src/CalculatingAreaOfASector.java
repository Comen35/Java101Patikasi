import java.util.Scanner;

public class CalculatingAreaOfASector {
    static private double PI = 3.14;

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int radius;
        int degreeOfCentralAngel;
        double areaOfSector;

        System.out.print("Enter radius : ");
        radius = input.nextInt();

        System.out.print("Enter degree of central angel : ");
        degreeOfCentralAngel = input.nextInt();

        areaOfSector = (PI * (radius * radius) * degreeOfCentralAngel) / 360;

        System.out.println("Area of the sector : " + areaOfSector);

        input.close();
    }
}
