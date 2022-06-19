package _11_Stack_Queue.exercise.e2;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class CountCharInString {
    public static void main(String[] args){
        String stTest= "Anh Tai";
        TreeMap<Character, Integer> treeMap= new TreeMap<>();
        Arrays.asList(stTest.toUpperCase().split(""));
        for (int i = 0; i <stTest.length() ; i++) {
            int count =1;
            if (treeMap.containsKey(stTest.charAt(0))){
                count +=treeMap.get(stTest.charAt(0));
            }
            treeMap.put(stTest.charAt(0),count);
        }
 //               .forEach(e->{
//            int count=1;
//            if(treeMap.containsKey(e.charAt(0))){
//                count+= treeMap.get(e.charAt(0));
//            }
//
//            treeMap.put(e.charAt(0),count);
//        });

        for (Map.Entry<Character, Integer> s: treeMap.entrySet()) {
            System.out.println(s);
        }
//        String str = "Pham Anh tai";
//        Map<Character, Integer> map = new TreeMap<>();
//
//        for(char c: str.toUpperCase().toCharArray()) {
//            if(c == ' ') continue;
//            map.put(c, map.getOrDefault(c, 0) + 1);
//        }
//
//        for(Map.Entry<Character, Integer> entry: map.entrySet()) {
//            System.out.println("Char:"+entry.getKey()+"number:"+entry.getValue());
//        }
    }
}
