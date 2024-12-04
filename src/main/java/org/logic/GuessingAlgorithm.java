package org.logic;

import static org.gui.GamePanel.hiddenNumberLabel;

public class GuessingAlgorithm {

    private double hiddenValue;
    private double minValue;
    private double maxValue;
    public static int result;

    public double getHiddenValue() {
        return hiddenValue;
    }

    public void setHiddenValue(double hiddenValue) {
        this.hiddenValue = hiddenValue;
    }


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

    public void guessNumber() {
        if (maxValue - minValue % 2 == 0) {
            result = (int) (maxValue - minValue) / 2;
        } else {
            result = (int) Math.ceil((maxValue - minValue) / 2);
        }
        hiddenNumberLabel.setText(Integer.toString(result));
    }

    public int getResult() {
        return result;
    }
}
