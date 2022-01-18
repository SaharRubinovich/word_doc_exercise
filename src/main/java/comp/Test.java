package comp;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        final int MAX_EMPLOYEES = 10;

        Employee[] employees = new Employee[MAX_EMPLOYEES];

        employees[0] = new Secretary("Merav", 8_000, "Caffe");
        employees[1] = new Secretary("Ron", 9_000, "Apple");
        employees[2] = new Manager("Zef", 23_000, "Sales");
        employees[3] = new Manager("Jeff", 35_000, "Technology");
        employees[4] = new Employee("Gila", 10_000);
        employees[5] = new Employee("Shaked", 40_000);
        employees[6] = new Employee("Naftul", 50_000);
        employees[7] = new Director("Mansur", 42_000, "Technology", "munchers");
        employees[8] = new Engineer("Yair", 24_000, "Communication");
        employees[9] = new Engineer("Gideon", 32_000, "Talking");
        System.out.println(Arrays.toString(employees));

        System.out.println("Average salary is: " + avgSalary(employees));
        System.out.println("Managers average salary is: " + mngAvgSalary(employees));

        Company company = new Company("WTF?!");
        System.out.println(company.toString());
        for (int index = 0; index < employees.length; index++) {
            company.addEmployee(employees[index]);
        }
        System.out.println(company.toString());
        try {
            System.out.println("Average Salary: " + company.getAverageSalary());
            System.out.println("Management average salary: " + company.getManagementSalary());
            System.out.println("Yearly salary cost: " + company.getYearlyPayment());
            System.out.println("Total employees: " + company.getTotalNumOfEmployee());
            System.out.println("Total managers: " + company.getTotalNumOfManagers());
        } catch (CompanyReportException err) {
            System.out.println(err.getMessage());
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }
    }

    public static double avgSalary(Employee[] employees) {
        double sum = 0, avg;
        for (int employee = 0; employee < employees.length; employee++) {
            sum += employees[employee].getSalary();
        }
        avg = sum / employees.length;
        return avg;
    }

    public static double mngAvgSalary(Employee[] employees) {
        double sum = 0, avg;
        int counter = 0;
        for (int employee = 0; employee < employees.length; employee++) {
            if (employees[employee] instanceof Manager) {
                sum += employees[employee].getSalary();
                counter += 1;
            }
        }
        avg = sum / counter;
        return avg;
    }
}
