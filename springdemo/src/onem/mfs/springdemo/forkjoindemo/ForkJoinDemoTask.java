package onem.mfs.springdemo.forkjoindemo;

import java.util.concurrent.RecursiveTask;

/**
 * ForkJoin的任务
 *
 * @author:MuFanSen
 * @date: 12:05 2021/5/8
 */
public class ForkJoinDemoTask extends RecursiveTask<Integer> {

    /**
     * 数组开始位置
     */
    private int start;

    /**
     * 数组结束位置
     */
    private int end;


    public ForkJoinDemoTask( int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        int sum = 0;

        if(end - start <=1){
            for(int i = start; i < end; i++){
                sum += i;
            }
        }else {
            int mid = (start+end)/2;
            ForkJoinDemoTask task1 = new ForkJoinDemoTask(start,mid);
            ForkJoinDemoTask task2 = new ForkJoinDemoTask(mid+1,end);
            invokeAll(task1,task2);
            int x = task1.join();
            int y = task2.join();
            sum = x+y;

        }
        return sum;
    }
}
