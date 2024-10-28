package gui_calculator_pckg;

import java.io.Serializable;

public class CalculationFormObjects implements Serializable {

    private double fst;
    private double snd;
    private double result;
    private CalculationStrategy calStrat;

    public CalculationFormObjects() {}


    public CalculationFormObjects(double fst, double snd, double result, CalculationStrategy calStrat) {
        this.fst = fst;
        this.snd = snd;
        this.result = result;
        this.calStrat = calStrat;
    }

    public double getFst() {
        return fst;
    }

    public double getSnd() {
        return snd;
    }

    public double getResult() {
        return result;
    }

    public CalculationStrategy getCalStrat() {
        return calStrat;
    }
}
