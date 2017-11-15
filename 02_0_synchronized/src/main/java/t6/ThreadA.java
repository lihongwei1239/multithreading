package t6;


public class ThreadA extends Thread {

    private Service object;

    public ThreadA(Service object) {
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.service1();
    }
}
