package _3_Array.practice.p5;

public class Min_array {
    public static void main(String[] args) {
        int [] arr ={4, 12, 7, 8, 1, 6, 9};
        int index = FindMin(arr);
        System.out.println("find min: "+arr[index]);
    }
    public static int FindMin(int[] arr){
        int index = 0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<arr[index]){
                index=i;
            }
        }
        return index;
    }
}
