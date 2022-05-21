package _3_Array.exersice.e4;

public class max_2_chieu {
    public static void main(String[] args) {
        int [][]arr ={{1,2,4,5},{3,4,5,7}};
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.printf(" "+arr[i][j]);
            }
            System.out.println();
        }
        int row=0 ;
        int col=0;
        int max = arr[0][0];
        for (int i = 0; i <arr.length ; i++) {
            for ( int j = 0; j <arr[i].length ; j++) {
                if(max < arr[i][j]){
                    max = arr[i][j];
                    row = i;
                    col=j;
                }
            }
        }
        System.out.println("max :"+max);
        System.out.println("row:"+row+"col:"+col);
    }
}
