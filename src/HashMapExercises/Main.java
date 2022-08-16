package HashMapExercises;

import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        //Task1
        System.out.println("Task1");
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "White");
        hashMap.put(2, "Black");
        hashMap.put(3, "Red");
        hashMap.put(4, "Blue");
        hashMap.put(5, "Yellow");
        System.out.println(hashMap);

        //Task2
        System.out.println("Task2");
        System.out.println(hashMap.size());

        //Task3
        System.out.println("Task3");
        HashMap<Integer, String> hashMap2 = new HashMap<>();
        hashMap2.put(6, "Green");
        hashMap2.put(7, "Brown");
        hashMap2.put(8, "Pink");
        hashMap2.put(9, "Purple");
        hashMap2.put(10, "Cyan");
        hashMap.putAll(hashMap2);
        System.out.println(hashMap);

        //Task4
        System.out.println("Task4");
        hashMap2.clear();
        System.out.println(hashMap2);

        //Task5
        System.out.println("Task5");
        if (hashMap.isEmpty()) {
            System.out.println("HashMap is empty");
        } else {
            System.out.println("HashMap is not empty");
        }

        //Task6
        System.out.println("Task6");
        HashMap<Integer, String> newHashMap = new HashMap<Integer, String>();
        newHashMap = (HashMap) hashMap.clone();
        System.out.println(newHashMap);

        //Task7
        System.out.println("Task7");
        Integer specKey = 5;
        if (hashMap.containsKey(specKey)) {
            System.out.println("HashMap with specKey " + specKey + " have value: " + hashMap.get(specKey));
        } else {
            System.out.println("HashMap haven't specKey " + specKey);
        }

        //Task8
        System.out.println("Task8");
        String value = "Blue";
        if (hashMap.containsValue(value)) {
            System.out.println("HashMap have value " + value);
        } else {
            System.out.println("HashMap haven't value " + value);
        }

        //Task9
        System.out.println("Task9");
        Set set = hashMap.entrySet();
        System.out.println(set);

        //Task10
        System.out.println("Task10");
        String val = hashMap.get(5);
        System.out.println("Value" + val);

        //Task11
        System.out.println("Task11");
        Set set1 = hashMap.keySet();
        System.out.println("Set of keys: " + set1);

        //Task12
        System.out.println("Task");
        System.out.println("Collections of values: " + hashMap.values());
    }
}
