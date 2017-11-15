package t4;


import t1.CommonUtils;

public class MyThreadA1 extends Thread {

    private Task task;

    public MyThreadA1(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        CommonUtils.beginTime1 = System.currentTimeMillis();
        task.doLongTTimeask();
        CommonUtils.endTime1 = System.currentTimeMillis();
    }
}
