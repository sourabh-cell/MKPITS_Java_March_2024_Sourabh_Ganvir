package browser_cache_simulation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class CacheSimulation {


    LinkedHashMap<String,String> cache=new LinkedHashMap<>();





    public void addCache(String url,String page)
    {

        if (cache.size()>4)
        {
            Set<String> keys=cache.keySet();
            for (String k:keys)
            {
                cache.remove(k);
                cache.put(url, page);
               break;

            }

        }
        else
        {
            cache.put(url,page);
        }
    }

    public void displayCahe()
    {
        System.out.println(cache.size());
        for (Map.Entry c:cache.entrySet())
        {
            System.out.println(c);
        }
    }

    public void accessCache(String page)
    {
        for (Map.Entry c:cache.entrySet())
        {
            if (c.getValue()==page)
             System.out.println(c);
        }
    }
}
