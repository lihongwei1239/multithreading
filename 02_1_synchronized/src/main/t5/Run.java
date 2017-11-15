package t5;

public class Run {

    public static  void  main(String[] args){
        ObjectService objectService = new ObjectService();
        ThreadA threadA = new ThreadA(objectService);
        threadA.start();
        ThreadB threadB = new ThreadB(objectService);
        threadB.start();
    }

}
