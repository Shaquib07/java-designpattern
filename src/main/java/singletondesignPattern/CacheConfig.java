package singletondesignPattern;

public class CacheConfig {

    /*
    *Thread-Safe Singleton
    * Eager Initialization Singleton.
    */
    private static final CacheConfig cacheConfig=new CacheConfig();

    private CacheConfig(){} //prevent other classes from creating objects using new
    public static CacheConfig getCacheConfig(){
        return cacheConfig;
    }
}
