package t6;


public class Run {

    public static  void  main(String[] args){

        Service object = new Service();
        ThreadA threadA = new ThreadA(object);
        threadA.setName("A");
        threadA.start();


    }

}
