package comp;

public class CompanyReportException extends Exception {
    private String companyName, reportName;

    public CompanyReportException(String companyName, String reportName) {
        super("Error! " + companyName + " has error in: " + reportName);
        setCompanyName(companyName);
        setReportName(reportName);
    }

    public String getCompanyName() {
        return companyName;
    }

    private void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getReportName() {
        return reportName;
    }

    private void setReportName(String reportName) {
        this.reportName = reportName;
    }
}