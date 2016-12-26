package FactoryPattern;

public class CarFactory {

    public Car createCar(String type){
        if(type.equals(Lamborghini.LAMBORGHINI)){
            return new Lamborghini();
        }else if(type.equals(Mercedes.MERCEDES)){
            return new Mercedes();
        }else if(type.equals(Porsche.PORSCHE)){
            return new Porsche();
        }else {
            return null;
        }

    }
}
