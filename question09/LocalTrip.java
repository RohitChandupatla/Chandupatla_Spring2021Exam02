/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question09;

/**
 *
 * @author S542423
 */
public class LocalTrip 
    extends Trip implements TripExpenseCalculator {

    private static final double discount = 0.20;

    public LocalTrip(String placeBeingVisited, int numberOfTourists, int numberOfDays, double travelCostPerDay, double foodExpenseePerDay, double accomodationExpensePerDay) {
        super(placeBeingVisited, numberOfTourists, numberOfDays, travelCostPerDay, foodExpenseePerDay, accomodationExpensePerDay);
    }

    public LocalTrip(String new_York, int i, int i0, int i1, int i2, int i3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double foodExpenseCalculator() {
        return this.getFoodExpensePerDay() * this.getNumberOfTourists() * this.getNumberOfDays();
    }

    @Override
    public double accomodationExpenseCalculator() {
        return this.getAccomodationExpensePerDay() * this.getNumberOfTourists() * this.getNumberOfDays();
    }

    @Override
    public double travelExpenseCalculator() {
        return this.getTravelCostPerDay() * this.getNumberOfTourists() * this.getNumberOfDays();
    }

    @Override
    public double totalExpenseCalculator() {
        double totalExpense = this.travelExpenseCalculator() + this.accomodationExpenseCalculator() + this.foodExpenseCalculator();
        if (this.getNumberOfTourists() > 15) {
            totalExpense = totalExpense - totalExpense * discount;
        }
        return totalExpense;
    }

    @Override
    public String toString() {
        return "\n******************Expenses for " + this.getPlaceBeingVisited() + " Tour *********************"
                + super.toString()
                + "\nTotal food expense          : " + this.foodExpenseCalculator()
                + "\nTotal travel expense        : " + this.travelExpenseCalculator()
                + "\nTotal accomodation expense  : " + this.accomodationExpenseCalculator()
                + "\n*************************************************************"
                + "\nTotal Expense               : " + this.totalExpenseCalculator()
                + "\n*************************************************************";
    }

}

