package com.gevernova;

public class PerformanceUtils {
    // Simulates a long-running task by sleeping for 3 seconds
    public String longRunningTask(){
        try{
            Thread.sleep(3000);
        } catch(InterruptedException e){
            Thread.currentThread().interrupt(); // restore interrupted statuc
        }
        return "Completed";
    }
}
