package onem.mfs.springdemo.forkjoindemo;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

/**
 * @author:MuFanSen
 * @date: 14:10 2021/5/8
 */
public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ForkJoinTask forkJoinTask = new ForkJoinDemoTask(1,100);

        ForkJoinPool forkJoinPool = new ForkJoinPool();
        Object invoke = forkJoinPool.invoke(forkJoinTask);
        System.out.println(invoke);


    }

}
