package testExeercise;

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
