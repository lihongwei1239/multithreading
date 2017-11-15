package t1;


public class Run {

    public static  void  main(String[] args) throws Exception{

        Task task = new Task();
        MyThreadA1 threadA1 = new MyThreadA1(task);
        threadA1.start();


        MyThreadA2 threadA2 = new MyThreadA2(task);
        threadA2.start();

        try{
            Thread.sleep(10000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        long beginTime = CommonUtils.beginTime1;
        if(CommonUtils.beginTime2 < CommonUtils.beginTime1){
            beginTime = CommonUtils.beginTime2;
        }
        long endTime = CommonUtils.endTime1;
        if(CommonUtils.endTime2 > CommonUtils.endTime1){
            beginTime = CommonUtils.endTime2;
        }
        System.out.println("耗时:"+((endTime - beginTime)/1000));
    }

}
