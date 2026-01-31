
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> revenueData = Arrays.asList(
                "Thang 1: 100.000.000 VND",
                "Thang 2: 120.000.000 VND",
                "Thang 3: 150.000.000 VND"
        );

        ReportGenerator htmlReport = new HTMLReport();
        htmlReport.generateReport(revenueData);

        ReportGenerator textReport = new TextReport();
        textReport.generateReport(revenueData);
    }
}
