package MultiThread;

public class TestThread extends Thread {
    @Override
    public void run() {
        for (int i=0; i< 100; i++) {
            System.out.println("TestThread is running " + i);
        }
    }
}
