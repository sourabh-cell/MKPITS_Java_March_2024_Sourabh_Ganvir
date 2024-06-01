package comparing_different_set;

public class Main {
    public static void main(String[] args) {


        Integer arr[] = {11, 12, 13, 14, 11, 12, 13, 78, 85, 95};
        Setcreation set = new Setcreation();

        set.addHashset(arr);
        set.addLinkedHashset(arr);
        set.addTreeset(arr);
        set.displayHashset();
        set.displayLinkedHashset();
        set.displayTreeset();
    }
}