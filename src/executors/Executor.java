package executors;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class Executor {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Callable call1 = () -> {
            return "Hey";
        };
        Callable call2 = () -> {
            return "Akash ";
        };

        Future future = executorService.submit(call1);

        System.out.println(future.get());

        List<Callable<String>> list = new ArrayList<>();
        list.add(call1);
        list.add(call2);

        List<Future<String>> futureList1 = executorService.invokeAll(list);
            futureList1.forEach(f -> {
                try {
                    System.out.println(f.get());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } catch (ExecutionException e) {
                    throw new RuntimeException(e);
                }
            });

        String future2 = executorService.invokeAny(list);
        System.out.println(future2);

        executorService.shutdownNow();


    }
}
