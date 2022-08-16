package TreeMapExercises;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        //Task1
        System.out.println("Task1");
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "White");
        treeMap.put(2, "Black");
        treeMap.put(3, "Red");
        treeMap.put(4, "Blue");
        treeMap.put(5, "Yellow");
        System.out.println(treeMap);

        //Task2
        System.out.println("Task2");
        TreeMap<Integer, String> treeMap2 = new TreeMap<>();
        treeMap2.put(6, "Purple");
        treeMap2.put(7, "Orange");
        treeMap.putAll(treeMap2);
        System.out.println(treeMap);

        //Task3
        System.out.println("Task3");
        if (treeMap.containsKey(1)) {
            System.out.println("TreeMap contains key 1");
        } else {
            System.out.println("TreeMap does not contain key 1");
        }

        //Task4
        System.out.println("Task4");
        if (treeMap.containsValue("White")) {
            System.out.println("The TreeMap contains value White");
        } else {
            System.out.println("The TreeMap does not contain value White");
        }

        //Task5
        System.out.println("Task5");
        Set<Integer> keys = treeMap.keySet();
        System.out.print("KeySet: ");
        for (Integer key : keys) {
            System.out.print(key + " ");
        }

        //Task6
        System.out.println("Task6");
        treeMap2.clear();
        System.out.println(treeMap2);

        //Task7
        System.out.println("Task7");
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        TreeMap<Integer, String> sortTree = new TreeMap<>(comparator);
        sortTree.put(5, "White");
        sortTree.put(2, "Black");
        sortTree.put(1, "Red");
        sortTree.put(4, "Blue");
        sortTree.put(3, "Yellow");
        System.out.println(sortTree);

        //Task8
        System.out.println("Task8");
        System.out.println(treeMap);
        System.out.println("First key: " + treeMap.firstEntry());
        System.out.println("Last key: " + treeMap.lastEntry());

        //Task9
        System.out.println("Task9");
        System.out.println("Task8");
        System.out.println(treeMap);
        System.out.println("First key: " + treeMap.firstKey());
        System.out.println("Last key: " + treeMap.lastKey());

        //Task10
        System.out.println("Task10");
        System.out.println(treeMap.descendingKeySet());

        //Task11
        System.out.println("Task11");
        System.out.println(treeMap.floorEntry(15));

        //Task12
        System.out.println("Task12");
        System.out.println(treeMap.floorKey(12));

        //Task13
        System.out.println("Task13");
        System.out.println(treeMap.headMap(5));

        //Task14
        System.out.println("Task14");
        System.out.println(treeMap.headMap(5, true));

        //Task15
        System.out.println("Task15");
        System.out.println(treeMap.higherEntry(3));

        //Task16
        System.out.println("Task16");
        System.out.println(treeMap.lowerEntry(3));

        //Task17
        System.out.println("Task17");
        System.out.println(treeMap.lowerKey(5));

        //Task18
        System.out.println("Task18");
        System.out.println(treeMap.navigableKeySet());

        //Task19
        System.out.println("Task19");
        System.out.println(treeMap.pollFirstEntry());

        //Task20
        System.out.println("Task20");
        System.out.println(treeMap.pollLastEntry());

        //Task21
        System.out.println("Task21");
        SortedMap<Integer, String> anotherTree = new TreeMap<>();
        anotherTree = treeMap.subMap(2, 5);
        System.out.println(anotherTree);

        //Task22
        System.out.println("Task22");
        SortedMap<Integer, String> anotherTree2 = new TreeMap<>();
        anotherTree2 = treeMap.subMap(2, true, 5, true);
        System.out.println(anotherTree2);
        //Task23
        System.out.println("Task23");
        System.out.println(treeMap.tailMap(3));

        //Task24
        System.out.println("Task24");
        System.out.println(treeMap.tailMap(3, false));

        //Task25
        System.out.println("Task25");
        System.out.println(treeMap.ceilingEntry(4));

        //Task26
        System.out.println("Task26");
        System.out.println(treeMap.ceilingKey(4));


    }
}
