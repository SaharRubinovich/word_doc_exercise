package comp;

import java.util.Objects;

public class Director extends Manager {
    protected String group;

    //c'tors

    public Director(String name, double salary, String department, String group) {
        super(name, salary, department);
        setGroup(group);
    }

    //setters and getters

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    //methods

    @Override
    public String toString() {
        return super.toString() + ", group=" + group + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Director)) return false;
        if (!super.equals(o)) return false;
        Director director = (Director) o;
        return Objects.equals(getGroup(), director.getGroup());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getGroup());
    }
}
