package url_shortener;

import sorted_unique_elements.SortedUnique;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class UrlShortner {
    private String url;

    Scanner scanner=new Scanner(System.in);

    Hashtable<String,String> url_list=new Hashtable<>();

    public String urlShort(String url)
    {
        String str[]=url.split("\\.");

        return str[1];
    }

    public void addUrl(String url,String short_url)
    {
        url_list.put(short_url,url);
        System.out.println("Url Stored Successfully");
    }

    public void displayUrl()
    {
        for (Map.Entry u:url_list.entrySet())
        {
            System.out.println(u);
        }

    }

    public String inputurl()
    {
        System.out.println("Please enter url");
        url= scanner.next();
        return url;
    }
}
