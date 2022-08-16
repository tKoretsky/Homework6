package PriorityqQueueExercises;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        //Task1
        System.out.println("Task");
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("White");
        queue.add("Black");
        queue.add("Red");
        queue.add("Blue");
        queue.add("Yellow");
        System.out.println(queue);

        //Task2
        System.out.println("Task2");
        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //Task3
        System.out.println("Task3");
        PriorityQueue<String> queue2 = new PriorityQueue<>();
        queue2.add("Purple");
        queue2.add("Green");
        queue2.add("Orange");
        queue2.add("Grey");
        queue2.add("Cyan");
        queue.addAll(queue2);
        System.out.println(queue);

        //Task4
        System.out.println("Task4");
        queue.offer("Pink");
        System.out.println(queue);

        //Task5
        System.out.println("Task5");
        queue2.clear();
        System.out.println(queue2);

        //Task6
        System.out.println("Task6");
        System.out.println("Size: " + queue.size());

        //Task7
        System.out.println("Task7");
        for (String element : queue) {
            System.out.println(queue2.contains(element) ? "Yes" : "No");
        }

        //Task8
        System.out.println("Task8");
        System.out.println(queue.peek());
        System.out.println(queue);

        //Task9
        System.out.println("Task9");
        System.out.println(queue.poll());
        System.out.println(queue);

        //Task10
        System.out.println("Task10");
        //String[] array = (String[]) queue.toArray();
        //for (String i : array) {
        //    System.out.println(i);
        //}

        //Task11
        System.out.println("Task11");
        String str;
        str = queue.toString();
        System.out.println("String : " + str);

        //Task12
        System.out.println("Task12");
        System.out.print("Maximum Priority Queue: ");
        String val = null;
        while ((val = queue.poll()) != null) {
            System.out.print(val + "  ");
        }
    }
}

