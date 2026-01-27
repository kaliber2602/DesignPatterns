package ex2;
public abstract class Printer extends Node {

    public Printer(String name) {
        super(name);
    }

    public abstract boolean isForMe(Packet p);

    public abstract void print(Packet p);

    @Override
    public void accept(Packet p) {
        print(p);
    }
}
