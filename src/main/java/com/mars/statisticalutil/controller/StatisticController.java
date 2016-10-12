package com.mars.statisticalutil.controller;

import com.mars.statisticalutil.model.StatisticBean;

/**
 * Controller to finish statistical analysis
 * Created by Mar Wang on 2016/10/3.
 */
public class StatisticController {

    private StatisticBean statisticBean = null;

    public StatisticController(StatisticBean statisticBean){
        this.statisticBean = statisticBean;
    }

    /**
     * add an element to data array
     * set sorted flag to false
     * @param element
     */
    public void addElement(Integer element){
        statisticBean.addElement(element);
        this.refresh();
    }

    /**
     * get median of data array.
     * There are two situations : array size is odd or even
     * @return
     */
    private void setMedian(){
        int num = statisticBean.getNum();
        if (num % 2 == 1){
            statisticBean.setMedian(Double.valueOf(statisticBean.getSortedData().get(num/2)));
        }else {
            int left = statisticBean.getSortedData().get(num/2-1);
            int right = statisticBean.getSortedData().get(num/2);
            statisticBean.setMedian((double) ((left + right) / 2));
        }
    }

    /**
     * Get mean of the data
     */
    private void setMean(){
        int sum = 0;
        for (Integer i : statisticBean.getSortedData())
            sum += i;
        statisticBean.setMean ((double)sum / (double)statisticBean.getNum());
    }

    /**
     * Get maximum element of the array
     */
    private void setMaxElement(){
        int num = statisticBean.getNum();
        //the last one of ascendingly sorted array is the max
        statisticBean.setMaxVal(statisticBean.getSortedData().get(num-1));
    }

    /**
     * Get minimum element of array
     */
    private void setMinElement(){
        //the first one of ascendingly sorted array is the minimum
        statisticBean.setMinVal(statisticBean.getSortedData().get(0));
    }

    public void reset(){
        statisticBean.reset();
    }

    public void refresh(){
        this.setMedian();
        this.setMean();
        this.setMaxElement();
        this.setMinElement();
    }

}
