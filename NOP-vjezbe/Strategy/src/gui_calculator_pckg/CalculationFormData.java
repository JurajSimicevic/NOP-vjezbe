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
    public double fst() {
        return fst;
    }

    @Override
    public double snd() {
        return snd;
    }

    @Override
    public double result() {
        return result;
    }

    @Override
    public CalculationStrategy calStrat() {
        return calStrat;
    }
}
