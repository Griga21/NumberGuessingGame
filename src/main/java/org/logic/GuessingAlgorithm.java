package org.logic;

import java.util.ArrayList;

public class GuessingAlgorithm {

    private double hiddenValue;
    private int lessIndex;
    private int biggerIndex;
    private double minValue;
    private double maxValue;
    private int resultIndex;
    private ArrayList<Integer> arrayList = new ArrayList<>();

    public void setHiddenValue(double hiddenValue) {
        this.hiddenValue = hiddenValue;
    }


    public void setMinValue(double minValue) {
        this.minValue = minValue;
    }


    public void setMaxValue(double maxValue) {
        this.maxValue = maxValue;
    }

    public void initArrayList() {
        for (int i = (int) minValue; i < maxValue; i++)
            arrayList.add(i);
        biggerIndex = arrayList.size();
    }

    public void guessNumber(boolean option) {
        if (option) {
            lessIndex += (biggerIndex - lessIndex) / 2;
        } else {
            biggerIndex -= (biggerIndex - lessIndex) / 2;
        }
    }

    public int getResultIndex() {
        return resultIndex;
    }
}
