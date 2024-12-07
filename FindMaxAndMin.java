package collectionframework;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMaxAndMin {
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(10,20,30,40,1,80,50);
        int max = Collections.max(list);
        int min = Collections.min(list);
        System.out.println(max + " " + min);
    }
}
