package _11_Stack_Queue.practice.p1;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.List;

public class MyGeneriStack<T> {
//    private LinkedList<T> stack;
//    public MyGeneriStack(){
//        stack = new LinkedList<>();
//    }
//    public void push(T element){
//        stack.addFirst(element);
//    }
//    public T pop(){
//        if(isEmpty()){
//            throw new EmptyStackException();
//        }
//        return stack.removeFirst();
//    }
//    public int size(){
//        return stack.size();
//    }
//    public T peek(){
//        if (isEmpty()) throw new EmptyStackException();
//        return stack.getFirst();
//    }
//    public boolean isEmpty() {
//        if (stack.size()==0){
//            return true;
//        }
//        return false;
//    }
    List<T> stack ;
    public MyGeneriStack(){
        stack = new LinkedList<>();
    }
    public void push(T element){
//        if (stack.isEmpty()){
//            throw  new EmptyStackException();
//        }
        stack.add(element);
    }
    public T pop(){
        if (stack.isEmpty()) throw  new EmptyStackException();
        LinkedList<T> linkedList = (LinkedList<T>) stack;
       return linkedList.removeFirst();
    }
    public int size(){
        return stack.size();
    }

    @Override
    public String toString() {
        return "MyGeneriStack{" +
                "stack=" + stack +
                '}';
    }
}
