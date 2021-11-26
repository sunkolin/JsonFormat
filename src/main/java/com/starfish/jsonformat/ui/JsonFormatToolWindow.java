package com.starfish.jsonformat.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JsonFormatToolWindow {

    private static JsonFormatForm jsonFormatForm;

    public static JComponent getComponent() {
        jsonFormatForm = new JsonFormatForm();

        addListener(jsonFormatForm);

        return jsonFormatForm.getMainPanel();
    }

    public static void addListener(JsonFormatForm jsonFormatForm) {
        // 给复制按钮加上监听器
        JButton copyJsonButton =  jsonFormatForm.getCopyJsonButton();
        copyJsonButton.addActionListener(e -> {
            JTextArea jsonTextArea = jsonFormatForm.getJsonTextArea();
            String text = jsonTextArea.getText();
            System.out.println(text);
        });
    }

}
