package gui_calculator_pckg;

import java.io.*;
import java.util.List;

public class SaveBinStrategy implements SaveDataStrategy<CalculationFormObjects> {
    @Override
    public void saveDataToFile(String filePath, List<CalculationFormObjects> data) {

        File file = new File(filePath);

        try (FileOutputStream fos = new FileOutputStream(file)) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for(CalculationFormRecord obj : data) {
                CalculationFormData obj1 = (CalculationFormData) obj;
                CalculationFormObjects cfo = new CalculationFormObjects(obj1.getFst(), obj1.getSnd(), obj1.getResult(), obj1.getCalStrat());
                oos.writeObject(cfo);
            }
            oos.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
