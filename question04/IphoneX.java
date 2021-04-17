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
public class IphoneX extends Iphone {
        public IphoneX(String color, long imeiNumber) {
        super(color, imeiNumber);
    }

    @Override
    public void call() {
        System.out.println("Calling From IphoneX");
    }

    public static void message() {
        System.out.println("Messaging from IphoneX");
    }
}
