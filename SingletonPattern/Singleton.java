package SingletonPattern;

public class Singleton {

    private static Singleton singleton;

    private int count = 1;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }
}
