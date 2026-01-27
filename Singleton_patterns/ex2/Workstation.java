package ex2;

public class Workstation extends Node {

    public Workstation(String name) {
        super(name);
    }

    public void originate(Packet p) {
        System.out.println("Workstation sending packet...");
        accept(p);
    }

    @Override
    public void accept(Packet p) {
        if (nextNode != null) {
            nextNode.accept(p);
        }
    }
}
