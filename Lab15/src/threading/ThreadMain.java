package threading;

public class ThreadMain {




    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Thread t = new Thread(new FileUpdater("Thread " + i + " wrote this message"));
            t.start();
        }
    }
}
