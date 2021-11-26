package com.starfish.jsonformat;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.Condition;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import com.starfish.jsonformat.form.JsonFormatForm;
import org.jetbrains.annotations.NotNull;

public class JsonFormatToolWindowFactory implements ToolWindowFactory , Condition<Project> {

    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();

//        JsonFormatToolWindow jsonFormatToolWindow = new JsonFormatToolWindow(toolWindow);
//        Content content = contentFactory.createContent(jsonFormatToolWindow.getContent(), "", false);
//        toolWindow.getContentManager().addContent(content);

        Content content = contentFactory.createContent(new JsonFormatForm().getMainPanel(), "", false);
        toolWindow.getContentManager().addContent(content);
    }

    @Override
    public boolean value(Project project) {
        return true;
    }

}
