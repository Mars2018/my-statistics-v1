package com.mars.statisticalutil.model;

import java.util.ArrayList;
import java.util.Collections;

/**
 * statistic bean, store the data and defined statistical variables
 * Created by Mars Wang on 2016/10/3.
 */
public class StatisticBean {
    //store data array to handle
    private  ArrayList<Integer> data = new ArrayList<>();
    //store sorted data
    private  ArrayList<Integer> sortedData = new ArrayList<>();
    //data array size
    private Integer num = 0;
    //median
    private Double median = null;
    //mean
    private Double mean = null;
    //max value
    private Integer maxVal = null;
    //min
    private Integer minVal = null;

    public StatisticBean(){ }

    public ArrayList<Integer> getData() {
        return data;
    }

    public void setData(ArrayList<Integer> data) {
        this.data = data;
        this.setSortedData(data);
        this.num = data.size();
    }

    /**
     * Add a new element to array and keep new sortedData is sorted,
     * and size of array should be added  1
     * @param element
     */
    public void addElement(Integer element){
        this.data.add(element);
        this.sortedData.add(element);
        //default order is ascending
        Collections.sort(this.sortedData);
        num++;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public ArrayList<Integer> getSortedData() {
        return sortedData;
    }

    public void setSortedData(ArrayList<Integer> sortedData) {
        this.sortedData.addAll(sortedData);
        Collections.sort(this.sortedData);
    }

    public Integer getMaxVal() {
        return maxVal;
    }

    public void setMaxVal(Integer maxVal) {
        this.maxVal = maxVal;
    }

    public Double getMean() {
        return mean;
    }

    public void setMean(Double mean) {
        this.mean = mean;
    }

    public Double getMedian() {
        return median;
    }

    public void setMedian(Double median) {
        this.median = median;
    }

    public Integer getMinVal() {
        return minVal;
    }

    public void setMinVal(Integer minVal) {
        this.minVal = minVal;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public void reset(){
        this.data.clear();
        this.sortedData.clear();
        this.num = 0;
        this.median = null;
        this.mean = null;
        this.maxVal = null;
        this.minVal = null;
    }
}
