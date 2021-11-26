package com.starfish.jsonformat;

import com.intellij.openapi.wm.ToolWindow;
import com.intellij.ui.components.JBScrollPane;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JsonFormatToolWindow {

//    private JButton hideButton;

    private JPanel panel;

    private JPanel topPanel;

    private JPanel bottomPanel;

    private JTextArea json;

    private JButton formatJsonButton;

    private JButton copyJsonButton;

    private JButton generateModelButton;

    private JButton copyModelButton;

    private ToolWindow toolWindow;

    public JsonFormatToolWindow(ToolWindow toolWindow) {
        init();
        int width = toolWindow.getComponent().getWidth();
        int height = toolWindow.getComponent().getHeight();
//        hideButton.addActionListener(e -> toolWindow.hide(null));
        this.toolWindow = toolWindow;
        System.out.println("toolwindow width=" + width);
        System.out.println("toolwindow height=" + height);
    }

    /**
     * 初始化
     */
    private void init() {
        this.initTopPanel();
        this.initBottomPanel();
        this.initPanel();
    }

    public JPanel getContent() {
        return panel;
    }

    public void initPanel() {
        panel = new JPanel();
        panel.add(topPanel);
        panel.add(bottomPanel);
    }

    /**
     * 顶部面板
     */
    public void initTopPanel() {
        topPanel = new JPanel();

        json = new JTextArea();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) (dimension.getWidth() / 4);
        int height = (int) (dimension.getHeight() - 100);
        Dimension preferredSize = new Dimension(width, height);
        json.setSize(preferredSize);
        json.setPreferredSize(preferredSize);

        JBScrollPane scrollPane = new JBScrollPane(json);
        scrollPane.setVisible(true);
        topPanel.add(scrollPane);
    }

    /**
     * 底部面板
     */
    public void initBottomPanel() {
        bottomPanel = new JPanel();

//        hideButton = new JButton("取消");
        formatJsonButton = new JButton("格式化");
        copyJsonButton = new JButton("复制");
        generateModelButton = new JButton("生成对象");
        copyModelButton = new JButton("复制对象");

        bottomPanel.add(formatJsonButton);
        bottomPanel.add(copyJsonButton);
        bottomPanel.add(generateModelButton);
        bottomPanel.add(copyModelButton);
    }

}
