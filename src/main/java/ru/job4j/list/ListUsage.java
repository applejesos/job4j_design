package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;

public class ListUsage {
    public static void main(String[] args) {
        List<String> rsl = new ArrayList<>();

        // ДОБАВЛЕНИЕ ЭЛЕМЕНТОВ

        List<String> list = new ArrayList<>(); // 1.3 boolean addAll(Collection<? extends E> c) - добавляет все элементы из переданной коллекции в коллекцию списка в том порядке, в котором они возвращаются итератором переданной коллекцтт
        // List<String> rsl = List.of("one", "two", "three"); //  1.3.1 метод of - позволяет добавлять большое к-во арг-ов через запятую
        rsl.add("one"); // 1.1 boolean add(E e) - добавляет элемент в конец списка
        rsl.add("two"); // 1.1
        rsl.add("three"); // 1.1
        rsl.add(1, "four"); // 1.2 void add(int index, E element)
        list.add("four"); // 1.3
        list.add("five"); // 1.3
        rsl.addAll(list); // 1.3
        /* for (String s : rsl) {
            System.out.println("Текущий элемент: " + s);
        } */

        /*  ЧТЕНИЕ ЭЛЕМЕНТОВ

        for (int i = 0; i < rsl.size(); i++) { // 2.1 использование метода get(): возвращает элемент, который находится на позиции index в этом списке
            System.out.println("Текущий элемент: " + rsl.get(i));
        }

        Iterator<String> iterator = rsl.iterator(); // 2.2.1 использование итератора. Iterator<E> iterator() – метод возвращает объект Iterator, который содержит в себе все элементы исходной коллекции.
        while (iterator.hasNext()) {
            System.out.println("Текущий элемент: " + iterator.next());
        }

        ListIterator<String> iterator = rsl.listIterator(); // 2.2.2 ListIterator<E> listIterator() – возвращает итератор списка для элементов в этом списке.
        while (iterator.hasNext()) {
            System.out.println("Текущий элемент: " + iterator.next());
        }

        ListIterator<String> iterator = rsl.listIterator(2); // 2.2.3 ListIterator<E> listIterator(int index) – возвращает итератор списка для элементов в этом списке, начиная с элемента индекс которого равен index.
        while (iterator.hasNext()) {
            System.out.println("Текущий элемент: " + iterator.next());
        }
    */
    }
}