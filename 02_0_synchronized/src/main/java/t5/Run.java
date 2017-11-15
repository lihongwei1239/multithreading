package t5;


public class Run {

    public static  void  main(String[] args) throws  Exception{

        PublicVar object = new PublicVar();
        ThreadA threadA = new ThreadA(object);
        threadA.start();
        Thread.sleep(200);
        object.getValue();

    }

}
