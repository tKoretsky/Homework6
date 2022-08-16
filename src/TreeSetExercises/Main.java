package TreeSetExercises;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //Task1
        System.out.println("Task1");
        TreeSet<String> colorSet = new TreeSet<>();
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
        TreeSet<String> colorSet2 = new TreeSet<>();
        colorSet2.add("Grey");
        colorSet2.add("Brown");
        colorSet2.add("Purple");
        colorSet2.add("Orange");
        colorSet2.add("Green");
        colorSet.addAll(colorSet2);
        System.out.println(colorSet);

        //Task4
        System.out.println("Task4");
        Iterator<String> iterator2 = colorSet.descendingIterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

        //Task5
        System.out.println("Task5");
        String first = colorSet.first();
        System.out.println("First: " + first);
        String last = colorSet.last();
        System.out.println("Last: " + last);

        //Task6
        System.out.println("Task6");
        TreeSet<String> newTreeSet = (TreeSet<String>) colorSet.clone();
        System.out.println(newTreeSet);

        //Task7
        System.out.println("Task7");
        System.out.println("Size: " + colorSet.size());

        //Task8
        System.out.println("Task8");
        for (String element : colorSet) {
            System.out.print(colorSet2.contains(element) ? "Yes " : "No ");
        }

        //Task9
        System.out.println("Task9");
        TreeSet<Integer> treeNum = new TreeSet<Integer>();
        for (int i = 0; i < 10; i++) {
            treeNum.add(i + 1);
        }
        TreeSet<Integer> treeheadset = (TreeSet) treeNum.headSet(7);
        Iterator iterator3;
        iterator3 = treeheadset.iterator();
        while (iterator3.hasNext()) {
            System.out.println(iterator3.next() + " ");
        }

        //Task10
        System.out.println("Task10");
        System.out.println(treeNum);
        System.out.println("Max: " + treeNum.ceiling(15));

        //Task11
        System.out.println("Task11");
        System.out.println(treeNum);
        System.out.println("Min: " + treeNum.floor(15));

        //Task12
        System.out.println("Task12");
        System.out.println("Higher then 5-->" + treeNum.higher(5));

        //Task13
        System.out.println("Task13");
        System.out.println("Lower then 5-->" + treeNum.lower(5));

        //Task14
        System.out.println("Task14");
        treeNum.pollFirst();
        System.out.println(treeNum);

        //Task15
        System.out.println("Task15");
        treeNum.pollLast();
        System.out.println(treeNum);

        //Task16
        System.out.println("Task16");
        treeNum.remove(5);
        System.out.println(treeNum);
    }
}