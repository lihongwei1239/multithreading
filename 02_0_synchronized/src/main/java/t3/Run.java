package t3;

public class Run {

    public static  void  main(String[] args){

        HasSelfPrivateNum numRefA = new HasSelfPrivateNum();
        HasSelfPrivateNum numRefB = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(numRefA);
        threadA.start();
        ThreadB threadB = new ThreadB(numRefB);
        threadB.start();


    }

}
