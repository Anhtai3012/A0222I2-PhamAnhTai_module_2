package _10_ArrayList_linkedList.exercise.e1;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(0,new Integer(3));
        list.add(1,new Integer(4));
        list.remove(1);
        list.contains(3);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(2);
        list.clear();
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(2);
        System.out.println(list.get(3));
        System.out.println(list.indexOf(0));
        System.out.println(list);
    }
}
