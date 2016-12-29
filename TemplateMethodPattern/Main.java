package TemplateMethodPattern;

public class Main {

    public static void main(String[] args) {
        CarMaker blueCar = new BlueCar();
        blueCar.makeToy();

        CarMaker redCar = new RedCar();
        redCar.makeToy();
    }
}
