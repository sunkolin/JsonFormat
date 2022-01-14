package com.starfish.jsonformat.service;

import com.intellij.notification.NotificationGroupManager;
import com.intellij.notification.NotificationType;
import com.intellij.openapi.project.Project;
import com.starfish.jsonformat.PluginPlus;

/**
 * NotificationService
 *
 * @author sunkolin
 * @version 1.0.0
 * @since 2021-11-30
 */
public class NotificationService {

    public static void notify(Project project, NotificationType notificationType, String content) {
        NotificationGroupManager.getInstance()
                .getNotificationGroup("JsonFormatNotificationGroup")
                .createNotification(content, notificationType)
                .notify(project);
    }

    public static void error(String content) {
        notify(PluginPlus.PROJECT, NotificationType.ERROR, content);
    }

}
