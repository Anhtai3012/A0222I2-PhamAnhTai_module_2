package _11_Stack_Queue.practice.p2;

import javax.xml.soap.Node;

public class MyLinkedListQueue {
    private Node front;
    private Node rear;
    public MyLinkedListQueue(){
        this.front=null;
        this.rear=null;
    }
    public class Node {
        public int key;
        public Node next;

        public Node(int key) {
            this.key = key;
//            this.next = null;
        }
    }
    public void enqueue(int key) {
        Node temp = new Node(key);
        if (this.rear == null) {
            this.front = this.rear = temp;
            return ;
        }
        this.rear.next = temp;
        this.rear = temp;
    }
    public Node dequeue() {
        if (this.front == null)
            return null;
        Node temp = this.front;
        this.front = this.front.next;
        if (this.front == null)
            this.rear = null;
        return temp;
    }

    @Override
    public String toString() {
        return "MyLinkedListQueue{" +
                "front=" + front +
                ", rear=" + rear +
                '}';
    }
}
