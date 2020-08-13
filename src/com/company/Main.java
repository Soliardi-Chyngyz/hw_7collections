package com.company;

import com.sun.source.tree.WhileLoopTree;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList <String> a = new ArrayList<>();
        ArrayList <String> b = new ArrayList<>();
        ArrayList <String> c = new ArrayList<>();

        Comparator<String> comparator = (o1, o2) -> {
            Integer i1 = o1.length();
            Integer i2 = o2.length();
            return i1.compareTo(i2);
        };
        addToCollection(a, 5);
        printOut(a);

        Iterator<String> iteratorA = a.iterator();
        addToCollection2(b, 5);
        printOut(b);

        Iterator<String> iteratorB = b.iterator();
        Collections.reverse(b);

        while (iteratorA.hasNext() && iteratorB.hasNext()) {
            c.add(iteratorA.next());
            c.add(iteratorB.next());
        }
        printOut(c);

        c.sort(comparator);
        printOut(c);
    }

    public static void addToCollection (Collection<String> collection, int quantity){
        Scanner s = new Scanner(System.in);
        System.out.println("Введи пять имен для списка А");
        Iterator <String> iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(collection.add(s.nextLine()));
        }
        System.out.println("Список А заполнен");
    }

    public static void addToCollection2 (Collection <String> collection, int quantity){
        Scanner s = new Scanner(System.in);
        System.out.println("Введи пять имен для списка Б");
        Iterator <String> iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(collection.add(s.nextLine()));
        }
        System.out.println("Список Б заполнен");
    }

    public static void printOut (Collection<String> collection){
        Iterator <String> iterator = collection.iterator();
        System.out.println("___________");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("////////\\\\\\");
        }
    }
}
