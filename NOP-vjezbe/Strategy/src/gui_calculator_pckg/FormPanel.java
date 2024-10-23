package gui_calculator_pckg;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormPanel extends JPanel {

    private JTextField fstNumField;
    private JTextField sndNumField;
    private JTextField resultField;

    private JComboBox<CalculationStrategy> operationBox;
    private JButton confirmButton;
    private FormPanelListener formPanelListener;


    public FormPanel() {

        Dimension dims = this.getPreferredSize();
        dims.height = 220;
        this.setPreferredSize(dims);
        Border outer = BorderFactory.createEmptyBorder(5,5,5,5);
        Border inner = BorderFactory.createTitledBorder("Calculation panel: ");
        Border border = BorderFactory.createCompoundBorder(outer, inner);
        setBorder(border);
        initComps();
        layoutComps();
        activateFormPanel();
    }

    private void initComps() {

        fstNumField = new JTextField(10);
        sndNumField = new JTextField(10);
        resultField = new JTextField(10);
        operationBox = new JComboBox<>();

        DefaultComboBoxModel<CalculationStrategy> operationBoxModel = new DefaultComboBoxModel<>();
        operationBoxModel.addElement(new AddCalcStrategy());
        operationBoxModel.addElement(new SubCalcStrategy());
        operationBoxModel.addElement(new MultCalcStrategy());
        operationBoxModel.addElement(new DivCalcStrategy());
        operationBox.setModel(operationBoxModel);
        operationBox.setSelectedIndex(-1);

        confirmButton = new JButton("Calculate");
    }

    private void layoutComps() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;

        gbc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(new JLabel("First number:"), gbc);

        gbc.gridx++;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(fstNumField, gbc);


        gbc.gridx = 0;
        gbc.gridy++;

        add(Box.createVerticalStrut(15), gbc);

        gbc.gridy++;
        gbc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(new JLabel("Second number:"), gbc);

        gbc.gridx++;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(sndNumField, gbc);

        gbc.gridx++;
        add(Box.createHorizontalStrut(25), gbc);

        gbc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(new JLabel("Operation:"), gbc);

        gbc.gridx++;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(operationBox, gbc);

        gbc.gridx = 0;
        gbc.gridy++;

        add(Box.createVerticalStrut(20), gbc);

        gbc.gridy++;
        add(confirmButton, gbc);

        gbc.gridx+= 2;
        gbc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(new JLabel("Result:"), gbc);

        gbc.gridx++;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(resultField, gbc);

    }

    public void setFormPanelListener(FormPanelListener formPanelListener) {
        this.formPanelListener = formPanelListener;
    }

    private void activateFormPanel() {

        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Test for button activation");
                double fst = Double.parseDouble(fstNumField.getText());
                double snd = Double.parseDouble(sndNumField.getText());
                CalculationStrategy calculationStrategy = (CalculationStrategy) operationBox.getSelectedItem();
                double result = calculationStrategy.performCalculation(fst, snd);
                resultField.setText(String.valueOf(result));
                CalculationFormData calculationRecord = new CalculationFormData(fst, snd, result, calculationStrategy);
                if(formPanelListener != null){
                    formPanelListener.formPanelEventOccurred(calculationRecord);
                    resetForm();
                }
            }
        });
    }

    private void resetForm(){
        fstNumField.setText(null);
        sndNumField.setText(null);
        resultField.setEnabled(false);
        fstNumField.requestFocus();
        operationBox.setSelectedIndex(-1);
    }
}
