package FactoryPattern;

public class Lamborghini implements Car {

    public static final String LAMBORGHINI = "Lamborghini";
        
    @Override
    public String getName() {
        return LAMBORGHINI;
    }

    @Override
    public String getMaxSpeed() {
        return "320 km/h";
    }
}
