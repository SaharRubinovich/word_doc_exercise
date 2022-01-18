import comp.*;
import junit.framework.JUnit4TestAdapter;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ExceptionTests {
    private static Company emptyCompany;

    @BeforeClass
    public static void init(){
        System.out.println("Starting exceptions tests");
        emptyCompany = new Company("stam");
    }
    @Test(expected = CompanyReportException.class)
    public void averageSalaryExceptionTest() throws CompanyReportException {
       emptyCompany.getAverageSalary();
    }
    @Test(expected = CompanyReportException.class)
    public void getManagementAvgSalaryException() throws CompanyReportException{
        emptyCompany.getManagementSalary();
    }
    @Test(expected = CompanyReportException.class)
    public void yearlyPaymentException()throws CompanyReportException{
        emptyCompany.getYearlyPayment();
    }
    @Test(expected = CompanyReportException.class)
    public void totalNumOfEmployeesException()throws CompanyReportException{
        emptyCompany.getTotalNumOfEmployee();
    }
    @Test(expected = CompanyReportException.class)
    public void totalNumOfManagersException()throws CompanyReportException{
        emptyCompany.getTotalNumOfManagers();
    }
    public static junit.framework.Test suite(){
        return new JUnit4TestAdapter(ExceptionTests.class);
    }
    @AfterClass
    public static void finish(){
        System.out.println("Exception Test ended");
    }
}
