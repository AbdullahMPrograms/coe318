package coe318.lab7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircuitTest {
  private Circuit circuit;
  private Resistor resistor;
  private VoltageSource voltageSource;

  @BeforeEach
  public void setUp() {
      circuit = new Circuit();
      resistor = new Resistor(1, 2, 3.0);
      voltageSource = new VoltageSource(1, 2, 3.0);
  }

  @Test
  public void testAddResistor() {
     circuit.addResistor(resistor);
     assertEquals(1, circuit.getResistors().size());
     assertTrue(circuit.getResistors().contains(resistor));
  }

  @Test
  public void testAddVoltageSource() {
     circuit.addVoltageSource(voltageSource);
     assertEquals(1, circuit.getVoltageSources().size());
     assertTrue(circuit.getVoltageSources().contains(voltageSource));
  }
}