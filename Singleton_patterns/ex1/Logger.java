package ex1;
import java.io.*;

public class Logger {

    private static Logger instanceSingle;
    private static Logger instanceMulti;
    private static final String FILE_NAME = "log.txt";

    private Logger() {}

    public static Logger getInstanceSingle() {
        if (instanceSingle == null) {
            instanceSingle = new Logger();
        }
        return instanceSingle;
    }

    
    public static Logger getInstanceMulti() {
        if (instanceMulti == null) {
            synchronized (Logger.class) {
                if (instanceMulti == null) {
                    instanceMulti = new Logger();
                }
            }
        }
        return instanceMulti;
    }

    public synchronized void writeLine(String text) {
        try (FileWriter fw = new FileWriter(FILE_NAME, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {

            out.println(text);

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public synchronized void readLine() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    } 
}
