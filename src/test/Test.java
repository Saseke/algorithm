package test;

public class Test {

    public static void main(String[] args) {
        try {
            System.out.println("start");
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(2000);
            myThread.interrupt();
            System.out.println("是否停止:" + myThread.interrupted());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Test test = new Test();

    }

    public static void test() {
        System.out.println("");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("run");
    }
}
