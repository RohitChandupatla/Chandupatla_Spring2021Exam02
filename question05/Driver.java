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
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person person = new Person("Person X", "0-1-2 Maryville, MO","000-000-0000", "person@test.com");
        System.out.println(person.toString());

        Employee employee = new Employee("Employee X", "1-2-3 Maryville, MO", "000-000-0001", "employee@test.com"
                , "100", 65000, new Date("04/14/2021"));
        System.out.println(employee.toString());

        Faculty faculty = new Faculty("Faculty X", "2-3-4 Maryville, MO", "000-000-0002"
                ,"faculty@test.com", "101", 66000, new Date("04/13/2021"), "09:00 - 14:00",2);
        System.out.println(faculty.toString());

        Staff staff = new Staff("Staff X", "3-4-5 Maryville, MO", "000-000-0003", "staff@test.com"
                , "102", 60000, new Date("04/12/2021"), "Administrator");
        System.out.println(staff.toString());

        Student student = new Student("Student X", "4-5-6 Maryville, MO", "000-000-0004", "student@Test.com", "A");
        System.out.println(student.toString());
    }
}
