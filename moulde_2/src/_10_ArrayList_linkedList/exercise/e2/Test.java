package _10_ArrayList_linkedList.exercise.e2;

public class Test {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList(5);
        linkedList.addLast(6);
        linkedList.addLast(7);
        linkedList.addLast(8);
        linkedList.removeLast();
        linkedList.printList();

    }
}
