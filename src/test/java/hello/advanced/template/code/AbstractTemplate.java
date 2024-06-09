package hello.advanced.template.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AbstractTemplate {
    public void execute() {
        long begin = System.currentTimeMillis();
        call();
        long end = System.currentTimeMillis();
        log.info("resultTime: {}", (end - begin));
    }

    protected abstract void call();
}
