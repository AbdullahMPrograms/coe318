package coe318.lab7;

/**
 *
 * @author AbdullahPC
 */
public class VoltageSource {
    private double voltage;
    private int positiveNode, negativeNode;

    public VoltageSource(int positiveNode, int negativeNode, double voltage) {
        this.positiveNode = positiveNode;
        this.negativeNode = negativeNode;
        this.voltage = voltage;
    }

    @Override
    public String toString() {
        if(positiveNode > negativeNode) {
            return negativeNode + " " + positiveNode + " DC -" + voltage;
        } else {
            return positiveNode + " " + negativeNode + " DC " + voltage;
        }
        
    }
}
