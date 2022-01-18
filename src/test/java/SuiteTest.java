import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class SuiteTest {
    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    private static Test suite() {
        TestSuite testSuite = new TestSuite();
        testSuite.addTest(CompanyTests.suite());
        testSuite.addTest(SetterTests.suite());
        testSuite.addTest(GetterTests.suite());
        testSuite.addTest(ExceptionTests.suite());
        return testSuite;
    }
}
