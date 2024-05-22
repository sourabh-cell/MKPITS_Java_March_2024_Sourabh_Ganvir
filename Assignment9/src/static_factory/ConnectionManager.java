package static_factory;

public class ConnectionManager {
    static int limit=0;
    static int no_of_connection=0;
    public static void number_of_Connection(){
        if(no_of_connection>limit){
            System.out.println("limit Exceeded");
        }
        else{
            System.out.println("creating connection");
        }
    }
}
