package _10_ArrayList_linkedList.practice.p2;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println(" TESTING");
        Mylinkedlist ll = new Mylinkedlist();
        ll.addFirst(5);
        ll.add(0,7);
        ll.add(5,9);
        ll.printList();
    }
}
