package t4;


import t1.CommonUtils;

public class MyThreadA2 extends Thread {

    private Task task;

    public MyThreadA2(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        CommonUtils.beginTime2 = System.currentTimeMillis();
        task.doLongTTimeask();
        CommonUtils.endTime2 = System.currentTimeMillis();
    }
}
