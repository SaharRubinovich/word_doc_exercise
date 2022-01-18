import junit.framework.JUnit4TestAdapter;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import comp.*;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertSame;

public class GetterTests {
    private static Employee employee;
    private static Director director;
    private static Engineer engineer;
    private static Manager manager;
    private static Secretary secretary;

    @BeforeClass
    public static void setUpTesting(){
        employee = new Employee("sahar",10_000);
        manager = new Manager("Bob", 30_000, "Q&A");
        director = new Director("Ross", 25_000, "Q&A", "Management");
        engineer = new Engineer("Dilan", 23_000, "Computers");
        secretary = new Secretary("Miriam", 13_000, "Q&A");
    }
    @Test
    public void employeeGettersTester(){
        System.out.println("Checking employee getters");
        assertEquals("sahar",employee.getName());
        assertEquals(10_000.0,employee.getSalary());
        System.out.println("Done!");
    }
    @Test
    public void managerGettersTester(){
        System.out.println("Checking manager getters");
        assertEquals("Q&A", manager.getDepartment());
        System.out.println("Done!");
    }
    @Test
    public void directorGettersTester(){
        System.out.println("Checking director getters");
        assertEquals("Management",director.getGroup());
    }
    @Test
    public void engineerGettersTester(){
        System.out.println("Checking engineer getters");
        assertEquals("Computers",engineer.getSpecialty());
    }
    @Test
    public void secretaryGettersTester(){
        System.out.println("Checking secretary getters");
        assertEquals("Q&A",secretary.getOffice());
    }
    public static junit.framework.Test suite(){
        return new JUnit4TestAdapter(GetterTests.class);
    }
    @AfterClass
    public static void finish(){
        System.out.println("Getters testing finished");
    }
}
