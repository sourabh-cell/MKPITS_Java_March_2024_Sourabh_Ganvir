package url_shortener;

import employee_records_system.EmployeerecordSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        UrlShortner u = new UrlShortner();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("please enter choice\n1.Add Url\n2.display All Url\n3.Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    String url=u.inputurl();
                    u.addUrl(url, u.urlShort(url));
                    break;

                case 2:
                    u.displayUrl();
                    break;

                case 3:
                    System.exit(0);
                    break;

            }
        }
    }
}