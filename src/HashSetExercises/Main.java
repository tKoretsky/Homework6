package HashSetExercises;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Task1
        System.out.println("Task1");
        HashSet<String> colorSet = new HashSet<>();
        colorSet.add("White");
        colorSet.add("Black");
        colorSet.add("Red");
        colorSet.add("Blue");
        colorSet.add("Yellow");
        System.out.println(colorSet);

        //Task2
        System.out.println("Task2");
        Iterator<String> iterator = colorSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //Task3
        System.out.println("Task3");
        System.out.println("Size: " + colorSet.size());

        //Task4
        System.out.println("Task4");
        colorSet.removeAll(colorSet);
        System.out.println(colorSet);

        //Task5
        System.out.println("Task5");
        colorSet.add("White");
        colorSet.add("Black");
        colorSet.add("Red");
        colorSet.add("Blue");
        colorSet.add("Yellow");
        if (colorSet.isEmpty()) {
            System.out.println("HashSet is empty");
        } else {
            System.out.println("HashSet is not empty");
        }

        //Task6
        System.out.println("Task6");
        HashSet<String> newHashSet = new HashSet<>();
        newHashSet = (HashSet) colorSet.clone();
        System.out.println(newHashSet);

        //Task7
        System.out.println("Task7");
        String[] array = new String[colorSet.size()];
        colorSet.toArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //Task8
        System.out.println("Task8");
        TreeSet<String> tree_set = new TreeSet<String>(colorSet);
        for (String i : tree_set) {
            System.out.println(i);
        }

        //Task9
        System.out.println("Task9");
        List<String> list = new ArrayList<String>(colorSet);
        System.out.println(list);

        //Task10
        System.out.println("Task10");
        HashSet<String> colorSet2 = new HashSet<>();
        colorSet2.add("Yellow");
        colorSet2.add("Pink");
        colorSet2.add("Black");
        colorSet2.add("Red");
        for (String element : colorSet) {
            System.out.println(colorSet2.contains(element) ? "Yes" : "No");
        }

        //Task11
        System.out.println("Task11");
        System.out.println("New HashSet : " + colorSet2);
        colorSet.retainAll(colorSet2);
        System.out.println("HashSet :" + colorSet);

        //Task12
        System.out.println("Task12");
        colorSet.clear();
        System.out.println(colorSet);

    }
}
