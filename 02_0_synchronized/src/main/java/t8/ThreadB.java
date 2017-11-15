package t8;



public class ThreadB extends Thread {


    private Sub object;

    public ThreadB(Sub object) {
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.serviceMethod();
    }
}
