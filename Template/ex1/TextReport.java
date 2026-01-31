import java.util.List;

public class TextReport extends ReportGenerator {
    @Override
    public void printHeader() {
        System.out.println("=== BAO CAO DOANH THU ===.");
       
    }

    @Override
    public void printBody(List<String> data) {
        for (String item: data){
            System.out.println("- " + item);
        }
    }
    @Override
    public void printFooter() {
        System.out.println("-------------------------");
    }
}