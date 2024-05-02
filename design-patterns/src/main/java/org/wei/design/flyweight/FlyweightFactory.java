package org.wei.design.flyweight;


import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private static final Map<String, WebSite> pool = new HashMap<>();

    public static WebSite getWebSiteCategory(String tpye)
    {
        if (!pool.containsKey(tpye))
        {
            pool.put(tpye, new ConcreteWebSite(tpye));
        }
        return pool.get(tpye);
    }
}
