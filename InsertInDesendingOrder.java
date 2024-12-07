package collectionframework;

import java.util.Comparator;
import java.util.TreeSet;

class mycomparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;
        //1st approach
     /*   if (i1 > i2)
            return -1;
        else if (i1 < i2)
            return 1;
        else
           return 0;
      */
        //2nd approach
        return -i1.compareTo(i2);
    }
}
public class InsertInDesendingOrder {
    public static void main(String[] args) {
        int arr[] = {1, 2, 10 , 9 , 4, 8 , 5 , 1 ,0 , 1, 2, 3, 4,9};
        TreeSet<Integer>t = new TreeSet<>(new mycomparator());
        for (int i = 0 ; i < arr.length; i++){
            t.add(arr[i]);
        }
        System.out.println(t);
    }
}
