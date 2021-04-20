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
        String[] splittedValues;
        int sum = 0;

        if (true) {
            ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
            ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("Nashorn");
            try {
                Object expResult = scriptEngine.eval(text);
                sum = (Integer) expResult;
            } catch (ScriptException scriptException) {
                scriptException.printStackTrace();
            }
        } else if (text.contains("+")) {
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
