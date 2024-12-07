package collectionframework;

import java.util.HashMap;

public class String2 {
    public static void main(String[] args) {
        String str = "i love java programing".toLowerCase();
        char arr[] = str.toCharArray();
        HashMap<Character,Integer>map = new HashMap<>();
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != ' ')
                map.put(arr[i],map.getOrDefault(arr[i],0) + 1);
        }
        map.forEach((key , value) ->{
            if ("agmov".indexOf(key) >= 0)
                System.out.println(key + " " + value);
        });
    }
}
