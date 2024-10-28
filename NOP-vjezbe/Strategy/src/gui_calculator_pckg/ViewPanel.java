package gui_calculator_pckg;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ViewPanel extends JPanel {

    private JTextArea textArea;
    private JScrollPane scrollPane;
    private List<CalculationFormData> listOfObjects = new ArrayList<>();

    public ViewPanel(){

        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
    }

    public void addTextToViewPanel(CalculationFormData calculationRecord) {
        textArea.append(calculationRecord + "\n");
        listOfObjects.add(calculationRecord);
    }

    public String getText() {
        return textArea.getText();
    }

    public List<CalculationFormData> getListOfObjects() {
        return listOfObjects;
    }

    public void read(BufferedReader reader, Object o) throws IOException {
        textArea.read(reader, o);
    }

    public void clearAll(){
        textArea.setText("");
    }

    public void clearListOfObjects (){
        listOfObjects.clear();
    }

    public void addRecordToList(CalculationFormData calculationRecord){
        listOfObjects.add(calculationRecord);
    }
}
