package hello.advanced.logtrace;

import hello.advanced.trace.TraceStatus;
import hello.advanced.trace.logtrace.FieldLogTrace;
import hello.advanced.trace.logtrace.ThreadLocalLogTrace;
import org.junit.jupiter.api.Test;

public class ThreadLocalLogTraceTest {
    ThreadLocalLogTrace trace = new ThreadLocalLogTrace();

    @Test
    void begin_end() {
        TraceStatus status1 = trace.begin("hello");
        TraceStatus status2 = trace.begin("hello2");
        trace.end(status2);
        trace.end(status1);
    }

    @Test
    void begin_exception() {
        TraceStatus status1 = trace.begin("hello");
        TraceStatus status2 = trace.begin("hello2");
        trace.exception(status2, new IllegalStateException());
        trace.exception(status1, new IllegalStateException());
    }
}
