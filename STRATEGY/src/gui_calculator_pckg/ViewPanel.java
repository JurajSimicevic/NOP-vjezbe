package gui_calculator_pckg;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;

public class ViewPanel extends JPanel {

    private JTextArea textArea;
    private JScrollPane scrollPane;

    public ViewPanel(){

        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
    }

    public void addTextToViewPanel(CalculationFormData calculationRecord) {
        textArea.append(calculationRecord + "\n");
    }

    public void addTextToViewPanel(String dataTxt){
        textArea.append(dataTxt + "\n");
    }

    public String getText() {
        return textArea.getText();
    }


    public void read(BufferedReader reader, Object o) throws IOException {
        textArea.read(reader, o);
    }

    public void clearAll(){
        textArea.selectAll();
        textArea.replaceSelection(null);
    }

}
