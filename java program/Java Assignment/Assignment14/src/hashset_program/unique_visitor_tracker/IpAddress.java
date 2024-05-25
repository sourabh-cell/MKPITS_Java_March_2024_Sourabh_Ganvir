package hashset_program.unique_visitor_tracker;

public class IpAddress {

    String ip;



    public IpAddress(String ip) {
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "IpAddress{" +
                "ip='" + ip + '\'' +
                '}';
    }

    public static void main(String[] args) {

    }
}
