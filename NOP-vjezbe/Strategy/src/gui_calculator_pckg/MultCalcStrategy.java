package gui_calculator_pckg;

import java.io.Serializable;

public class MultCalcStrategy implements CalculationStrategy {
    @Override
    public double performCalculation(double fst, double snd) {
        return fst * snd;
    }

    @Override
    public String toString() {
        return "Multiplying";
    }
}
