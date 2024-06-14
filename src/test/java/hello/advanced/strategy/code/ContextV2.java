package hello.advanced.strategy.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ContextV2 {
    public void execute(Strategy strategy) {
        long begin = System.currentTimeMillis();
        strategy.call();
        long end = System.currentTimeMillis();
        long result = end - begin;
        log.info("resultTime: {}", result);
    }
}
