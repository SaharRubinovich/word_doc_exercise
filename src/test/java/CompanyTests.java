import junit.framework.JUnit4TestAdapter;
import org.junit.BeforeClass;
import org.junit.Test;
import comp.*;

import static junit.framework.Assert.*;

public class CompanyTests {
    private static Manager manager;
    private static Employee employee, almog;
    private static Company company, emptyCompany;


    @BeforeClass
    public static void setUpCompany() {
        company = new Company("Jhon Bryce");
        emptyCompany = new Company("Empty");
        employee = new Employee("Sahar", 15_000);
        manager = new Manager("Bar", 35_000, "Development");
        Employee almog = new Employee("Almog",10_000);
        company.addEmployee(employee);
        company.addEmployee(manager);
    }

    @Test
    public void addEmployeeTest() {
        company.addEmployee(almog);
        assertTrue("Employee is in company?",company.getEmployeesList().contains(employee));
        assertTrue("Manager in company?",company.getEmployeesList().contains(manager));
    }
    @Test
    public void removeEmployeeTest(){
        company.removerEmployee(almog);
        assertFalse("Check if employee exist",company.getEmployeesList().contains(almog));
    }
    @Test
    public void getEmployeeNameTest(){
        System.out.println("Checking if employee name fits");
        assertEquals(manager.getName(),company.getName(manager));
    }
    @Test
    public void getAverageTest() throws CompanyReportException {
        System.out.println("Checking average calc");
        assertEquals(25_000.0,company.getAverageSalary());
    }
    @Test
    public void getManagementAverageSalary() throws CompanyReportException {
        System.out.println("Checking management average salary");
        assertEquals(manager.getSalary(),company.getManagementSalary());
    }
    @Test
    public void getYearlyPaymentTest() throws CompanyReportException {
        System.out.println("Checking yearly payment method");
        assertEquals((employee.getSalary()+manager.getSalary())*12, company.getYearlyPayment());
    }
    @Test
    public void getTotalNumOfEmployeesTest() throws CompanyReportException {
        System.out.println("Checking amount of employees");
        assertEquals(2,company.getTotalNumOfEmployee());
    }
    @Test
    public void getTotalNumOfManagersTest() throws CompanyReportException {
        System.out.println("Checking amount of managers");
        assertEquals(1,company.getTotalNumOfManagers());
    }
    public static junit.framework.Test suite(){
        return new JUnit4TestAdapter(CompanyTests.class);
    }
}
