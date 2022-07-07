package _10_ArrayList_linkedList.exercise.e1;


public class MyList<E>  {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private E[] element;

    public MyList() {
        element = (E[]) (new Object[DEFAULT_CAPACITY]);
    }

    public MyList(int capacity) {
        element = (E[]) new Object[capacity];
    }

    public void add(int index, E e) {
        ensureCapacity();
        for (int i = size - 1; i >= index; i--) {
            element[i + 1] = element[i];
        }
        element[index] = e;
        size++;
    }

    private void ensureCapacity() {
        if (size >= element.length) {
            E[] newData = (E[]) (new Object[size * 2 + 1]);
            System.arraycopy(element, 0, newData, 0, size);
            element = newData;
        }
    }

      public E remove(int index){
        checkIndex(index);
        E e =element[index];
          for (int i = index; i < size-1 ; i++) {
              element[i]=element[i+1];
          }
          element[size-1]=null;
          size--;
          return e;
      }
    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException
                    ("index " + index + " out of bounds");
    }
    public int size(){
        return size;
    }

    public boolean contains(E o) {
        for (int i = 0; i < size; i++){
            if (o.equals(element[i])){
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o){
        for (int i = 0; i <size ; i++) {
            if (o.equals(element[i])) return i;
        }
        return -1;
    }
    public boolean add(E e){
        add(size,e);
        return true;
    }

     public void ensureCapacity(E minCapacity){

     }
     public E get(int i){
         checkIndex(i);
         return element[i];
     }
     public void clear(){
        size=0;
        element=(E[]) new Object[DEFAULT_CAPACITY];
     }

    public String toString() {
        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < size; i++) {
            result.append(element[i]);
            if (i < size - 1) result.append(", ");
        }

        return result.toString() + "]";
    }

}
