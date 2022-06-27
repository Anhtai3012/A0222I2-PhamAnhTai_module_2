package _14_Sort_algotithm.exercise.e2;

public class InsertionSort {
    static int [] list ={-3,-156,99,23,25,67,8};
    public static void main(String[] args) {
        insertionSort(list);
        for (int i = 0; i <list.length ; i++) {
            System.out.print(list[i]+" ");
        }
    }
    static void insertionSort(int[] arr){
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            int tmp = arr[i];
            int pos = i - 1;

            while (pos >= 0 && arr[pos] > tmp) {
                arr[pos + 1] = arr[pos];
                pos--;
            }

            arr[pos + 1] = tmp;


    }

    }
}

