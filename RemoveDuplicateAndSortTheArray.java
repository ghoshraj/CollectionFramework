package collectionframework;

import java.util.Comparator;
import java.util.TreeSet;

public class RemoveDuplicateAndSortTheArray {
    public static void main(String[] args) {
        int arr[] = {10 , 20 , 30 , 40 , 10 , 20 , 5, 1, 1, 3 , 4, 9 , 7 ,4};

        //print in ascending order
        TreeSet<Integer> s = new TreeSet<>();
        for (int i = 0 ; i < arr.length; i++){
            s.add(arr[i]);
        }
        System.out.println(s);
        System.out.println("_________________________________");
        System.out.println("_________________________________");

        //print in descending order
        TreeSet<Integer> s1 = new TreeSet<>(Comparator.reverseOrder());
        for (int i = 0; i < arr.length; i++){
            s1.add(arr[i]);
        }
        System.out.println(s1);
    }
}
