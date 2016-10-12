package com.mars.statisticalutil.view;

import com.mars.statisticalutil.model.StatisticBean;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

/**
 * main frame
 * Created by RCao on 2016/10/3.
 */
public class MyFrame extends JFrame{
    //main frame size
    private static final int FRAME_WIDTH = 800;
    private static final int FRAME_HEIGHT = 500;

    //data
    StatisticBean statisticBean = null;

    //input and operation panel
    private JPanel jpInput = null;
    //input text field
    private JTextField jtfData = null;
    //add number button
    private JButton jbAdd = null;
    //read data from file button
    private JButton jbFile = null;
    //reset button
    private JButton jbReset = null;

    //stats panel
    private JPanel jpStats = null;
    //count data size
    private JLabel jlCount = null;
    private JTextField jtfCount = null;
    //median of data
    private JLabel jlMedian = null;
    private JTextField jtfMedian = null;
    //mean of data
    private JLabel jlMean = null;
    private JTextField jtfMean = null;
    //max of data
    private JLabel jlMax = null;
    private JTextField jtfMaxVal = null;
    //min of data
    private JLabel jlMin = null;
    private JTextField jtfMinVal = null;

    //text area to show data
    private JPanel jpData = null;
    private JTextArea jtaData = null;

    public MyFrame(String name) {
        super(name);
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(MyFrame.DISPOSE_ON_CLOSE);

        /**
         * input and operation panel
         */
        jpInput = new JPanel(new FlowLayout(FlowLayout.CENTER));
        //input text field
        jtfData = new JTextField(5);
        //add number button
        jbAdd = new JButton("Add Number");
        //read data from file button
        jbFile = new JButton("Open");
        //reset button
        jbReset = new JButton("Reset");

        jpInput.add(jtfData);
        jpInput.add(jbAdd);
        jpInput.add(jbFile);
        jpInput.add(jbReset);

        this.getContentPane().add(jpInput, BorderLayout.NORTH);

        /**
         * stats panel
         */
        jpStats = new JPanel(new FlowLayout(FlowLayout.CENTER));
        //count data size
        jlCount = new JLabel("Numbers:");
        jtfCount = new JTextField(5);
        jtfCount.setEditable(false);
        //median of data
        jlMedian = new JLabel("Median:");
        jtfMedian = new JTextField(5);
        jtfMedian.setEditable(false);
        //mean of data
        jlMean = new JLabel("Mean:");
        jtfMean = new JTextField(5);
        jtfMean.setEditable(false);
        //max of data
        jlMax = new JLabel("Max data:");
        jtfMaxVal = new JTextField(5);
        jtfMaxVal.setEditable(false);
        //min of data
        jlMin = new JLabel("Min data:");
        jtfMinVal = new JTextField(5);
        jtfMinVal.setEditable(false);

        jpStats.add(jlCount);
        jpStats.add(jtfCount);
        jpStats.add(jlMedian);
        jpStats.add(jtfMedian);
        jpStats.add(jlMean);
        jpStats.add(jtfMean);
        jpStats.add(jlMax);
        jpStats.add(jtfMaxVal);
        jpStats.add(jlMin);
        jpStats.add(jtfMinVal);

        this.getContentPane().add(jpStats, BorderLayout.CENTER);


        /**
         * data panel
         */
        jpData = new JPanel(new FlowLayout(FlowLayout.CENTER));
        jtaData = new JTextArea(10, 50);
        jtaData.setEditable(false);
        jpData.add(jtaData);

        this.getContentPane().add(jpData, BorderLayout.SOUTH);
    }

    public JButton getJbAdd() {
        return jbAdd;
    }

    public void setJbAdd(JButton jbAdd) {
        this.jbAdd = jbAdd;
    }

    public JButton getJbFile() {
        return jbFile;
    }

    public void setJbFile(JButton jbFile) {
        this.jbFile = jbFile;
    }

    public JButton getJbReset() {
        return jbReset;
    }

    public void setJbReset(JButton jbReset) {
        this.jbReset = jbReset;
    }

