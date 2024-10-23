package gui_calculator_pckg;

public class DivCalcStrategy implements CalculationStrategy{
    @Override
    public double performCalculation(double fst, double snd) {
        if(snd == 0){
            System.out.println("Cannot divide by zero");
            throw new ArithmeticException("Zero division!");
        } else {
            return fst / snd;
        }
    }

    @Override
    public String toString() {
        return "Dividing";
    }
}
