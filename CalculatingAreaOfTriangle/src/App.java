import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        float edge1, edge2, edge3, u, areaOfTriangle;

        System.out.print("Enter Edge 1: ");
        edge1 = input.nextFloat();

        System.out.print("Enter Edge 2: ");
        edge2 = input.nextFloat();

        System.out.print("Enter Edge 3: ");
        edge3 = input.nextFloat();

        u = (edge1 + edge2 + edge3) / 2;

        areaOfTriangle = (float) Math.pow((u * (u - edge1) * (u - edge2) * (u - edge3)), 0.5);

        System.out.print("Area of the triangle: " + areaOfTriangle);

        input.close();

    }
}
