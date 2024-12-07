package collectionframework;

import java.util.*;

public class OccuranceOfEachElement {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "apple", "orange", "banana", "banana");

        Map<String, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < fruits.size(); i++){
            String fruit = fruits.get(i);
            frequencyMap.put(fruit,frequencyMap.getOrDefault(fruit,0) + 1);
        }
        System.out.println(frequencyMap);
    }
}
