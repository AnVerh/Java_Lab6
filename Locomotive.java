package Lab6;

public class Locomotive implements RailwayTransport {
    private String model;
    private int power; //кВт
    public Locomotive(String model, int power){
        this.model = model;
        this.power = power;
    }
    public String getModel(){return model;}
    @Override
    public String toString() {
        return getClass().getSimpleName() + " model " + getModel();
    }
}
