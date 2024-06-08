package hello.advanced.template.code;

public abstract class AbstractTemplate {
    public void execute() {
        long begin = System.currentTimeMillis();
        call();
        long end = System.currentTimeMillis();
        System.out.println("resultTime: " + (end - begin));
    }

    protected abstract void call();
}
