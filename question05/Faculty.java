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
public class Faculty extends Employee {
    private String officeHours;
    private int teachingSubjects;

    public Faculty(String name, String address, String phone, String email, String office, float salary, Date dateHired, String officeHours, int teachingSubjects) {
        super(name, address, phone, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.teachingSubjects = teachingSubjects;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public int getTeachingSubjects() {
        return teachingSubjects;
    }

    public void setTeachingSubjects(int teachingSubjects) {
        this.teachingSubjects = teachingSubjects;
    }

    @Override
    public String toString() {
        return "Faculty{" + "officeHours=" + officeHours + ", teachingSubjects=" + teachingSubjects + '}';
    }
}
   
    

