package Lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Train {
    ArrayList<RailwayTransport> train;
    List<Wagon> wagons;
    public Train(ArrayList<RailwayTransport> train){
        this.train = train;
        this.wagons = new ArrayList<>();
        for(RailwayTransport component : train){
            if(component instanceof Wagon){
                wagons.add((Wagon) component);
                System.out.println("Wagon %s added".formatted(component.toString()));
            }
            else{
                System.out.println("%s added".formatted(component.toString()));
            }

        }
    }
    public Train(){
        this.train = new ArrayList<RailwayTransport>();
        wagons = new ArrayList<Wagon>();
    }
    public ArrayList<RailwayTransport> getTrain(){
        return train;
    }


    @Override
    public String toString()
    {
        return train.toString();
    }
    public void addComponent(RailwayTransport component){
        train.add(component);
        if(component instanceof Wagon){
            wagons.add((Wagon) component);
            System.out.println("Wagon %s added".formatted(component.toString()));
        }
    }

//    public void addWagon(Wagon wagon) {
//        wagons.add(wagon);
//    }

    public int getTotalPassengerCount() {
        int total = 0;
        for (Wagon wagon : wagons) {
            total += wagon.getPassengerCount();
        }
        return total;
    }
    public int getTotalLuggageCount() {
        int total = 0;
        for (Wagon wagon : wagons) {
            total += wagon.getLuggageCount();
        }
        return total;
    }

//    public void sortWagonsByComfortLevel() {
//        Collections.sort(wagons, Comparator.comparing(Wagon::getComfortLevel));
//        //return false;
//    }
    public void sortWagonsByComfortLevel() {
        // Sort the wagons based on comfort level
        Collections.sort(wagons);
        for(Wagon wagon : wagons){
            System.out.println(wagon.toString());
        }
    }

    public List<Wagon> findWagonsByPassengerRange(int min, int max) {
        List<Wagon> result = new ArrayList<>();
        StringBuilder result_str = new StringBuilder("");
        for (Wagon wagon : wagons) {
            if (wagon.getPassengerCount() >= min && wagon.getPassengerCount() <= max) {
                result.add(wagon);
            }
        }
        return result;
    }
}
