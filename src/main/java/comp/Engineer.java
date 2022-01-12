package comp;

import java.util.Objects;

public class Engineer extends Employee {
    protected String specialty;

    //c'tors
    public Engineer(String name, double salary, String specialty) {
        super(name, salary);
        setSpecialty(specialty);
    }

    //setters and getters

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    //methods

    @Override
    public String toString() {
        String[] typeName = this.getTypeName(this);
        return super.toString() + ", class=" + typeName[1]
                + ", specialty=" + this.specialty + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Engineer)) return false;
        if (!super.equals(o)) return false;
        Engineer engineer = (Engineer) o;
        return Objects.equals(getSpecialty(), engineer.getSpecialty());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSpecialty());
    }
}
