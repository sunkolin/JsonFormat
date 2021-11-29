package com.starfish.jsonformat.ui;

import javax.swing.*;

public class JsonFormatForm {

    private JTextPane jsonTextArea;
    private JButton formatJsonButton;
    private JButton copyObjectButton;
    private JButton copyJsonButton;
    private JButton generateObjectButton;
    private JPanel mainPanel;
    private JScrollPane scrollPanel;

    public JTextPane getJsonTextArea() {
        return jsonTextArea;
    }

    public void setJsonTextArea(JTextPane jsonTextArea) {
        this.jsonTextArea = jsonTextArea;
    }

    public JButton getFormatJsonButton() {
        return formatJsonButton;
    }

    public void setFormatJsonButton(JButton formatJsonButton) {
        this.formatJsonButton = formatJsonButton;
    }

    public JButton getCopyObjectButton() {
        return copyObjectButton;
    }

    public void setCopyObjectButton(JButton copyObjectButton) {
        this.copyObjectButton = copyObjectButton;
    }

    public JButton getCopyJsonButton() {
        return copyJsonButton;
    }

    public void setCopyJsonButton(JButton copyJsonButton) {
        this.copyJsonButton = copyJsonButton;
    }

    public JButton getGenerateObjectButton() {
        return generateObjectButton;
    }

    public void setGenerateObjectButton(JButton generateObjectButton) {
        this.generateObjectButton = generateObjectButton;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    public JScrollPane getScrollPanel() {
        return scrollPanel;
    }

    public void setScrollPanel(JScrollPane scrollPanel) {
        this.scrollPanel = scrollPanel;
    }

}
