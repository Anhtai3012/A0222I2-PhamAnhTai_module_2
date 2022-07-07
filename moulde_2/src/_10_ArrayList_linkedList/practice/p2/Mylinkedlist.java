package _10_ArrayList_linkedList.practice.p2;

import javax.xml.soap.Node;

public class Mylinkedlist<E> {
    public Node head;
    public Node tail;
    private int numNodes;
    public Mylinkedlist(){
        head = new Node();
    }
    public Mylinkedlist(Object data){
        head = new Node(data);
    }
    private static class Node{
        private  Node next;
        private  Object data;
        public Node(){
        }
        public Node(Object data){
             this.data=data;
        }
        public Object getData(){
            return this.data;
        }
    }
    public void add(int index, Object data){
        if (index==0){
            addFirst(data);
            return;
        }else if (index>=numNodes){
            addLast(data);
            return;
        }else {
            Node current = head;
            for (int i = 1; i <index ; i++) {
                current = current.next;
            }
            Node temp = current.next;
            current.next= new Node(data);
            current.next.next=temp;
        }
        numNodes++;
    }
    public void addFirst(Object data) {
//        Node temp = head;
//        head = new Node(data);
//        head.next = temp;
        Node newNode = new Node(data);
        newNode.next=head;
        head=newNode;
        numNodes++;
        if (tail== null){
            tail=head;
        }
    }
    public Node get(int index){
        Node temp=head;
        for(int i=0; i<index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public void addLast(Object data){
        Node newNode = new Node(data);
        if (tail==null){
            tail=head=newNode;
        }else {
            tail.next= newNode;
            tail=tail.next;
        }
        numNodes++;
    }
    public void printList() {
        Node temp = head;
        if (head ==null) System.out.println("list is empty");
        while(temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }

}
