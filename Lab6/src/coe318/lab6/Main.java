//package src.coe318.lab6;
/*
 * OUTPUT VERIFICATION CLASS
 * 
 */

public class Main {    
    public static void main(String[] args) {
        Circuit circuit = Circuit.getInstance();

        Node nodeA, nodeB, nodeC, nodeD, nodeE;
        Resistor r1, r2, r3, r4;

        nodeA = new Node();
        nodeB = new Node();
        nodeC = new Node();
        nodeD = new Node();
        nodeE = new Node();

        r1 = new Resistor(20, nodeA, nodeB);
        r2 = new Resistor(15, nodeB, nodeC);
        r3 = new Resistor(10, nodeC, nodeD);
        r4 = new Resistor(5, nodeD, nodeE);

        circuit.add(r1);
        circuit.add(r2);
        circuit.add(r3);
        circuit.add(r4);
        System.out.println(circuit);
    }
}
