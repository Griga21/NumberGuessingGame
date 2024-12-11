package org.logic;

import java.util.ArrayList;

public class GameLogic {
    private int minIndex;
    private int maxIndex;
    private int resultIndex;
    private ArrayList<Integer> arrayList = new ArrayList<>();
    private int sizeArray = 101;

    public void setMinIndex(int minIndex) {
        this.minIndex = minIndex;
    }

    public void setMaxIndex(int maxIndex) {
        this.maxIndex = maxIndex;
    }

    public void setResultIndex(int resultIndex) {
        this.resultIndex = resultIndex;
    }

    public int getResultIndex() {
        return resultIndex;
    }

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    public void initArrayList() {
        for (int i = 0; i < sizeArray; i++) arrayList.add(i);
        resultIndex = (int) Math.ceil(sizeArray / 2);
        maxIndex = sizeArray - 1;
    }

    public Integer guessNumber(boolean less) {
        if (less)
            maxIndex = resultIndex;
        else
            minIndex = resultIndex;

        resultIndex = (int) Math.ceil((maxIndex - minIndex) / 2) + minIndex;
        return resultIndex;
    }

}
