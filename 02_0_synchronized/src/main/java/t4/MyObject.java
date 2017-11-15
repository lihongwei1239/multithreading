package t4;

public class MyObject {

    public synchronized  void methohA(){
        try{
            System.out.println("begin methohA threadName=" + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end endTime =" + System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }


    public synchronized  void methodB(){
        try{
            System.out.println("begin methodB threadName=" + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end endTime =" + System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
