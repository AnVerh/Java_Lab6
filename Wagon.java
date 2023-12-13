package Lab6;

public abstract class Wagon implements RailwayTransport, Comparable<Wagon>  {
    public int passengerCount;
    public int luggageCount;
    public int comfortLevel;


    public Wagon(int passengerCount, int luggageCount, int comfortLevel) {
        this.passengerCount = passengerCount;
        this.luggageCount = luggageCount;
        this.comfortLevel = comfortLevel;

    }

    public void WagonInformation(){
        String info = String.format("There are %s passengers, with %s luggage in total in a wagon with comfort level %s.", passengerCount, luggageCount, comfortLevel);
        System.out.println(info);
    }
    public int getPassengerCount(){
        return passengerCount;
    }
    public int getLuggageCount(){
        return luggageCount;
    }
    public int getComfortLevel(){
        return comfortLevel;
    }
    protected abstract int getWagonNumber();
    @Override
    public int compareTo(Wagon other) {
        int comfortLevelCompareResult = Integer.compare(getComfortLevel(), other.getComfortLevel());
        return comfortLevelCompareResult;
    }


    @Override
    public String toString() {
        return getClass().getSimpleName() + " number " + getWagonNumber();
    }
}
