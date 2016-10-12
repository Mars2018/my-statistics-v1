package com.mars.statisticalutil.view.actionlisteners;

import com.mars.statisticalutil.controller.StatisticController;
import com.mars.statisticalutil.model.StatisticBean;
import com.mars.statisticalutil.view.MyFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

/**
 * Load txt file , and integers in the file are separated by ','
 * Created by RCao on 2016/10/3.
 */
public class FileLoaderActionListener implements ActionListener{

    private File file = null;

    private StatisticBean statisticBean = null;

    private MyFrame mainFrame = null;

    private StatisticController controller = null;

    public FileLoaderActionListener(StatisticBean statisticBean, MyFrame mainFrame, StatisticController controller){
        this.statisticBean = statisticBean;
        this.mainFrame = mainFrame;
        this.controller = controller;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("."));
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        fileChooser.showDialog(new JLabel(), "choose");
        file = fileChooser.getSelectedFile();
        System.out.println(file.getName() + " : " + file.getPath());
        BufferedReader reader = null;
        ArrayList<Integer> data = new ArrayList<>();
        try {
            reader = new BufferedReader(new FileReader(file));
            String string = null;
            int line = 1;
            while ((string = reader.readLine()) != null){
                //integers are separated by ','
                String[] intStringArr = string.split(",");
                for (String s : intStringArr){
                    if (s.trim().length() > 0)
                        data.add(Integer.parseInt(s.trim()));
                }
            }
            //clean data of old statisticBean
            statisticBean.reset();
            //set new data
            statisticBean.setData(data);
            controller.refresh();
            mainFrame.refresh();
        } catch (FileNotFoundException e1) {
            System.out.println("Open File error!");
        } catch (IOException e2) {
            System.out.println("Read file error!");
        }finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e3) {
                    System.out.println("FileReader close error!");
                }
            }
        }
    }
}
