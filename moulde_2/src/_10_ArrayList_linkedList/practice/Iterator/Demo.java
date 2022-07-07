package _10_ArrayList_linkedList.practice.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {
    static List<String> list = new ArrayList<>();
    public static void main(String[] args) {
        list.add("da nang");
        list.add("ha noi");
        list.add("ho chi minh");
        list.add("can tho");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
