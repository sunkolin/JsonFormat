package com.starfish.jsonformat.ui;

import cn.hutool.json.JSONUtil;
import com.intellij.json.JsonFileType;
import com.intellij.notification.NotificationDisplayType;
import com.intellij.notification.NotificationGroup;
import com.intellij.notification.NotificationType;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.EditorFactory;
import com.intellij.openapi.ui.popup.BalloonBuilder;
import com.intellij.openapi.ui.popup.JBPopupFactory;
import com.intellij.openapi.util.text.StringUtil;
import com.intellij.ui.EditorTextField;
import com.intellij.ui.JBColor;
import com.starfish.jsonformat.PluginPlus;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

//@Slf4j
public class JsonFormatToolWindow {

    private static final NotificationGroup NOTIFICATION_GROUP = new NotificationGroup("JsonFormatNotificationGroup", NotificationDisplayType.BALLOON, true);

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
        EditorTextField jsonTextArea = jsonFormatForm.getJsonTextArea();
        String text = jsonTextArea.getText();
//        log.info("json={}",text);

        // 格式化json字符串
        try {
            Object object = JSONUtil.parseObj(text);
            text = JSONUtil.toJsonPrettyStr(object);
        } catch (Exception e) {
            showError("字符串有误");
        }

        //  设置新的文本
        Document document = EditorFactory.getInstance().createDocument(StringUtil.convertLineSeparators(text));
        jsonTextArea.setFileType(JsonFileType.INSTANCE);
        jsonTextArea.setDocument(document);
    }

    public static void onCopyJson() {
        // 获取文本内容
        EditorTextField jsonTextArea = jsonFormatForm.getJsonTextArea();
        String text = jsonTextArea.getText();

        // 格式化，hutool
        try {
            Object object = JSONUtil.parseObj(text);
            text = JSONUtil.toJsonPrettyStr(object);
        } catch (Exception e) {
            showError("字符串有误");
        }

        // 设置到剪贴板中
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable transferable = new StringSelection(text);
        clipboard.setContents(transferable, null);
    }

    public static void showTips(String message) {
        JBPopupFactory factory = JBPopupFactory.getInstance();
        BalloonBuilder builder = factory.createHtmlTextBalloonBuilder(message, null, JBColor.RED, null);
        //5秒后隐藏
        //创建气泡
        //显示在下方
        builder.setFadeoutTime(3000)
                .setFillColor(JBColor.RED)
                .createBalloon()
                .showInCenterOf(jsonFormatForm.getMainPanel());
    }

    public static void showError(String message) {
        NOTIFICATION_GROUP.createNotification(message, NotificationType.ERROR).notify(PluginPlus.PROJECT);
    }

}
