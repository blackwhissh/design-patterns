package com.epam.rd.autocode.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ThreeTimesIterator implements Iterator<Integer> {
    private int[] array;
    private int index;
    private int count;

    public ThreeTimesIterator(int[] array) {
        this.array = array;
        this.index = 0;
        this.count = 0;
    }

    @Override
    public boolean hasNext() {
        return count < array.length*3;
    }

    @Override
    public Integer next() {
        if(index + 1 > array.length){
            throw new NoSuchElementException();
        }
        int element = array[index];
        count++;
        if(count % 3 == 0){
            index++;
        }

        return element;
    }
}
