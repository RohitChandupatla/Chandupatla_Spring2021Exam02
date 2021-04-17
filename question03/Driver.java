/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question03;
import java.util.ArrayList;
import java.util.Date;

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
        ArrayList<Object> arrayList1 = new ArrayList<>();

        arrayList1.add(new Loan(1, 2000));
        arrayList1.add(new Date());
        arrayList1.add("rohit");
        arrayList1.add(new Circle(20));

        System.out.println("\n" + arrayList1 + "\n" );

        System.out.println("Looping each element: ");
        for (Object element : arrayList1) {
            System.out.println(element.toString());
    }
    }
}
   
