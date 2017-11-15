package t8;


public class Run {

    public static  void  main(String[] args) throws Exception{

        Sub object = new Sub();
        ThreadA threadA = new ThreadA(object);
        threadA.setName("a");
        threadA.start();
        Thread.sleep(5000);
        ThreadB threadB = new ThreadB(object);
        threadB.setName("b");
        threadB.start();


    }

}
