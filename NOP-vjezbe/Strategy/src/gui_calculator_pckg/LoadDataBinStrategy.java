package gui_calculator_pckg;

import java.io.*;
import java.util.List;

import static gui_calculator_pckg.MainFrame.viewPanel;

public class LoadDataBinStrategy implements LoadDataStrategy<CalculationFormData>{
    @Override
    public void loadDataFromFile(String filePath, List<CalculationFormData> data){
        File file = new File(filePath);
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            // Clear JTextArea
            viewPanel.clearAll();
            viewPanel.clearListOfObjects();

            // Read objects from the file
            Object obj;
            while ((obj = ois.readObject()) != null) {
                if (obj instanceof CalculationFormObjects) {
                    CalculationFormObjects fo = new CalculationFormObjects(((CalculationFormObjects) obj).getFst(), ((CalculationFormObjects) obj).getSnd(), ((CalculationFormObjects) obj).getResult(), ((CalculationFormObjects) obj).getCalStrat());
                    CalculationFormData calculationRecord = new CalculationFormData(fo.getFst(), fo.getSnd(), fo.getResult(), fo.getCalStrat());
                    viewPanel.addTextToViewPanel(calculationRecord);
                    viewPanel.addRecordToList(calculationRecord);
                }
            }
        } catch (EOFException ex) {
            // End of file reached; do nothing
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
