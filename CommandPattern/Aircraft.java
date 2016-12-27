package CommandPattern;

public class Aircraft implements Machine {

    @Override
    public void start() {
        System.out.println("Aircraft started");
    }

    @Override
    public void stop() {
        System.out.println("Aircraft stopped");
    }

    @Override
    public void turnLeft() {
        System.out.println("Aircraft turned left");
    }

    @Override
    public void turnRight() {
        System.out.println("Aircraft turned right");
    }

    @Override
    public void straightLine() {
        System.out.println("Aircraft in a straight line");
    }
}
