package gui_calculator_pckg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import java.util.List;

import static gui_calculator_pckg.MainFrame.viewPanel;

public class ToolBar extends JPanel implements ActionListener {

    private JButton saveAsText;
    private JButton saveObjects;
    private JButton loadText;
    private JButton loadObjects;
    private JButton clearAll;
    private ToolBarListener toolBarListener;

    public ToolBar() {

        initComps();
        layoutComps();
        activateToolBar();
    }

    public void setToolBarListener(ToolBarListener toolBarListener) {
        this.toolBarListener = toolBarListener;
    }

    private void initComps() {
        this.saveAsText = new JButton("Save txt");
        this.saveObjects = new JButton("Save bin");
        this.loadObjects = new JButton("Load bin");
        this.loadText = new JButton("Load txt");
        this.clearAll = new JButton("Clear all");
    }

    private void layoutComps() {

        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(saveAsText);
        add(saveObjects);
        add(loadText);
        add(loadObjects);
        add(clearAll);
    }

    private void activateToolBar() {
        saveAsText.addActionListener(this);
        saveAsText.setActionCommand("Save TXT");
        saveObjects.addActionListener(this);
        saveObjects.setActionCommand("Save BIN");
        loadText.addActionListener(this);
        loadText.setActionCommand("Load TXT");
        loadObjects.addActionListener(this);
        loadObjects.setActionCommand("Load BIN");
        clearAll.addActionListener(this);
        clearAll.setActionCommand("Clear all");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == saveAsText) {
            System.out.println("Clicked: " + saveAsText.getActionCommand());
            if(toolBarListener != null){
                toolBarListener.toolbarEventOccured(saveAsText.getActionCommand());
            }
        }
        if (ae.getSource() == saveObjects) {
            System.out.println("Clicked: " + saveObjects.getActionCommand());
            if(toolBarListener != null) {
                toolBarListener.toolbarEventOccured(saveObjects.getActionCommand());
            }

        }
        if (ae.getSource() == loadText) {
            System.out.println("Clicked: " + loadText.getActionCommand());
            if(toolBarListener != null) {
                toolBarListener.toolbarEventOccured(loadText.getActionCommand());
            }

        }
        if (ae.getSource() == loadObjects) {
            System.out.println("Clicked: " + loadObjects.getActionCommand());
            if(toolBarListener != null) {
                toolBarListener.toolbarEventOccured(loadObjects.getActionCommand());
            }

        }
        if( ae.getSource() == clearAll) {
            System.out.println("Clicked: " + clearAll.getActionCommand());
            if(toolBarListener != null) {
                toolBarListener.toolbarEventOccured(clearAll.getActionCommand());
            }
        }
    }


}
