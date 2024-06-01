package browser_cache_simulation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        CacheSimulation c= new CacheSimulation();


        while (true) {
            System.out.println("please enter choice\n1.Add Cache\n2.display Cache\n3.Access Cahe");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("please enter the URl");
                    String url = scanner.next();
                    System.out.println ("please enter the PageName");
                    String page = scanner.next();
                    c.addCache(url, page);
                    break;

                case 2:
                    c.displayCahe();
                    break;

                case 3:
                    System.out.println ("please enter the PageName");
                    page = scanner.next();
                    c.accessCache(page);
                    break;
            }


        }
    }
}
