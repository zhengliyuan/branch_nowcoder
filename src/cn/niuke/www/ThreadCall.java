package cn.niuke.www;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class ThreadCall implements Callable {
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for(int i=0;i<50;i++){
            sum = sum + i;
            System.out.println(sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        ThreadCall threadCall = new ThreadCall();
        FutureTask<Integer> integerFutureTask = new FutureTask<Integer>(threadCall);
        new Thread(integerFutureTask).start();

        try {
            Integer sum = integerFutureTask.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
