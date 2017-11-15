package t5;



public class ThreadA extends Thread {

    private PublicVar object;

    public ThreadA(PublicVar object) {
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.setValue("B","BB");
    }
}
