import java.util.List;
public abstract class ReportGenerator {
    public final void generateReport(List<String> data){
        printHeader();
        printBody(data);
        printFooter();
    }

    public abstract void printHeader();
    public abstract void printBody(List<String> data);
    public abstract void printFooter(); 
}