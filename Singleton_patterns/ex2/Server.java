package ex2;

public class Server extends Node {

    private static Server instance;

    private Printer printer1;
    private Printer printer2;

    private Server(String name) {
        super(name);
        printer1 = new Printer1("Printer1");
        printer2 = new Printer2("Printer2");
    }

    public static synchronized Server getInstance() {
        if (instance == null) {
            instance = new Server("Server");
        }
        return instance;
    }

    @Override
    public synchronized void accept(Packet p) {
        System.out.println("Server received packet");

        // Server decides which printer handles the job
        if (printer1.isForMe(p)) {
            printer1.print(p);
        } else if (printer2.isForMe(p)) {
            printer2.print(p);
        } else {
            System.out.println("No printer can handle this packet");
        }
    }
}

