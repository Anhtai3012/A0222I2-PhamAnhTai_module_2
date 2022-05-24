package _4_Class_and_Object.exercise.e2;

import java.util.Date;

public class Stopwatch {
    private Date startTime;
    private Date endTime;

    public Stopwatch() {
        startTime = new Date();
    }

   public void stop(){
       endTime = new Date();
   }
    public long getElapsedTime(){
        return endTime.getTime() - startTime.getTime();
    }

    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();
        System.out.println(stopwatch.startTime.getTime());
    }
}
