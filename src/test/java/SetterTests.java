import junit.framework.JUnit4TestAdapter;
import org.junit.Test;
import comp.*;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertSame;

public class SetterTests {
    private String name = "Sahar";
    private double salary = 40_000.0;


    @Test
    public void employeeCtorTest(){
        System.out.println("Setting employee object");
        Employee employee = new Employee(name,salary);
        assertEquals(name,employee.getName());
        assertEquals(salary,employee.getSalary());
    }
    @Test
    public void directorCtorTest(){
        System.out.println("Setting manager object");
        Manager manager = new Manager(name,salary,"Q&A");
        assertEquals(name,manager.getName());
        assertEquals(salary,manager.getSalary());
        assertEquals("Q&A",manager.getDepartment());
    }
    @Test
    public void engineerCtorTest(){
        System.out.println("Setting engineer object");
        Engineer engineer = new Engineer(name,salary,"Computers");
        assertEquals(name,engineer.getName());
        assertEquals(salary,engineer.getSalary());
        assertEquals("Computers",engineer.getSpecialty());
    }
    @Test
    public void secretaryCtorTest(){
        System.out.println("Setting secretary object");
        Secretary secretary = new Secretary(name,salary,"Q&A");
        assertEquals(name,secretary.getName());
        assertEquals(salary,secretary.getSalary());
        assertEquals("Q&A",secretary.getOffice());
    }
    public static junit.framework.Test suite(){
        return new JUnit4TestAdapter(SetterTests.class);
    }
}
