package com.allstate;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

/**
 * Created by localadmin on 03/01/17.
 */

public class MathMethods {

    private int list[];

    public MathMethods(int[] list) {
        this.list = list;
    }

    public OptionalDouble findAverage(){
        return Arrays.stream(this.list).average();
    }

    public int findMedian(){
        Arrays.sort(list);
        return list[list.length/2];
    }

    public int findMode(){
        
        return list[list.length/2];
    }
}
