package Lab6;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Locomotive locomotive = new Locomotive("2ТЕ116", 45);
        EconomyClassWagon economy_wagon1 = new EconomyClassWagon(130, 105);
        EconomyClassWagon economy_wagon2 = new EconomyClassWagon(150, 180);
        BusinessClassWagon business_wagon = new BusinessClassWagon(130, 23);
        FirstClassWagon firstclass_wagon = new FirstClassWagon(70, 90);


        ArrayList<RailwayTransport> railwayTransports = new ArrayList<>(Arrays.asList(economy_wagon1, economy_wagon2, business_wagon));
        Train train = new Train(railwayTransports);
        train.addComponent(locomotive);
        train.addComponent(firstclass_wagon);
        System.out.println("Train consists of:");
        System.out.println(train.toString());

        System.out.println("Total number of passengers in the train: "+train.getTotalPassengerCount());
        System.out.println("Total number of luggage in the train: "+train.getTotalLuggageCount());

        System.out.println("Wagons with passenger range 120 to 150:");
        System.out.println(train.findWagonsByPassengerRange(120, 150));
        System.out.println("Sorted by comfort level wagons:");
        train.sortWagonsByComfortLevel();

    }
}

