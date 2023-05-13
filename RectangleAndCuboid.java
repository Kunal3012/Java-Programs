import java.util.Scanner;

public class RectangleAndCuboid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter the length of the rectangle: ");
        double length = input.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = input.nextDouble();

        System.out.print("Enter the height of the cuboid: ");
        double height = input.nextDouble();

        // Calculate area of rectangle
        double area = length * breadth;
        System.out.println("Area of rectangle: " + area);

        // Calculate perimeter of rectangle
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of rectangle: " + perimeter);

        // Calculate volume of cuboid
        double volume = length * breadth * height;
        System.out.println("Volume of cuboid: " + volume);

        input.close();
    }
}