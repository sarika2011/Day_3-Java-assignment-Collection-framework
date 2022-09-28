/*2).Given the following class
Employee class{ Double Age; Double Salary; String Name}
Design the class in such a way that the default sorting should work on firstname and lastname.
Also, Write a program to sort Employee objects based on salary using Comparator. */

package testExeercise;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee_class {

	private String name;
    private double age;
    private double salary;

    public Employee_class (String name, double age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}

