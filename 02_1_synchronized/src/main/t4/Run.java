package t4;


public class Run {

    public static  void  main(String[] args) throws Exception{

        Task task = new Task();
        MyThreadA1 threadA1 = new MyThreadA1(task);
        threadA1.start();


        MyThreadA2 threadA2 = new MyThreadA2(task);
        threadA2.start();


    }

}
