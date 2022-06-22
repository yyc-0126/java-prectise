package demoThreadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class DemoThreadPool {
    public static void main(String[] args) {

        ExecutorService es = Executors.newFixedThreadPool(2);
        Object c = es.submit(new RunableImpl());
        es.submit(new RunableImpl());
        es.submit(new RunableImpl());
        es.execute(new RunableImpl());

        es.shutdown();
    }
}
