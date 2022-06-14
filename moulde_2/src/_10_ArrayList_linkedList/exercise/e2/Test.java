package _10_ArrayList_linkedList.exercise.e2;

public class Test {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList(5);
        linkedList.addLast(5);
        linkedList.add(1,4);
        linkedList.printList();
        linkedList.removeFirst();
        linkedList.printList();

    }
}
