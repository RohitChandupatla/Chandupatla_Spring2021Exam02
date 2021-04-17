/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question05;
import java.util.Date;

/**
 *
 * @author Rohit Reddy Chandupatla
 */
public class Employee extends Person {
    private String office;
    private float salary;
    private Date dateHired;
    
    public Employee(String name, String address, String phone, String email, String office, float salary, Date dateHired) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }



    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
        
        
    }

    @Override
    public String toString() {
        return "\nEmployee -" + "\noffice=" + office + ", \nsalary=" + salary + ", \ndateHired=" + dateHired ;
    }
}
    