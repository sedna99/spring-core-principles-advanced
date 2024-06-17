package hello.advanced.strategy.code.template;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TimeLogTemplate {
    public void execute(Callback callback) {
        long begin = System.currentTimeMillis();
        callback.call();
        long end = System.currentTimeMillis();
        long result = end - begin;
        log.info("resultTime: {}", result);
    }
}
