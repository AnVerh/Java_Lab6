package Lab6;

public class EconomyClassWagon extends Wagon {
    public int wagonNumber = 0;
    public static int wagonCount = 0;
//    public int passengerCount;
//    public int luggageCount;
//    public int comfortLevel = 1;
    public EconomyClassWagon(int passengerCount, int luggageCount){
        super(passengerCount, luggageCount, 1);
//        this.passengerCount = passengerCount;
//        this.luggageCount = luggageCount;
        wagonNumber += 1;
        wagonCount++;
        wagonNumber = wagonCount;
    }
    public int getWagonNumber(){
        return wagonNumber;
    }
//    @Override
//    public String toString(){
//        return "Economy class wagon number %s".formatted(wagonNumber);
//    }
}
