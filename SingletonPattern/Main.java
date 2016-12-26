package SingletonPattern;

public class Main {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println("First count: " + singleton.getCount());
        singleton.setCount(100);

        Singleton singleton2 = Singleton.getInstance();
        System.out.println("Second count: " + singleton2.getCount());
    }
}
