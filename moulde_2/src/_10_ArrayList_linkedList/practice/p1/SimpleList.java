package _10_ArrayList_linkedList.practice.p1;

import java.util.Arrays;

public class SimpleList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY =10;
    private Object element[];
    public  SimpleList(){
        element = new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapa(){
        int newSize = element.length*2;
        element = Arrays.copyOf(element,newSize);
    }
    public void add(E e){
        if (size == element.length){
            ensureCapa();
        }
        element[size++]=e;
    }
    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        int[] elements;
        return (E) element[i];
    }
}
