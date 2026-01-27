package ex2;
public class Printer2 extends Printer {

    public Printer2(String name) {
        super(name);
    }

    @Override
    public boolean isForMe(Packet p) {
        return p.getContents().length() > 20;
    }

    @Override
    public void print(Packet p) {
        System.out.println("Printer2 printing: " + p.getContents());
    }
}
