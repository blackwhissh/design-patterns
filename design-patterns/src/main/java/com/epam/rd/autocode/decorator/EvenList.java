package com.epam.rd.autocode.decorator;

import java.util.ArrayList;
import java.util.List;

public class EvenList<T> implements EvenListDecorator{
    private List<T> sourceList;
    private List<T> even;
    private int index;

    public EvenList(List<T> sourceList) {
        this.sourceList = sourceList;
    }

    public List<T> getSourceList() {
        return sourceList;
    }

    public void setSourceList(List<T> sourceList) {
        this.sourceList = sourceList;
    }

    public List<T> getEven() {
        even = new ArrayList<>();
        while(index < sourceList.size()){
            even.add(sourceList.get(index));
            iterator();
        }
        return even;
    }

    public void setEven(List<T> even) {
        this.even = even;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String get(int index) {
        return String.valueOf(sourceList.get(index));
    }

    @Override
    public int size() {
        getEven();
        System.out.println(even.size());
        return 0;
    }

    @Override
    public int iterator() {
        index += 2;
        return index;
    }
}
