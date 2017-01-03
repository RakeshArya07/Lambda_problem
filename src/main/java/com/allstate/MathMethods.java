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
//      System.out.println("here"+Arrays.stream(this.list).sorted());
        int size = (int) Arrays.stream(this.list).sorted().count()/2;
        System.out.println(size);
        return 10;
    }
}
