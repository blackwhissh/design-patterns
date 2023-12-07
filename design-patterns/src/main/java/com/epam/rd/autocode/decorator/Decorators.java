package com.epam.rd.autocode.decorator;

import java.util.ArrayList;
import java.util.List;

public class Decorators {
    public static void main(String[] args){
        List<String> sourceList = new ArrayList<>();
        sourceList.add("b");
        sourceList.add("b");
        sourceList.add("b");
        sourceList.add("b");
        sourceList.add("b");

        EvenList evenList = new EvenList(sourceList);
        evenList.size();
    }
    public static List<String> evenIndexElementsSubList(List<String> sourceList) {
        return new EvenList<>(sourceList).getEven();
    }

}
