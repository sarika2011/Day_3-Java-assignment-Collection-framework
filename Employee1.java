package testExeercise;
/* 4).Create class Employee with attributes name,age,designation and use instances of these class as keys in a Map and their salary as value */
public class Employee1 {

	private final String name;

    private final double age;

    private final double salary;

    private final String designation;

    public Employee1(String name, double age, double salary, String designation) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }


}
