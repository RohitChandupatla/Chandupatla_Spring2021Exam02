/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question07;

import question09.AbroadTrip;
import question09.LocalTrip;

/**
 *
 * @author S542423
 */
public class TripDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Question:9 ");
        AbroadTrip abroadTrip = new AbroadTrip("Singapore", 4, 7, 300, 150, 30, 2);
        System.out.println(abroadTrip);
        LocalTrip localTrip = new LocalTrip("New York", 2, 3, 200, 70, 50);
        System.out.println(localTrip);
    }
    }
    

