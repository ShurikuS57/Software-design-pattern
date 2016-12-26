package FactoryPattern;

public class Main {

    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();

        Car mercedes = carFactory.createCar(Mercedes.MERCEDES);
        print(mercedes);

        Car porsche = carFactory.createCar(Porsche.PORSCHE);
        print(porsche);

        Car lamborghini = carFactory.createCar(Lamborghini.LAMBORGHINI);
        print(lamborghini);

    }

    private static void print(Car car) {
        if(car != null){
            System.out.println("Name: " + car.getName());
            System.out.println("Max speed: " + car.getMaxSpeed());
        }
    }
}
