package gui_calculator_pckg;

public class MultCalcStrategy implements CalculationStrategy{
    @Override
    public double performCalculation(double fst, double snd) {
        return fst * snd;
    }
}