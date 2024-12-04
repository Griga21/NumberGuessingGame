package org.logic;

public class GuessingAlgorithm {
    public double getHiddenValue() {
        return hiddenValue;
    }

    public void setHiddenValue(double hiddenValue) {
        this.hiddenValue = hiddenValue;
    }

    private double hiddenValue;
    private double minValue;
    private double maxValue;
    private int result;

    public double getMinValue() {
        return minValue;
    }

    public void setMinValue(double minValue) {
        this.minValue = minValue;
    }

    public double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(double maxValue) {
        this.maxValue = maxValue;
    }

    public int guessNumber() {
        if (maxValue - minValue % 2 == 0) {
            result = (int) (maxValue - minValue) / 2;
        } else {
            result = (int) Math.ceil((maxValue - minValue) / 2);
        }
        return result;
    }

    public int getResult() {
        return result;
    }
}
