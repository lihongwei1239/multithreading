package t8;



public class ThreadA extends Thread {


    private Sub object;

    public ThreadA(Sub object) {
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.serviceMethod();
    }
}
