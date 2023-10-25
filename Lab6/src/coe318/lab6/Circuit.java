package src.coe318.lab6;

import java.util.ArrayList;

public class Circuit {
    private static Circuit instance = null;
    private ArrayList<Resistor> resistors;

    public static Circuit getInstance() {
        if (instance == null) {
            instance = new Circuit();
        }
        return instance;
    }

    private Circuit() {
        resistors = new ArrayList<>(); //initilize instance variable of class (resistors)
    }    

    public void add(Resistor r) {
        resistors.add(r);
    }

    @Override
    public String toString() {
        String result = "";
        for (Resistor r : resistors) {
            result += r.toString() + "\n";
        }
        return result.trim();
    }
}
