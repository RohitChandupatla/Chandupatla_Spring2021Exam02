/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question07;

/**
 *
 * @author 
 */
public class Bodyworks {
   
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("cost after discount: " + Bodyworks.BODYWASH.costAfterDiscount());
        for (Bodyworks m : Bodyworks.values()) {
            System.out.println(m + "\ncost is: " + m.getCost() + "\nDuration: " + m.getDuration());
        }
    }

}
