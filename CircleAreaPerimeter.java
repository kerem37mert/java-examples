import java.util.Scanner;

public class CircleAreaPerimeter {
    public static void main(String[] args) {

        double radius, area, perimeter;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter circle radius: ");
        radius = input.nextDouble();

        area = Math.PI * radius * radius;
        perimeter = 2 * Math.PI * radius;

        System.out.println("Area: " + area + " perimeter: " + perimeter);
    }
}