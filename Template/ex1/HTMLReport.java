import java.util.List;

public class HTMLReport extends ReportGenerator {
    @Override
    public void printHeader() {
        System.out.println("<html> \n       <head> \n           <title>Report</title>\n       </head>\n<body>");
       
    }

    @Override
    public void printBody(List<String> data) {
        for (String item: data){
            System.out.println("        <div>" + item + "</div>");
        }

    }

    @Override
    public void printFooter() {
       System.out.println("</body>\n</html>");
    }
    
}