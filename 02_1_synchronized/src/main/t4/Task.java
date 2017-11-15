package t4;

public class Task {

    public  void doLongTTimeask(){
        for (int i = 0; i < 100; i++) {
            System.out.println("nosynchronized threadname="+Thread.currentThread().getName()+" i="+i);
        }
        System.out.println("");
        synchronized (this){
            for (int i = 0; i < 100; i++) {
                System.out.println("synchronized threadname="+Thread.currentThread().getName()+" i="+i);
            }
        }

    }
}
