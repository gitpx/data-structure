package com.px.linkedlist;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        /*MyLinkedList<Integer> list = new MyLinkedList<Integer>();
        for (int i = 0; i < 5; i++) {
            list.addFirst(i);
            System.out.println(list);
        }
        list.add(2,666);
        System.out.println(list);

        list.delete(2);
        System.out.println(list);
        list.deleteFirst();
        System.out.println(list);
        list.deleteLast();
        System.out.println(list);*/
        /*String[] flag = {"1","2","3"};
        List<String> list = Arrays.asList(flag);
        list.add("4");
        for(String str : list){
            System.out.println(str);
        }*/
        Integer a = 99,b = 99, c=200, d =200;
        int e = 97,f = 'a';
        char g = 'a';
		
        System.out.println(a==b);
        System.out.println(c==d);
        System.out.println(e==f);
        System.out.println(e==g);
    }
}
