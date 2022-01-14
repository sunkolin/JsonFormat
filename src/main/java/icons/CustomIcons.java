package icons;

import com.intellij.icons.AllIcons;
import com.intellij.openapi.util.IconLoader;

import javax.swing.*;

/**
 * CustomIcons
 *
 * @author sunkolin
 * @version 1.0.0
 * @since 2021-11-30
 */
public interface CustomIcons {

    Icon TOOL_WINDOW_ICON = IconLoader.getIcon("/icons/toolWindowIcon.png", CustomIcons.class);

    Icon COLOR_ICON = AllIcons.Actions.Colors;

    Icon JSON_ICON = AllIcons.Toolwindows.ToolWindowJsonPath;

}
