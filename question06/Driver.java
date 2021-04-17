/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question06;
import java.util.Scanner;

/**
 *
 * @author Rohit Reddy Chandupatla
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here1

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Side 1: ");
        float side1  = scanner.nextInt();

        System.out.println("Enter side 2: ");
        float side2 = scanner.nextInt();

        System.out.println("Enter side 3: ");
        float side3 = scanner.nextInt();

        System.out.println("Enter the color");
        String color = scanner.next();

        System.out.println("Is Area filled? (True/False): ");
        boolean isFilled = scanner.nextBoolean();

        Triangle triangle = new Triangle(color, isFilled, side1, side2, side3);

        System.out.println("Area: " + triangle.getArea());
        System.out.println("Permiter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("isFilled: " + triangle.isFilled());

        System.out.println(triangle.toString());
    }
}
