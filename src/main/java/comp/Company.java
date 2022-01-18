package comp;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private List<Employee> employeesList;
    public static int numOfEmployees = 0;

    //c'tors

    public Company(String name) {
        setName(name);
        this.employeesList = new ArrayList<>();
    }

    //setters and getters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployeesList() {
        return employeesList;
    }

    //methods
    public String getName(Employee employee) {
        return employee.getName();
    }
    public void addEmployee(Employee employee) {
        this.getEmployeesList().add(employee);
    }

    public  void removerEmployee(Employee employee) {
        this.getEmployeesList().remove(employee);
    }

    private double calcSum(double sum, Employee employee) {
        sum += employee.getSalary();
        return sum;
    }

    public double getAverageSalary() throws CompanyReportException {
        if (employeesList.size() == 0 || employeesList == null) {
            throw new CompanyReportException(this.name, "Average Salary Report");
        }
        double sum = 0, avg;
        for (Employee employee : this.employeesList) {
            sum = calcSum(sum, employee);
        }
        return avg = sum / this.employeesList.size();
    }

    public double getManagementSalary() throws CompanyReportException {
        if (employeesList.size() == 0 || employeesList == null) {
            throw new CompanyReportException(this.name, "Average Salary Report");
        }
        double sum = 0, avg;
        int counter = 0;
        for (Employee employee : this.employeesList) {
            if (employee instanceof Manager) {
                sum = calcSum(sum, employee);
                counter += 1;
            }
        }
        return avg = sum / counter;
    }

    public double getYearlyPayment() throws CompanyReportException {
        if (employeesList.size() == 0 || employeesList == null) {
            throw new CompanyReportException(this.name, "Average Salary Report");
        }
        double sum = 0;
        final int MONTHS = 12;
        for (Employee employee : this.employeesList) {
            sum = calcSum(sum, employee);
        }
        return sum *= MONTHS;
    }

    public int getTotalNumOfEmployee() throws CompanyReportException {
        if (employeesList.size() == 0 || employeesList == null) {
            throw new CompanyReportException(this.name, "Average Salary Report");
        }
        return employeesList.size();
    }

    public int getTotalNumOfManagers() throws CompanyReportException {
        if (employeesList.size() == 0 || employeesList == null) {
            throw new CompanyReportException(this.name, "Total num of Managers Report");
        }
        int counter = 0;
        for (int index = 0; index < employeesList.size(); index++) {
            if (employeesList.get(index) instanceof Manager) {
                counter += 1;
            }
        }
        return counter;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Company: " + name + "\n");
        return stringBuilder + this.employeesList.toString();
    }
}

