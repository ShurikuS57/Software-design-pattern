package FactoryPattern;

public class Mercedes implements Car {

    public static final String MERCEDES = "Mercedes";

    @Override
    public String getName() {
        return MERCEDES;
    }

    @Override
    public String getMaxSpeed() {
        return "250 km/h";
    }
}
