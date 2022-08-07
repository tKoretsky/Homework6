package ArrayListExercises;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Task1
        System.out.println("Task 1:");
        List<String> colorList = new ArrayList<>();
        colorList.add("White");
        colorList.add("Black");
        colorList.add("Red");
        colorList.add("Blue");
        colorList.add("Yellow");
        System.out.println(colorList);

        //Task2
        System.out.println("Task 2:");
        for (int i = 0; i < colorList.size(); i++) {
            System.out.println(colorList.get(i));
        }

        //Task3
        System.out.println("Task 3:");
        colorList.add(0, "Purple");
        System.out.println(colorList);

        //Task4
        System.out.println("Task 4:");
        String element = colorList.get(3);
        System.out.println(element);

        //Task5
        System.out.println("Task 5:");
        colorList.set(2, "Orange");
        System.out.println(colorList);

        //Task6
        System.out.println("Task 6:");
        colorList.remove(3 - 1);
        System.out.println(colorList);

        //Task7
        System.out.println("Task 7:");
        if (colorList.contains("Blue")) {
            System.out.println("The item was found in the list");
        } else {
            System.out.println("No such item was found in the list");
        }

        //Task8
        System.out.println("Task 8:");
        Collections.sort(colorList);
        System.out.println(colorList);

        //Task9
        System.out.println("Task 9:");
        List<String> newColorList = new ArrayList<>();
        for (int i = 0; i < colorList.size(); i++) {
            newColorList.add("Color" + (i + 1));
        }
        System.out.println("NewColorList: " + newColorList);
        Collections.copy(newColorList, colorList);
        System.out.println("OldColorList: " + colorList);
        System.out.println("NewColorList: " + newColorList);

        //Task10
        System.out.println("Task 10:");
        Collections.shuffle(colorList);
        System.out.println(colorList);

        //Task11
        System.out.println("Task 11:");
        Collections.reverse(colorList);
        System.out.println(colorList);

        //Task12
        System.out.println("Task 12:");
        List<String> extractedList = colorList.subList(1, 4);
        System.out.println(extractedList);

        //Task13
        System.out.println("Task 13:");
        myCompare(colorList, newColorList);

        //Task14
        System.out.println("Task 14:");
        Collections.swap(colorList, 1, 4);
        System.out.println(colorList);

        //Task15
        System.out.println("Task 15:");
        List<String> tmp = new ArrayList<>();
        tmp.addAll(colorList);
        tmp.addAll(newColorList);
        System.out.println(tmp);

        //Task16
        System.out.println("Task 16:");
        ArrayList<String> tmp2 = new ArrayList<>();
        tmp2.add("wow");
        ArrayList<String> clonedList = (ArrayList<String>) tmp2.clone(); // List<> cant clone to ArrayList<>
        //ArrayList<String> clonedList = colorList - How is the difference?
        System.out.println(clonedList);

        //Task17
        System.out.println("Task 17:");
        colorList.removeAll(colorList);
        System.out.println(colorList);

        //Task18
        System.out.println("Task 18:");
        if (colorList.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("List is not empty");
        }

        //Task19
        System.out.println("Task 19:");
        tmp2.trimToSize(); // method just ArrayList
        System.out.println(tmp2);

        //Task20
        System.out.println("Task 20:");
        ArrayList<String> tmp3 = new ArrayList<String>(3);
        tmp3 = tmp2;
        tmp2.ensureCapacity(7); // what is the sence?
        System.out.println(tmp3);

        //Task21
        System.out.println("Task 21:");
        colorList.add("White");
        colorList.add("Black");
        colorList.add("Red");
        colorList.add("Blue");
        colorList.add("Yellow");
        System.out.println(colorList);
        String newColor = "Cyan";
        colorList.set(1, newColor);
        System.out.println(colorList);

        //Task22
        System.out.println("Task 22:");
        for (int i = 0; i < colorList.size(); i++) {
            System.out.print(colorList.get(i) + " ");
        }
    }

    private static void myCompare(List<String> firstList, List<String> secondList) {
        for (int i = 0; i < firstList.size(); i++) {
            if (!firstList.contains(secondList.get(i)) && firstList.size() != secondList.size()) {
                System.out.println("These lists are not the same");
                return;
            }
        }
        System.out.println("These lists are the same");
    }
}
