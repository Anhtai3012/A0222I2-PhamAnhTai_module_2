package _13_Search_algorithm.practice.p1;

public class binarySearch {
    static int[] list={2,4,7,10,11,45,50,59,60,66,69,10,79};

    public static void main(String[] args) {
        System.out.println(BinarySearch(list,3));
        System.out.println(BinarySearch(list,2));
    }
    static int BinarySearch(int[] list,int key){
        int low =0 ;
        int high = list.length-1;
        while (high >= low){
            int middle= (low+high)/ 2;
            if(key < list[middle]){
                high = middle -1;
            }else if (key == list[middle]){
                return middle;
            }else low=middle+1;
        }
        return -1;
    }
}
