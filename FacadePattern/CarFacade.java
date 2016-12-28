package FacadePattern;

public class CarFacade {

    private EngineCar engine;
    private FuelSystem fuel;
    private OilIndicator oil;
    private SecuritySystem security;

    public CarFacade() {
        this.engine = new EngineCar();
        this.fuel = new FuelSystem();
        this.oil = new OilIndicator();
        this.security = new SecuritySystem();
    }

    public void startEngineCar(){
        fuel.fillTheTank();
        oil.checkOilLevel();
        security.checkSecurety();
        engine.startEngine();
    }
}
