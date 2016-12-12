package ObserverPattern;

public class User implements Observer {

    private String userId;

    public User(String userId) {
        this.userId = userId;
    }

    @Override
    public void updateNews() {
        System.out.println(this.userId+" update.");
    }
}
