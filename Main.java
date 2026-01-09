public class Main extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("child thread");
        }
    }

    public static void main(String[] args) {
        Main t = new Main(); // Create thread object
        t.start();           // Start new thread → calls run() in separate thread

        for (int i = 0; i < 10; i++) {
            System.out.println("main thread");
        }
    }
}
