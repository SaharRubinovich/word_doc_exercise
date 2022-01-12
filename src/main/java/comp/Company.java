package comp;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private static List<Employee> employeesList = new ArrayList<>();
    public static int numOfEmployees = 0;

    //c'tors

    public Company(String name) {
        setName(name);
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
    public void getName(Employee employee) {
        employee.getName();
    }

    private double calcSum(double sum, Employee employee) {
        sum += employee.getSalary();
        return sum;
    }

    public double getAverageSalary() throws CompanyReportException {
        if (employeesList.size() == 0) {
            throw new CompanyReportException(this.name, "Average Salary Report");
        }
        double sum = 0, avg;
        for (Employee employee : this.employeesList) {
            sum = calcSum(sum, employee);
        }
        return avg = sum / this.employeesList.size();
    }

    public double getManagementSalary() throws CompanyReportException {
        if (employeesList.size() == 0) {
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
        if (employeesList.size() == 0) {
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
        if (employeesList.size() == 0) {
            throw new CompanyReportException(this.name, "Average Salary Report");
        }
        return employeesList.size();
    }

    public int getTotalNumOfManagers() throws CompanyReportException {
        if (employeesList.size() == 0) {
            throw new CompanyReportException(this.name, "Average Salary Report");
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

