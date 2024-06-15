package hello.advanced.strategy.code.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ContextV1 {
    private Strategy strategy;

    public ContextV1(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
        long begin = System.currentTimeMillis();
        strategy.call();
        long end = System.currentTimeMillis();
        long result = end - begin;
        log.info("resultTime: {}", result);
    }
}
