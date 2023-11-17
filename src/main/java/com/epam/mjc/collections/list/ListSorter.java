package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        if (functionResult(a) - functionResult(b) == 0) {
            return Integer.parseInt(a) - Integer.parseInt(b);
        }
        return functionResult(a) - functionResult(b);
    }
    private int functionResult(String xValue){
        int xVal = Integer.parseInt(xValue);
        return 5 * (xVal * xVal) + 3;
    }
}
