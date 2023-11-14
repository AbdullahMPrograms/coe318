package coe318.lab7;

/**
 *
 * @author AbdullahPC
 */

import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circuit circuit = new Circuit();
        String input;

        while (true) {
            input = scanner.nextLine();
            String[] parts = input.split(" ");

            switch (parts[0]) {
                case "r":
                    circuit.addResistor(new Resistor(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), Double.parseDouble(parts[3])));
                    break;
                case "v":
                    circuit.addVoltageSource(new VoltageSource(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), Double.parseDouble(parts[3])));
                    break;
                case "spice":
                    circuit.printSpice();
                    break;
                case "end":
                    System.out.println("All Done");
                    return;
                default:
                    System.out.println("Invalid command");
            }
        }
    }
}
