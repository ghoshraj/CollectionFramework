package collectionframework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Check_if_a_List_is_a_Subset_of_Another_List {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(2, 4);
        Set<Integer>s1 = new HashSet<>(list1);
        Set<Integer>s2 = new HashSet<>(list2);
        System.out.println(s1.containsAll(s2));
    }
}
