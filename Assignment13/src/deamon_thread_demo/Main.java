package deamon_thread_demo;

public class Main {
    public static void main(String[] args) {



            DaemonThread daemonThread1 = new DaemonThread("THREAD 1");
            DaemonThread daemonThread2 = new DaemonThread("THREAD 2");
            DaemonThread daemonThread3 = new DaemonThread("THREAD 3");


        daemonThread1.start();
        daemonThread2.start();

        daemonThread3.setDaemon(true);
        daemonThread3.start();



    }
}