package collections;

import streams.*;

import java.util.*;
import java.util.stream.*;

public class Main {

    private static final String STR_1 = "CCC";
    private static final String STR_2 = "AAA";
    private static final String STR_3 = "BBB";

    
    public static void main(String[] args) {

        //1 ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add(STR_1);
        arrayList.add(STR_2);
        arrayList.add(STR_3);
        arrayList.add(null);
        arrayList.add(null);

        //2 LinkedList
        List<String> linkedList = new LinkedList<>();
        linkedList.add(STR_1);
        linkedList.add(STR_2);
        linkedList.add(STR_3);
        linkedList.add(null);
        linkedList.add(null);

        //3 HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add(STR_1);
        hashSet.add(STR_2);
        hashSet.add(STR_3);
        hashSet.add(null);
        hashSet.add(null);

        //4 LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(STR_1);
        linkedHashSet.add(STR_2);
        linkedHashSet.add(STR_3);
        linkedHashSet.add(null);
        linkedHashSet.add(null);

        //5 TreeSet
        Set<String> treeSet = new TreeSet<>();
        treeSet.add(STR_1);
        treeSet.add(STR_2);
        treeSet.add(STR_3);
        //treeSet.add(null);

        //6 PriorityQueue
        Queue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(STR_1);
        priorityQueue.add(STR_2);
        priorityQueue.add(STR_3);
        //priorityQueue.add(null);

        //7 Deque -> ArrayDeque
        Deque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(STR_1);
        arrayDeque.add(STR_2);
        arrayDeque.add(STR_3);
        //arrayDeque.add(null);

        //8 HashMap
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put(STR_1, STR_1);
        hashMap.put(STR_2, STR_2);
        hashMap.put(STR_3, STR_3);
        hashMap.put(null, null);
        hashMap.put(null, null);

        //9 LinkedHashMap
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(STR_1, STR_1);
        linkedHashMap.put(STR_2, STR_2);
        linkedHashMap.put(STR_3, STR_3);
        linkedHashMap.put(null, null);
        linkedHashMap.put(null, null);

        //10 TreeMap
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put(STR_1, STR_1);
        treeMap.put(STR_2, STR_2);
        treeMap.put(STR_3, STR_3);
        //treeMap.put(null, null);




        //Print all collections to console
        System.out.println("LIST------------------------------------------------");
        System.out.println("1 ArrayList: " + arrayList);
        System.out.println("2 LinkedList: " + linkedList);
        System.out.println("\nSET-------------------------------------------------");
        System.out.println("3 HashSet: " + hashSet);
        System.out.println("4 LinkedHashSet: " + linkedHashSet);
        System.out.println("5 TreeSet: " + treeSet);
        System.out.println("\nQUEUE-----------------------------------------------");
        System.out.println("6 PriorityQueue: " + priorityQueue);
        System.out.println("7 ArrayDeque: " + arrayDeque);
        System.out.println("\nMAP-------------------------------------------------");
        System.out.println("8 HashMap: " + hashMap);
        System.out.println("9 LinkedHashMap: " + linkedHashMap);
        System.out.println("10 TreeMap: " + treeMap);
    }



}
