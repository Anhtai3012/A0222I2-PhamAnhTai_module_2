package _12_Java_collection_framework.practice.Op1;

public class MyQueue {
    private int capacity;
     private int[] queueArr;
     private int head=0;
     private int tail=-1;
     private int currentSize=0;
     public MyQueue(){
     }
     public MyQueue(int queueSize){
         this.capacity= queueSize;
         queueArr = new int[this.capacity];
     }
     public boolean isQueueFull(){
         boolean status =false;
         if (currentSize == this.capacity){
             status = true;
         }
         return false;
     }
     public boolean isQueueEmpty(){
         boolean status = false;
         if (currentSize==0){
             status =true;
         }
         return status;
     }
     public void enqueue(int item){
         if (isQueueEmpty()) System.out.println("Qverflow ! Unable to add element:"+item);
         else {
             tail++;
             if (tail == capacity -1) tail=0;
             queueArr[tail]= item;
             currentSize++;
             System.out.println("Elemnet"+item+"is pushed to Queue");
         }

     }
     public void dequeue(){
         if (isQueueEmpty()) System.out.println("underflow ! Unable to remove element from Queue");
         else {
             head++;
             if (head == capacity-1){
                 System.out.println("pop operation done ! remove :"+queueArr[head-1]);
                 head =0 ;
             }else {
                 System.out.println("Pop operation done ! remove:"+queueArr[head-1]);
             }
             currentSize--;
         }
         }
         public void disPlay(){
             for (int i = 0; i <queueArr.length ; i++) {
                 System.out.print(queueArr[i]+" ");
             }
         }

}
