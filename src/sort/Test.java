package sort;

import datastructure.linear.HeadDoubleLinkedList;

public class Test {
    public static void main(String[] args) {
        HeadDoubleLinkedList<java.io.Serializable> headDoubleLinkedList = new HeadDoubleLinkedList<>();
        headDoubleLinkedList.add("test");
        headDoubleLinkedList.add(123);
        headDoubleLinkedList.delete(1);
        
        System.out.println(headDoubleLinkedList.get(0));
        System.out.println(headDoubleLinkedList.size());
    }
}

