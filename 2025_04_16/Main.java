import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Square square = new Square();
        ShapeFactory shapeFactory = new ShapeFactory(triangle,square);
        System.out.println("Welcome!\nWhat shape do you want to draw, press t for triangle or s for square.");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        shapeFactory.drawShape(choice);
    }
}