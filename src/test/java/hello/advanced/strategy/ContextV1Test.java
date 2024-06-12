package hello.advanced.strategy;

import hello.advanced.strategy.code.ContextV1;
import hello.advanced.strategy.code.StrategyLogic1;
import hello.advanced.strategy.code.StrategyLogic2;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class ContextV1Test {
    @Test
    void strategyV0() {
        logic1();
        logic2();
    }

    private void logic1() {
        long startTime = System.currentTimeMillis();
        log.info("비즈니스 로직1 실행");
        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;
        log.info("resultTime: {}", resultTime);
    }

    private void logic2() {
        long startTime = System.currentTimeMillis();
        log.info("비즈니스 로직2 실행");
        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;
        log.info("resultTime: {}", resultTime);
    }

    @Test
    void strategyV1() {
        StrategyLogic1 logic1 = new StrategyLogic1();
        ContextV1 contextV1 = new ContextV1(logic1);
        contextV1.execute();

        StrategyLogic2 logic2 = new StrategyLogic2();
        contextV1 = new ContextV1(logic2);
        contextV1.execute();
    }
}
