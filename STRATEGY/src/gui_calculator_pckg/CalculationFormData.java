package gui_calculator_pckg;

public record CalculationFormData(double fst, double snd, double result, CalculationStrategy calStrat) {

    @Override
    public String toString() {
        return "CalculationFormData{" +
                "First Number = " + fst +
                ", Second Number =" + snd +
                ", result = " + result +
                ", CalculationStrategy = " + calStrat +
                '}';
    }

    @Override
    public double getFst() {
        return fst;
    }

    @Override
    public double getSnd() {
        return snd;
    }

    @Override
    public double getResult() {
        return result;
    }

    @Override
    public CalculationStrategy getCalStrat() {
        return calStrat;
    }
}
