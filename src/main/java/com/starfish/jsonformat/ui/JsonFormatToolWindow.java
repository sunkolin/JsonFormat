package com.starfish.jsonformat.ui;


import cn.hutool.json.JSONUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

//@Slf4j
public class JsonFormatToolWindow {

    private static JsonFormatForm jsonFormatForm;

    public static JComponent getComponent() {
        jsonFormatForm = new JsonFormatForm();

        addListener();

        return jsonFormatForm.getMainPanel();
    }

    public static void addListener() {
        // 给格式化按钮加上监听器
        JButton formatJsonButton = jsonFormatForm.getFormatJsonButton();
        formatJsonButton.addActionListener(e -> onFormatJson());

        // 给复制按钮加上监听器
        JButton copyJsonButton = jsonFormatForm.getCopyJsonButton();
        copyJsonButton.addActionListener(e -> onCopyJson());
    }

    public static void onFormatJson() {
        JTextArea jsonTextArea = jsonFormatForm.getJsonTextArea();
        String text = jsonTextArea.getText();
//        log.info("json={}",text);

        Object object = JSONUtil.parseObj(text);
        text = JSONUtil.toJsonPrettyStr(object);

        //  设置新的文本
        jsonTextArea.setText(text);
    }

    public static void onCopyJson() {
        // 获取文本内容
        JTextArea jsonTextArea = jsonFormatForm.getJsonTextArea();
        String text = jsonTextArea.getText();

        // 格式化
        Object object = JSONUtil.parseObj(text);
        text = JSONUtil.toJsonPrettyStr(object);
//        jsonTextArea.setFont(new Font());
        // 设置字体颜色
        jsonTextArea.setForeground(Color.RED);

        // 设置选中的文本的背景颜色
        jsonTextArea.setSelectionColor(Color.GREEN);
        // 设置光标的颜色
        jsonTextArea.setCaretColor(Color.BLACK);

        // 设置选中的文本的字体颜色
        jsonTextArea.setSelectedTextColor(Color.BLUE);

        // 设置到剪贴板中
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable transferable = new StringSelection(text);
        clipboard.setContents(transferable, null);
    }

}
