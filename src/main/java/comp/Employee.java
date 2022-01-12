package comp;

import java.util.Objects;

public class Employee {
    protected String name;
    protected double salary;

    //c'tors

    public Employee(String name, double salary) {
        setName(name);
        setSalary(salary);
    }

    //setters and getters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //methods
    public String[] getTypeName(Object object) {
        String className = this.getClass().getTypeName();
        String typeName[] = className.split("\\.");
        return typeName;
    }


    @Override
    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", salary=" + salary;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Employee)) return false;
        Employee employee = (Employee) object;
        return Double.compare(employee.getSalary(), getSalary()) == 0 && getName().equals(employee.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSalary());
    }
}
