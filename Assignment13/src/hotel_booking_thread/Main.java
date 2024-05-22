package hotel_booking_thread;



public class Main {
    public static void main(String[] args) {



        for (int i = 0; i < 10; i++)
        {
           int booking_amt = (int) (Math.random() * 100) + 50;
            Thread hotel= new Hotel_booking(booking_amt, i);
            synchronized (hotel)
            {
                hotel.start();
            }
        }
    }
}