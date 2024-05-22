package deamon_thread_demo;

public class DaemonThread extends Thread {

    String s;
    public DaemonThread(String name){
        s=name;
    }

    public void run()
    {
        // Checking whether the thread is Daemon or not
        if(Thread.currentThread().isDaemon())
        {
            System.out.println(s + " is Daemon Thread");
        }

        else
        {
            System.out.println(s + " is User Thread");
        }
    }

}
