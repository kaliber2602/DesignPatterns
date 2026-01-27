package ex2;

public class Main {

    public static void main(String[] args) {

        Workstation ws = new Workstation("WS1");
        Server server = Server.getInstance();

        ws.insertNode(server);

        Packet p1 = new Packet("WS1", "Server", "Short job");
        Packet p2 = new Packet("WS1", "Server", "This is a very large printing job 1");
        Packet p3 = new Packet("WS1", "Server", "This is a very large printing job 2");

        ws.originate(p1);
        ws.originate(p2);
        ws.originate(p3);
    }
}

