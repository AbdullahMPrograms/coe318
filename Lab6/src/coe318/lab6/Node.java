//package src.coe318.lab6;

public class Node {
    private int id;
    private static int nextId = 0;  //why do we need this? instructions say we need it but cant we just this.id++ in Node()?

    public Node() {
        this.id = nextId;
        nextId++;
    }
    
    @Override
    public String toString() {
        return "" + id;
    }
}
