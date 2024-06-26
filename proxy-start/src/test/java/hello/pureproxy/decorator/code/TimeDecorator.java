package hello.pureproxy.decorator.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TimeDecorator implements Component{
    private Component component;

    public TimeDecorator(Component component) {
        this.component = component;
    }

    @Override
    public String operation() {
        log.info("TimeDecorator 실행");
        long start = System.currentTimeMillis();
        String operation = component.operation();
        long end = System.currentTimeMillis();
        long time = end - start;
        log.info("TimeDecorator 종료 resultTime={}ms", time);
        return operation + " " + time + "ms";
    }
}
