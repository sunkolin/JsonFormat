package com.starfish.jsonformat;

import com.intellij.openapi.wm.ToolWindow;
import com.intellij.ui.components.JBScrollPane;
import com.starfish.jsonformat.form.JsonFormatForm;

import javax.swing.*;
import java.awt.*;

public class JsonFormatToolWindow {

    private JsonFormatForm jsonFormatForm;

    public JComponent getComponent() {
        jsonFormatForm = new JsonFormatForm();
        return jsonFormatForm.getMainPanel();
    }

}
