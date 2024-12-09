package org.logic;

import java.util.ArrayList;

public class GameLogic {
    private int minIndex;
    private int maxIndex;
    private int resultIndex;
    private ArrayList<Integer> arrayList = new ArrayList<>();
    private int sizeArray = 101;

    public void initArrayList() {
        for (int i = 0; i < sizeArray; i++) arrayList.add(i);
        resultIndex = (int) Math.ceil(sizeArray / 2);
    }

    public Integer guessNumber(boolean less) {
        if (less)
            maxIndex = resultIndex;
        else
            minIndex = resultIndex;

        resultIndex = (int) Math.ceil((maxIndex - minIndex) / 2);
        return resultIndex;
    }

}
