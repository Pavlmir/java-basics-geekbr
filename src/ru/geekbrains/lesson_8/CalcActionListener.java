package ru.geekbrains.lesson_8;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcActionListener implements ActionListener {
    private final JTextField inputField;

    public CalcActionListener(JTextField inputField) {
        this.inputField = inputField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = inputField.getText();
        Object expResult = new ScriptEngineManager();
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("Nashorn");
        try {
            expResult = scriptEngine.eval(text);
        } catch (ScriptException scriptException) {
            scriptException.printStackTrace();
        }

        inputField.setText(String.valueOf(expResult));
    }

    public void actionPerformedSimple(ActionEvent e) {
        String text = inputField.getText();
        String[] splittedValues;
        int sum = 0;

        if (text.contains("+")) {
            splittedValues = text.split("\\+");
            sum = Integer.parseInt(splittedValues[0]) + Integer.parseInt(splittedValues[1]);
        } else if (text.contains("-")) {
            splittedValues = text.split("-");
            sum = Integer.parseInt(splittedValues[0]) - Integer.parseInt(splittedValues[1]);
        } else if (text.contains("*")) {
            splittedValues = text.split("\\*");
            sum = Integer.parseInt(splittedValues[0]) * Integer.parseInt(splittedValues[1]);
        } else if (text.contains("/")) {
            splittedValues = text.split("/");
            if (Integer.parseInt(splittedValues[1]) == 0) {
                sum = 0;
            } else {
                sum = Integer.parseInt(splittedValues[0]) / Integer.parseInt(splittedValues[1]);
            }
        } else if (text.contains("^")) {
            splittedValues = text.split("\\^");
            sum = 1;
            for (int i = 0; i < Integer.parseInt(splittedValues[1]); i++) {
                sum = sum * Integer.parseInt(splittedValues[0]);
            }
        }

        inputField.setText(String.valueOf(sum));
    }

}
