
package coe318.lab7;

/**
 *
 * @author AbdullahPC
 */
public class Resistor {
    private double resistance;
    private int node1, node2;

    public Resistor(int node1, int node2, double resistance) {
        this.node1 = node1;
        this.node2 = node2;
        this.resistance = resistance;
    }

    @Override
    public String toString() {
        return node1 + " " + node2 + " " + resistance;
    }
}