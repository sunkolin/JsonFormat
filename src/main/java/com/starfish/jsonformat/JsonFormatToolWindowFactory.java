package com.starfish.jsonformat;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import com.starfish.jsonformat.ui.JsonFormatToolWindow;
import org.jetbrains.annotations.NotNull;

public class JsonFormatToolWindowFactory implements ToolWindowFactory {

    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();

//        JsonFormatToolWindow jsonFormatToolWindow = new JsonFormatToolWindow(toolWindow);
//        Content content = contentFactory.createContent(jsonFormatToolWindow.getContent(), "", false);
//        toolWindow.getContentManager().addContent(content);
        PluginPlus.PROJECT = project;
        PluginPlus.TOOL_WINDOW = toolWindow;

        Content content = contentFactory.createContent(JsonFormatToolWindow.getComponent(), "", false);
        toolWindow.getContentManager().addContent(content);
    }

//    @Override
//    public boolean value(Project project) {
//        return true;
//    }

}
