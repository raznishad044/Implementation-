package Arrays;

import java.util.Comparator;

public class SortingUsingComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        System.out.println("Removed Redundant");
        return o2.compareTo(o1);
    }
}
