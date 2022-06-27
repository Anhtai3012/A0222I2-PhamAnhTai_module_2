package _14_Sort_algotithm.practice.p3;

public class InsertionSort {
    static double[] list={1.9,4,5,6.6,5.7,-4,5};

    public static void main(String[] args) {
        selectionSort(list);
        for (int i = 0; i <list.length ; i++) {
            System.out.print(list[i]+" ");
        }
    }
     static void selectionSort(double[] list){
         for (int i = 0; i <list.length-1 ; i++) {
             double currentMin = list[i];
             int currentMinIndex = i;
             for (int j = 0+i; j < list.length ; j++) {
                 if (currentMin > list[j]){
                     currentMin = list[j];
                     currentMinIndex= j;
                 }
             }
             if (currentMinIndex !=i){
                 list[currentMinIndex]= list[i];
                 list[i]=currentMin;
             }
         }
     }
}
