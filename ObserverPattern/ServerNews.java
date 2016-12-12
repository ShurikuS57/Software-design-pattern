package ObserverPattern;

import java.util.ArrayList;

public class ServerNews implements Observable{

    private ArrayList<Observer> observers;

    public ServerNews() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer observers:observers){
            observers.updateNews();
        }
    }
}
