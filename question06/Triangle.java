/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question06;

/**
 *
 * @author Rohit Reddy Chandupatla
 */
public class Triangle extends GeometricObject {

    private double side1;
    private double side2;
    private double side3;

    public Triangle(String color, boolean isFilled, float side1, float side2, float side3) {
        super(color, isFilled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "area = " + getArea() +
                ", perimeter = " + getPerimeter() +
                ", color = " + getColor() +
                ", isFilled = " + isFilled() +
                ", side1 =" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}

