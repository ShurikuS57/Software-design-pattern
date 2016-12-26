package FactoryPattern;

public class Porsche implements Car {

    public static final String PORSCHE = "Porsche";
        
    @Override
    public String getName() {
        return PORSCHE;
    }

    @Override
    public String getMaxSpeed() {
        return "280 km/h";
    }
}
