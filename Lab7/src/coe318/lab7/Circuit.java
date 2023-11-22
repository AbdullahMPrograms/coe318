package coe318.lab7;

/**
 *
 * @author AbdullahPC
 */
import java.util.ArrayList;

public class Circuit {
    private ArrayList<Resistor> resistors;
    private ArrayList<VoltageSource> voltageSources;

    public Circuit() {
        resistors = new ArrayList<>();
        voltageSources = new ArrayList<>();
    }

   public void addResistor(Resistor resistor) {
       resistors.add(resistor);
   }

   public void addVoltageSource(VoltageSource voltageSource) {
       voltageSources.add(voltageSource);
   }

   //FOR JUNIT TESTING
   public ArrayList<Resistor> getResistors() {
       return resistors;
   }

   public ArrayList<VoltageSource> getVoltageSources() {
       return voltageSources;
   }

    public void printSpice() {
        int rCount = 1, vCount = 1;
        for (VoltageSource v : voltageSources) {
            System.out.println("V" + vCount++ + " " + v);
        }
        for (Resistor r : resistors) {
            System.out.println("R" + rCount++ + " " + r);
        }
    }
}
