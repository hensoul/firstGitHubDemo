/**
 * Created by shaoheng.huang on 2015/9/22.
 */
public class Singleton {

    private static class InstanceHolder{
        protected static  final Singleton INSTANCE = new Singleton();
    }

    private Singleton(){}


    public static Singleton getInstance(){
        return InstanceHolder.INSTANCE;
    }
}
