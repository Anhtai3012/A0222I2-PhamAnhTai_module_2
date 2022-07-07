package _14_Sort_algotithm.exercise.e1;

public class InsertionSort {
    static int [] list ={5,8,99,23,25,67,8};

    public static void main(String[] args) {
        insertionSort(list);
        for (int i = 0; i <list.length ; i++) {
            System.out.print(list[i]+" ");
        }
    }
    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos] = x;
        }
    }
}
