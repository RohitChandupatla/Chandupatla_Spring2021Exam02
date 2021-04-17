/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question04;

/**
 *
 * @author Rohit Reddy Chandupatla
 */
public class Iphone {
      private String color;
    private long imeiNumber;

    public Iphone(String color, long imeiNumber) {
        this.color = color;
        this.imeiNumber = imeiNumber;
    }

    public void call() {
        System.out.println( "Calling from Iphone");
    }

    public static void message() {
        System.out.println("Messaging from Iphone");
    }

    public long getImeiNumber() {
        return imeiNumber;
    }

    public void setImeiNumber(long imeiNumber) {
        this.imeiNumber = imeiNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}