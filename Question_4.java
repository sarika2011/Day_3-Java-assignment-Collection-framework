package testExeercise;

import java.util.HashMap;
import java.util.Map;

public class Question_4 {

	public static void main(String[] args) {

        Map<Employee1, Double> map = new HashMap<Employee1, Double>();

        Employee1 emp1 = new Employee1("Sal", 23, 200000, "SDE");
        Employee1 emp2 = new Employee1("Sal", 23, 200000, "SDE");
        Employee1 emp3 = new Employee1("Joe", 23, 345967, "SDE");
        Employee1 emp4 = new Employee1("Park", 23, 230000, "SDET");
        Employee1 emp5 = new Employee1("Sim", 23, 234566, "SDE");

        map.put(emp1, emp1.getSalary());
        map.put(emp2, emp2.getSalary());
        map.put(emp3, emp3.getSalary());
        map.put(emp4, emp4.getSalary());
        map.put(emp5, emp5.getSalary());


        for (Map.Entry<Employee1, Double> e : map.entrySet()) {
            System.out.println("Name : " + e.getKey().getName() + " Salary : " + e.getValue());
        }
    }
}
