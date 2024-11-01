package gui_calculator_pckg;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MainFrame extends JFrame {

    static ViewPanel viewPanel;
    private FormPanel formPanel;
    private ToolBar toolBar;
    private final List<String> txtData;

    public MainFrame() {

        super("Simple calculator");
        this.txtData = new ArrayList<>();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setSize(680, 570);
        setVisible(true);

        initComps();
        layoutComps();
        activateMainFrame();
    }

    private void activateMainFrame() {

        formPanel.setFormPanelListener(new FormPanelListener() {
            @Override
            public void formPanelEventOccurred(CalculationFormData formRecord) {
                viewPanel.addTextToViewPanel(formRecord);
                txtData.add(formRecord.toString());
            }
        });

        toolBar.setToolBarListener(new ToolBarListener() {
            @Override
            public void toolbarEventOccured(String buttonActionString) {
                if (buttonActionString.equals("Save TXT")){
                    SaveTxtStrategy sts = new SaveTxtStrategy();
                    sts.saveDataToFile("NOP-vjezbe/Strategy/src/gui_calculator_pckg/ListOfText", txtData);
                }
                if (buttonActionString.equals("Clear all")){
                    txtData.clear();
                    viewPanel.clearAll();
                    JOptionPane.showMessageDialog(MainFrame.this, "List is erased!", "Warning msg", JOptionPane.INFORMATION_MESSAGE);
                }
                if (buttonActionString.equals("Load TXT")){
                    LoadTxtStrategy sts = new LoadTxtStrategy();
                    List<String> loaded = sts.loadDataFromFile("NOP-vjezbe/Strategy/src/gui_calculator_pckg/ListOfText");
                    for(String element : loaded){
                        viewPanel.addTextToViewPanel(element);
                    }
                    txtData.addAll(loaded);
                }
            }
        });
    }

    private void layoutComps() {
        setLayout(new BorderLayout());
        add(viewPanel, BorderLayout.CENTER);
        add(formPanel, BorderLayout.SOUTH);
        add(toolBar, BorderLayout.NORTH);
    }

    private void initComps() {

        viewPanel = new ViewPanel();
        formPanel = new FormPanel();
        toolBar = new ToolBar();
    }
}
