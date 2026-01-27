package ex2;

public class Packet {
    private String originator;
    private String destination;
    private String contents;

    // Constructor
    public Packet(String originator, String destination, String contents) {
        this.originator = originator;
        this.destination = destination;
        this.contents = contents;
    }
    
    public String getOriginator() {
        return originator;
    }

    public String getDestination() {
        return destination;
    }
    
    //Methods
    public String getContents() {
        return contents;
    }

    
    public boolean isOriginator(String node) {
        return originator.equals(node);
    }

    public boolean isDestination(String node) {
        return destination.equals(node);
    }
}
