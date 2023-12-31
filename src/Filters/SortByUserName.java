package Filters;

import java.util.Comparator;
import java.util.Map;

public class SortByUserName implements Comparator<Map.Entry<String, Integer>> {
    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        return o1.getKey().compareTo(o2.getKey());
    }
}
