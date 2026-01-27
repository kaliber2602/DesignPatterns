package ex2;

public abstract class Node {

    protected String name;
    protected Node nextNode;

    public Node(String name) {
        this.name = name;
    }

    public void insertNode(Node n) {
        this.nextNode = n;
    }

    public Node nextNode() {
        return nextNode;
    }

    public abstract void accept(Packet p);
}
