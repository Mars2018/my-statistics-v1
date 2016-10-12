package com.mars.statisticalutil.view.actionlisteners;

import com.mars.statisticalutil.controller.StatisticController;
import com.mars.statisticalutil.view.MyFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * this is for the reset .
 * reset data and mainframe
 * Created by MarsWang on 2016/10/5.
 */
public class ResetActionListener implements ActionListener{

    private StatisticController controller = null;

    private MyFrame mainFrame = null;

    public ResetActionListener(StatisticController controller, MyFrame mainFrame){
        this.controller  = controller;
        this.mainFrame = mainFrame;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        controller.reset();
        mainFrame.reset();
    }
}
