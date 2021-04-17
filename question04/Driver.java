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
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Iphone iphoneX = new IphoneX("space gray", 02);
        IphoneX iphoneX2 = new IphoneX("silver", 03);
        Iphone iphone = new Iphone("red", 01);

        iphoneX.message();
        iphoneX2.message();
        iphone.message();

        iphone.call();
        iphoneX.call();

        Iphone12 iphone12 = new Iphone12("green", 04);
        System.out.println("Iphone 12 has " + iphone12.getColor() + " color");
        System.out.println("Iphone 12 is 5G: " + iphone12.isFiveG());
        iphone12.call();
    }
}
