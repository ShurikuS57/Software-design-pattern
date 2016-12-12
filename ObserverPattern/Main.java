package ObserverPattern;

public class Main {

    public static void main(String[] args) {
        ServerNews serverNews = new ServerNews();

        User user1 = new User("User №1");
        User user2 = new User("User №2");
        User user3 = new User("User №3");

        serverNews.addObserver(user1);
        serverNews.addObserver(user2);
        serverNews.addObserver(user3);
        serverNews.notifyObserver();

        serverNews.removeObserver(user2);
        serverNews.removeObserver(user1);
        serverNews.notifyObserver();

    }
}
