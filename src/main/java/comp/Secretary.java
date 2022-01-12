package comp;

import java.util.Objects;

public class Secretary extends Employee {
    protected String office;

    //c'tors
    public Secretary(String name, double salary, String office) {
        super(name, salary);
        setOffice(office);
    }

    //setters and getters
    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    //methods

    @Override
    public String toString() {
        String[] typeName = this.getTypeName(this);
        return super.toString() + ", class=" + typeName[1]
                + ", office=" + this.office + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Secretary)) return false;
        if (!super.equals(o)) return false;
        Secretary secretary = (Secretary) o;
        return getOffice().equals(secretary.getOffice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getOffice());
    }
}
