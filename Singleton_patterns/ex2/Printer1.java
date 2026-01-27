package ex2;

public class Printer1 extends Printer {

    public Printer1(String name) {
        super(name);
    }

    @Override
    public boolean isForMe(Packet p) {
        return p.getContents().length() <= 20;
    }

    @Override
    public void print(Packet p) {
        System.out.println("Printer1 printing: " + p.getContents());
    }
}
