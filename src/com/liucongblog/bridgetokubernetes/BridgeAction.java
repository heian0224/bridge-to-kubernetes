package com.liucongblog.bridgetokubernetes;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;

public class BridgeAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {
        // TODO: insert action logic here
        Project project=anActionEvent.getData(PlatformDataKeys.PROJECT);
        String title="tilte";
        String message="test";
        Messages.showMessageDialog(project,message,title, Messages.getInformationIcon());
    }
}
