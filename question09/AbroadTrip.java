/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question09;

/**
 *
 * @author Rohit Reddy
 */
public class AbroadTrip Trip implements TripExpenseCalculator {

    private static final double tax = 18.0;
    private static final double discount = 0.10;
    private static final double extraLaguageCostPerKg = 200;
    private int numberOfLaguage;

    public AbroadTrip(String singapore, int i, int i0, int i1, int i2, int i3, int i4) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public AbroadTour(String placeBeingVisited, int numberOfTourists, int numberOfDays, double travelCostPerDay, double foodExpenseePerDay, double accomodationExpensePerDay, int numberOfLaguage) {
        super(placeBeingVisited, numberOfTourists, numberOfDays, travelCostPerDay, foodExpenseePerDay, accomodationExpensePerDay);
        this.numberOfLaguage = numberOfLaguage;
    } 
}

    

