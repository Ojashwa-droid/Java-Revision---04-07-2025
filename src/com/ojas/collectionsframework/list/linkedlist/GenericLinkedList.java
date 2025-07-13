package com.ojas.collectionsframework.list.linkedlist;

public class GenericLinkedList {
    public static void main(String[] args) {
        Node node1 = new Node();
        Node node2 = new Node();
        node2.value = 39;
        node1.value = 20;
        node1.next = node2;
        node2.next = null;

    }
}

class Node{
    public int value;
    public Node next;
}
