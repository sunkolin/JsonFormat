package com.starfish.jsonformat.ui;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.intellij.json.JsonFileType;
import com.intellij.json.psi.impl.JsonFileImpl;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.EditorFactory;
import com.intellij.openapi.util.text.StringUtil;
import com.intellij.psi.*;
import com.intellij.ui.EditorTextField;
import com.starfish.jsonformat.PluginPlus;

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
        EditorTextField jsonTextArea = jsonFormatForm.getJsonTextArea();
        String text = jsonTextArea.getText();
//        log.info("json={}",text);

        Object object = JSONUtil.parseObj(text);
        text = JSONUtil.toJsonPrettyStr(object);

        //  设置新的文本
//        jsonTextArea.setText(text);
//        Document document = EditorFactory.getInstance().createDocument(StringUtil.convertLineSeparators(text));
//        jsonTextArea.setFileType(JsonFileType.INSTANCE);
//        jsonTextArea.setVisible(true);
//        jsonTextArea.setDocument(document);
//        jsonTextArea.setEnabled(true);

        Editor editor = jsonTextArea.getEditor();
        PsiFile psiFile = PsiDocumentManager.getInstance(PluginPlus.PROJECT).getPsiFile(editor.getDocument());
        PsiElement element = psiFile.findElementAt(editor.getCaretModel().getOffset());
        PsiExpressionCodeFragment psiFileFragment = JavaCodeFragmentFactory.getInstance(PluginPlus.PROJECT).createExpressionCodeFragment(text, element, null, true);
        Document document = PsiDocumentManager.getInstance(PluginPlus.PROJECT).getDocument(psiFileFragment);
        jsonTextArea.setDocument(document);
//        jsonTextArea.setFileType(JsonFileType.INSTANCE);

//        jsonTextArea.setOneLineMode(false);
//        jsonTextArea.setEnabled(true);

//
//        EditorTextField editorTextField = new EditorTextField(document, PluginPlus.PROJECT, JsonFileType.INSTANCE,true,true);
//        jsonFormatForm.setJsonTextArea(editorTextField);
    }

    public static void onCopyJson() {
        // 获取文本内容
        EditorTextField jsonTextArea = jsonFormatForm.getJsonTextArea();
        String text = jsonTextArea.getText();

        // 格式化，hutool
        JSONObject object = JSONUtil.parseObj(text);
        text = JSONUtil.toJsonPrettyStr(object);

        // 设置到剪贴板中
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable transferable = new StringSelection(text);
        clipboard.setContents(transferable, null);
    }

}
