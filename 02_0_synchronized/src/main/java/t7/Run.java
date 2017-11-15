package t7;


public class Run {

    public static  void  main(String[] args) throws Exception{

        Service object = new Service();
        ThreadA threadA = new ThreadA(object);
        threadA.setName("a");
        threadA.start();
        Thread.sleep(5000);
        ThreadB threadB = new ThreadB(object);
        threadB.setName("b");
        threadB.start();


    }

}
