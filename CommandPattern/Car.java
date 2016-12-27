package CommandPattern;

public class Car implements Machine {

    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    @Override
    public void turnLeft() {
        System.out.println("Car turned left");
    }

    @Override
    public void turnRight() {
        System.out.println("Car turned right");
    }

    @Override
    public void straightLine() {
        System.out.println("Car in a straight line");
    }
}
