package com.starfish.jsonformat.form;

import javax.swing.*;

public class JsonFormatForm {
    private JTextArea jsonTextArea;
    private JButton formatJsonButton;
    private JButton copyObjectButton;
    private JButton copyJsonButton;
    private JButton generateObjectButton;
    private JPanel mainPanel;
    private JScrollPane scrollPanel;

    public JTextArea getTextArea1() {
        return jsonTextArea;
    }

    public void setTextArea1(JTextArea textArea1) {
        this.jsonTextArea = textArea1;
    }

    public JButton get格式化Button() {
        return formatJsonButton;
    }

    public void set格式化Button(JButton 格式化Button) {
        this.formatJsonButton = 格式化Button;
    }

    public JButton get复制对象Button() {
        return copyObjectButton;
    }

    public void set复制对象Button(JButton 复制对象Button) {
        this.copyObjectButton = 复制对象Button;
    }

    public JButton get复制Button() {
        return copyJsonButton;
    }

    public void set复制Button(JButton 复制Button) {
        this.copyJsonButton = 复制Button;
    }

    public JButton get生成对象Button() {
        return generateObjectButton;
    }

    public void set生成对象Button(JButton 生成对象Button) {
        this.generateObjectButton = 生成对象Button;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }
}
