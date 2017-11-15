package t4;


public class Run {

    public static  void  main(String[] args){

        MyObject object = new MyObject();
        ThreadA threadA = new ThreadA(object);
        threadA.setName("A");
        threadA.start();
        ThreadB threadB = new ThreadB(object);
        threadB.setName("B");
        threadB.start();


    }

}
