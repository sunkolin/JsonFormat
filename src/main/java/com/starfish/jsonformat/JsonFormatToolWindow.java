package com.starfish.jsonformat;

import com.intellij.openapi.wm.ToolWindow;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JsonFormatToolWindow {

//    private JButton hideButton;

    private JTextArea json;

    private JButton formatJsonButton;

    private JButton copyJsonButton;

    private JButton generateModelButton;

    private JButton copyModelButton;

    private JLabel datetimeLabel;

    private JPanel myToolWindowContent;

    public JsonFormatToolWindow(ToolWindow toolWindow) {

        init();

//        hideButton.addActionListener(e -> toolWindow.hide(null));
    }

    private void init() {
        datetimeLabel = new JLabel();
        datetimeLabel.setText(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));

        json = new JTextArea( myToolWindowContent.getHeight() , myToolWindowContent.getWidth());



//        hideButton = new JButton("取消");
        formatJsonButton = new JButton("格式化");
        copyJsonButton = new JButton("复制");
        generateModelButton = new JButton("生成对象");
        copyModelButton = new JButton("复制对象");

        myToolWindowContent = new JPanel();
        myToolWindowContent.add(datetimeLabel);

        myToolWindowContent.add(json);
//        myToolWindowContent.add(hideButton);
        myToolWindowContent.add(formatJsonButton);
        myToolWindowContent.add(copyJsonButton);
        myToolWindowContent.add(generateModelButton);
        myToolWindowContent.add(copyModelButton);


    }

    public JPanel getContent() {
        return myToolWindowContent;
    }

}
