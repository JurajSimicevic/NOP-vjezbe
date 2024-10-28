package gui_calculator_pckg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import static gui_calculator_pckg.MainFrame.viewPanel;

public class LoadDataTxtStrategy implements LoadDataStrategy<CalculationFormData>{
    @Override
    public void loadDataFromFile(String filePath, List<CalculationFormData> data) {
        File file = new File(filePath);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            viewPanel.read(reader, null); // Reads file content into JTextArea
            viewPanel.clearListOfObjects();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
