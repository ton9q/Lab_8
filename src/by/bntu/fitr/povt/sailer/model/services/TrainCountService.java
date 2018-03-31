package by.bntu.fitr.povt.sailer.model.services;

import by.bntu.fitr.povt.sailer.model.entity.container.Train;
import by.bntu.fitr.povt.sailer.model.entity.PassengerCarriage;


public class TrainCountService {
    public static int countAmountOfPeople(Train train) {
        int trainLength = train.getSize();
        int amount = 0;

        for (int i = 0; i < trainLength; i++) {
            if (train.getCarriage(i) instanceof PassengerCarriage) {
                amount += ((PassengerCarriage) TrainService.findCarriageByIndex(train, i)).getNumberPass();
            }
        }

        return amount;
    }

    public static double countWeight(Train train) {
        int trainLength = train.getSize();
        int weight = 0;

        for (int i = 0; i < trainLength; i++) {
            weight += (TrainService.findCarriageByIndex(train, i)).getWeight();
        }

        return weight;
    }
}