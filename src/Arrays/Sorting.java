package Arrays;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {

        int[] a = {1, 3, 95, 100, 5, 9, 10, 40};
        String[] s = {"Raj", "Ravi", "Pawan", "Sandhya", "Shrawan"};

        System.out.println(" Primitive Array elements before sorting ");
        for (int a1 : a) {
            System.out.println(" This is unsorted elements\n" + a1);

        }
        Arrays.sort(a);
        System.out.println("primitive Array element after sorting ");
        for (int a1 : a) {
            System.out.println("This is sorted elements \n" + a1);
        }
        System.out.println("============Object Array==================");

        System.out.println("Object Array before sorting ");
        for (String s1 : s) {
            System.out.println(s1);

        }

        Arrays.sort(s);
        System.out.println("Object Array after Sorting");
        for (String s1 : s) {
            System.out.println(s1);
        }

        Arrays.sort(s, new SortingUsingComparator());
        System.out.println("Object Array After Sorting using Comparator");
        for (String a1 : s) {
            System.out.println(a1);
        }

    }
}
