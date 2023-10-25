package coe318.lab6;

public class Resistor {
    
    private double resistance;
    private Node node1; 
    private Node node2;
    private int id;
    private static int nextId=1; //maybe not needed test later

    public Resistor(double resistance, Node node1, Node node2) {
        if(resistance <= 0) {
            throw new IllegalArgumentException("Resistance can't be zero or negative");
        } 
        if(node1 == null || node2 == null) {
            throw new IllegalArgumentException("Resistor must be connected to two nodes");  //yeah I know this is not needed as the lab says a resistor will be connected to two nodes, but always code for the edge cases right?
        }

        this.resistance = resistance;
        this.node1 = node1;
        this.node2 = node2;
        this.id = nextId;
        nextId++;
    }

    public Node [] getNodes() {
        return new Node[]{node1,node2}; //initialize new array with values node1,node2
    }

    @Override
    public String toString() {
        return "R" + id + " " + node1 + " " + node2 + " " + resistance;
    }
}
