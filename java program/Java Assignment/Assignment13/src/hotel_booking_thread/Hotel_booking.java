//program to handle total earning (like you want to create a application for hotel booking and suppose 10 rooms book on that day).
package hotel_booking_thread;

public class Hotel_booking extends Thread {

    int booking_amount;
    private static int total_earning;   //declairing variable static to share by all threads;
    int Room_no;
    Hotel_booking(int booking_amt,int room){
        this.booking_amount=booking_amt;
        this.Room_no=room;
    }

    @Override
    public synchronized void run() {

        total_earning+=booking_amount;

        System.out.println(Thread.currentThread().getName()+"\nRoom No. "+Room_no+" is Booked for Amount:- "+booking_amount+"\nTotal Earning:- "+total_earning);
        System.out.println();

    }
}
