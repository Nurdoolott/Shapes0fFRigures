import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select a shape type:");
            System.out.println("1. Rectangle");
            System.out.println("2. Circle");
            System.out.println("3. Triangle");
            System.out.println("4. Square");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Goodbye!");
                break;
            }

            Shape shape = null;

            switch (choice) {
                case 1:
                    // Prompt for dimensions and create a Rectangle object
                    System.out.println("Enter width:");
                    double width = scanner.nextDouble();
                    System.out.println("Enter height:");
                    double height = scanner.nextDouble();
                    shape = new Rectangle(width, height);
                    break;
                case 2:
                    // Prompt for dimensions and create a Circle object
                    System.out.println("Enter radius:");
                    double radius = scanner.nextDouble();
                    shape = new Circle(radius);
                    break;
                case 3:
                    // Prompt for dimensions and create a Triangle object
                    System.out.println("Enter side1:");
                    double side1 = scanner.nextDouble();
                    System.out.println("Enter side2:");
                    double side2 = scanner.nextDouble();
                    System.out.println("Enter side3:");
                    double side3 = scanner.nextDouble();
                    shape = new Triangle(side1, side2, side3);
                    break;
                case 4:
                    // Prompt for side length and create a Square object
                    System.out.println("Enter side length:");
                    double sideLength = scanner.nextDouble();
                    shape = new Square(sideLength);
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    continue;
            }

            if (shape != null) {
                System.out.println("Area: " + shape.getArea());
                System.out.println("Perimeter: " + shape.getPerimeter());
            }
        }

        scanner.close();
    }
}
