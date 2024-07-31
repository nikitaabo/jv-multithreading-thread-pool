package core.basesyntax;

import java.time.LocalTime;
import java.util.concurrent.Callable;

public class MyThread implements Callable<String> {
    @Override
    public String call() throws InterruptedException {
        String result = "Task duration was 200 ms, execution finished at " + LocalTime.now();
        return result;
    }
}
