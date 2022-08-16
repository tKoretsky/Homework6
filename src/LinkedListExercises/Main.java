package LinkedListExercises;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Task1
        System.out.println("Task1");
        LinkedList<String> colorList = new LinkedList();
        colorList.add("White");
        colorList.add("Black");
        colorList.add("Red");
        colorList.add("Blue");
        colorList.add("Yellow");
        System.out.println(colorList);

        //Task2
        System.out.println("Task2");
        for (String color : colorList) {
            System.out.println(color);
        }

        //Task3
        System.out.println("Task3");
        Iterator iterator = colorList.listIterator(1);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //Task4
        System.out.println("Task4");
        iterator = colorList.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //Task5
        System.out.println("Task5");
        colorList.add(3, "Purple");
        System.out.println(colorList);

        //Task6
        System.out.println("Task6");
        colorList.addFirst("Pink");
        colorList.addLast("Cyan");
        System.out.println(colorList);

        //Task7
        System.out.println("Task7");
        colorList.addFirst("Brown");
        System.out.println(colorList);

        //Task8
        System.out.println("Task8");
        colorList.addLast("Grey");
        System.out.println(colorList);

        //Task9
        System.out.println("Task9");
        String color = "Orange";
        colorList.add(4, color);
        System.out.println(colorList);

        //Task10
        System.out.println("Task10");
        String first = colorList.getFirst();
        String last = colorList.getLast();
        System.out.println("First: " + first + "\nLast: " + last);

        //Task11
        System.out.println("Task11");
        for (int i = 0; i < colorList.size(); i++) {
            System.out.println(i + 1 + ": " + colorList.get(i));
        }

        //Task12
        System.out.println("Task12");
        colorList.remove(5);
        System.out.println(colorList);

        //Task13
        System.out.println("Task13");
        colorList.removeFirst();
        colorList.removeLast();
        System.out.println(colorList);

        //Task14
        System.out.println("Task14");
        colorList.removeAll(colorList);
        System.out.println(colorList);

        //Task15
        System.out.println("Task15");
        colorList.add("White");
        colorList.add("Black");
        colorList.add("Red");
        colorList.add("Blue");
        colorList.add("Yellow");
        Collections.swap(colorList, 1, 3);
        System.out.println(colorList);

        //Task16
        System.out.println("Task16");
        Collections.shuffle(colorList);
        System.out.println(colorList);

        //Task17
        System.out.println("Task17");
        LinkedList<String> forJoin = colorList;
        LinkedList<String> joinedLists = new LinkedList<>();
        joinedLists.addAll(colorList);
        joinedLists.addAll(forJoin);
        System.out.println(joinedLists);

        //Task18
        System.out.println("Task18");
        LinkedList<String> clonedList = new LinkedList<>();
        clonedList = (LinkedList) colorList.clone();
        System.out.println(clonedList);

        //Task19
        System.out.println("Task19");
        System.out.println(colorList.pop());
        System.out.println(colorList);

        //Task20
        System.out.println("Task20");
        String first1 = colorList.getFirst();
        System.out.println(colorList);
        System.out.println("First: " + first1);

        //Task21
        System.out.println("Task21");
        String last1 = colorList.getLast();
        System.out.println(colorList);
        System.out.println("Last: " + last1);

        //Task22
        System.out.println("Task22");
        if(colorList.contains("Black")){
            System.out.println("Black is here)");
        }else {
            System.out.println("There is no such element");
        }

        //Task23
        System.out.println("Task23");
        List<String> list = new ArrayList<>(colorList);
        System.out.println(list);

        //Task24
        System.out.println("Task24");
        LinkedList<String> tmp = new LinkedList<>();
        for (int i = 0; i < joinedLists.size(); i++) {
            if(colorList.contains(joinedLists.get(i))){
                tmp.add("Yes");
            }else{
                tmp.add("No");
            }
        }
        System.out.println(tmp);

        //Task25
        System.out.println("Task25");
        if(colorList.isEmpty()){
            System.out.println("LinkedList is empty");
        }else{
            System.out.println("LinkedList is not empty");
        }

        //Task26
        System.out.println("Task26");
        colorList.set(2,"Purple");
        System.out.println(colorList);
    }
}
