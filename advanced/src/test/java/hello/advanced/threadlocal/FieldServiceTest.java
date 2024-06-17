package hello.advanced.threadlocal;

import hello.advanced.threadlocal.code.FieldService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class FieldServiceTest {
    FieldService service = new FieldService();

    @Test
    void field() {
        log.info("main start");
        Runnable userA = () -> {
            log.info("run start");
            service.logic("test a");
            log.info("run end");
        };
        Runnable userB = () -> {
            log.info("run start");
            service.logic("test b");
            log.info("run end");
        };
        Thread threadA = new Thread(userA);
        threadA.setName("thread-A");
        Thread threadB = new Thread(userB);
        threadB.setName("thread-B");

        threadA.start();
//        sleep(2000); //동시성 문제가 발생하지 않는 케이스
        sleep(100); //동시성 문제가 발생하는 케이스
        threadB.start();
        sleep(3000); //메인 쓰레드 종료 대기
        log.info("main exit");
    }

    private void sleep(int millis){
        try{
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
