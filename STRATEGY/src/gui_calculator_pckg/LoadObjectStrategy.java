package gui_calculator_pckg;

import java.io.*;
import java.util.List;

public class LoadObjectStrategy implements LoadDataStrategy {
    @Override
    public List loadDataFromFile(String filePath) {
        File file = new File(filePath);

        try (FileInputStream fos = new FileInputStream(file)) {
            ObjectInputStream ois = new ObjectInputStream(fos);
            for(CalculationFormObjects obj : file) {
                CalculationFormObjects cfo = new CalculationFormObjects(obj.getFst(), obj.getSnd(), obj.getResult(), obj.getCalStrat());
                ois.(cfo);
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
}
