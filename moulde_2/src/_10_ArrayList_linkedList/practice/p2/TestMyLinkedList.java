package _10_ArrayList_linkedList.practice.p2;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        Mylinkedlist ll = new Mylinkedlist(19);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(4,9);
        ll.add(4,10);
        ll.printList();
    }
}
