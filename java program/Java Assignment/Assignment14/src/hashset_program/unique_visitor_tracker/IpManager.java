package hashset_program.unique_visitor_tracker;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IpManager {

    Scanner scanner = new Scanner(System.in);
    Set<IpAddress> ipSet = new HashSet<>();


    public void addIp() {
        ipSet.add(new IpAddress("198.168.100.1"));
        ipSet.add(new IpAddress("198.168.100.2"));
        ipSet.add(new IpAddress("198.168.100.3"));
        ipSet.add(new IpAddress("198.168.100.4"));
        ipSet.add(new IpAddress("198.168.100.5"));
        ipSet.add(new IpAddress("198.168.100.6"));

    }

    public void removeIp()
    {
        System.out.println("Please Enter ip Address(198.168.100._)");
        String ip = scanner.next();

        for (IpAddress i : ipSet)
        {
            try {
                if (i.getIp().contentEquals(ip)) {
                    ipSet.remove(i);
                    System.out.println("Deleted");

                }
            }
            catch (Exception e){ displayIp(); }

        }
    }

        public void displayIp()
        {
            for (IpAddress i : ipSet)
            {
                System.out.println(i);
            }

        }

        public void visitedIp()
        {
            System.out.println("Please Enter ip Address(198.168.100._)");
            String ip = scanner.next();
            int flag = 0;

            for (IpAddress i : ipSet) {
                if (i.getIp().contentEquals(ip)) {
                    flag = 1;
                    System.out.println("IP Visited");
                    break;
                }


            }
            if (flag == 0) {
                System.out.println("ip not visited");
            }
        }


}


