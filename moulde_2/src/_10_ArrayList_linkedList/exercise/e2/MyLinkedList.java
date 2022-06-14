package _10_ArrayList_linkedList.exercise.e2;

import _10_ArrayList_linkedList.practice.p2.Mylinkedlist;

public class MyLinkedList {
    private Node head ;
    private int numNodes;
    public MyLinkedList(Object data){
        head = new Node(data);
    }
    public class Node {
        private Node next;
        private Object data;
        public Node(Object data){
            this.data=data;
        }
        public Object getData(){
            return this.data;
        }
    }
     public void addFirst(Object e) {
        Node temp = head;
        head = new Node(e);
         head.next = temp;
        numNodes++;
    }
    public void addLast(Object e){
        Node tmp = head;

        if (tmp == null) {
            addFirst(e);
        } else {
            while (tmp.next != null) {
                tmp = tmp.next;
            }

            tmp.next = new Node(e);
        }

        numNodes++;
    }
    public void add(int index, Object e){
        Node temp =head;
        Node holder;
        for (int i=0;i<index-1 && temp.next != null;i++){
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(e);
        temp.next.next = holder;
        numNodes++;
    }

    Object removeFirst() {
        Object result = head.data;

        if (head.next != null) {
            head = head.next;
        } else {
            head = null;
        }

        numNodes--;
        return result;
    }

    Object removeLast() {
        Object result = null;
        Node tmp = head;

        if (tmp.next != null) {
            while (tmp.next.next != null) {
                tmp = tmp.next;
            }

            result =  tmp.data;
            tmp.next = null;
        } else {
            result = removeFirst();
        }

        numNodes--;
        return result;
    }

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    int size(){
        return numNodes;
    }

}