    public JLabel getJlCount() {
        return jlCount;
    }

    public void setJlCount(JLabel jlCount) {
        this.jlCount = jlCount;
    }

    public JLabel getJlMax() {
        return jlMax;
    }

    public void setJlMax(JLabel jlMax) {
        this.jlMax = jlMax;
    }

    public JLabel getJlMean() {
        return jlMean;
    }

    public void setJlMean(JLabel jlMean) {
        this.jlMean = jlMean;
    }

    public JLabel getJlMedian() {
        return jlMedian;
    }

    public void setJlMedian(JLabel jlMedian) {
        this.jlMedian = jlMedian;
    }

    public JLabel getJlMin() {
        return jlMin;
    }

    public void setJlMin(JLabel jlMin) {
        this.jlMin = jlMin;
    }

    public JPanel getJpData() {
        return jpData;
    }

    public void setJpData(JPanel jpData) {
        this.jpData = jpData;
    }

    public JPanel getJpInput() {
        return jpInput;
    }

    public void setJpInput(JPanel jpInput) {
        this.jpInput = jpInput;
    }

    public JPanel getJpStats() {
        return jpStats;
    }

    public void setJpStats(JPanel jpStats) {
        this.jpStats = jpStats;
    }

    public JTextArea getJtaData() {
        return jtaData;
    }

    public void setJtaData(JTextArea jtaData) {
        this.jtaData = jtaData;
    }

    public JTextField getJtfCount() {
        return jtfCount;
    }

    public void setJtfCount(JTextField jtfCount) {
        this.jtfCount = jtfCount;
    }

    public JTextField getJtfData() {
        return jtfData;
    }

    public void setJtfData(JTextField jtfData) {
        this.jtfData = jtfData;
    }

    public JTextField getJtfMaxVal() {
        return jtfMaxVal;
    }

    public void setJtfMaxVal(JTextField jtfMaxVal) {
        this.jtfMaxVal = jtfMaxVal;
    }

    public JTextField getJtfMean() {
        return jtfMean;
    }

    public void setJtfMean(JTextField jtfMean) {
        this.jtfMean = jtfMean;
    }

    public JTextField getJtfMedian() {
        return jtfMedian;
    }

    public void setJtfMedian(JTextField jtfMedian) {
        this.jtfMedian = jtfMedian;
    }

    public JTextField getJtfMinVal() {
        return jtfMinVal;
    }

    public void setJtfMinVal(JTextField jtfMinVal) {
        this.jtfMinVal = jtfMinVal;
    }

    public StatisticBean getStatisticBean() {
        return statisticBean;
    }

    public void setStatisticBean(StatisticBean statisticBean) {
        this.statisticBean = statisticBean;
    }

    /**
     * refresh mainframe to display new data and statistical results
     */
    public void refresh(){
        //set double format, reserve two decimal fractions
        DecimalFormat dcmFmt = new DecimalFormat("0.00");
        jtfCount.setText(String.valueOf(statisticBean.getNum()));
        jtfMedian.setText(String.valueOf(dcmFmt.format(statisticBean.getMedian())));
        jtfMean.setText(String.valueOf(dcmFmt.format(statisticBean.getMean())));
        jtfMaxVal.setText(String.valueOf(dcmFmt.format(statisticBean.getMaxVal())));
        jtfMinVal.setText(String.valueOf(dcmFmt.format(statisticBean.getMinVal())));
        String arr = "";
        for (int i = 0; i < statisticBean.getData().size() - 1; ++i)
            arr += statisticBean.getData().get(i) + ", ";
        if (statisticBean.getData().size() > 0)
            arr += statisticBean.getData().get(statisticBean.getData().size()-1);
        jtaData.setText(arr);
    }

    public void reset(){
        jtaData.setText("");
        jtfCount.setText("0");
        jtfMedian.setText("");
        jtfMean.setText("");
        jtfMaxVal.setText("");
        jtfMinVal.setText("");
        statisticBean.reset();
    }


}
