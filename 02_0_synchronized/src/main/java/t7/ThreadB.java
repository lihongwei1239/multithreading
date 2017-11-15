package t7;


public class ThreadB extends Thread {

    private Service object;

    public ThreadB(Service object) {
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.testMethod();;
    }
}
