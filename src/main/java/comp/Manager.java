package comp;

import java.util.List;

public class Manager extends Employee {
    protected String department;

    //c'tors

    public Manager(String name, double salary, String department) {
        super(name, salary);
        setDepartment(department);
    }

    //setters and getters

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    //methods

    @Override
    public String toString() {
        String[] typeName = this.getTypeName(this);
        return super.toString() + ", class=" + typeName[1]
                + ", department=" + this.department + '}';

    }
}