package _12_Java_collection_framework.practice.p1;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {
    private static Object TreeMap;

    public static void main(String[] args) {
        Map <String,Integer> hashmap = new HashMap();
        hashmap.put("tai",20);
        hashmap.put("hieu",19);
        hashmap.put("huy",22);
        System.out.println("Display entries in Hashmap");
        System.out.println(hashmap+"\n");
        Map<String,Integer> treeMap = new TreeMap();
        System.out.println("Display entries in ascending order key");
//        treeMap.put("tai",20);
//        treeMap.put("hieu",19);
//        treeMap.put("huy",22);
        System.out.println(treeMap);
        Map<String,Integer> linkkedHashMap = new LinkedHashMap<>();
        linkkedHashMap.put("Smith",30);
        linkkedHashMap.put("John",31);
        linkkedHashMap.put("marry",18);
        System.out.println("\n the age for "+"marry is: "+linkkedHashMap.get("marry"));
    }
}
