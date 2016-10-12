package com.mars.statisticalutil.view.actionlisteners;

import com.mars.statisticalutil.controller.StatisticController;
import com.mars.statisticalutil.view.MyFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * the action listerner is for adding-element button.
 * read txt from textfile component, add to data list, refresh mainframe
 * Created by MarsWang on 2016/10/5.
 */
public class AddElementActionListener implements ActionListener {
    private StatisticController controller = null;

    private MyFrame mainFrame = null;

    public AddElementActionListener(StatisticController controller, MyFrame mainFrame){
        this.controller = controller;
        this.mainFrame = mainFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Integer element = Integer.parseInt(mainFrame.getJtfData().getText());
        mainFrame.getJtfData().setText("");
        if (element != null) {
            controller.addElement(element);
            mainFrame.refresh();
        }
    }
}
