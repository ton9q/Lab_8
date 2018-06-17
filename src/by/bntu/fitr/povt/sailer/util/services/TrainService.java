package by.bntu.fitr.povt.sailer.util.services;


import by.bntu.fitr.povt.sailer.model.entity.Carriage;
import by.bntu.fitr.povt.sailer.model.entity.container.Train;

public class TrainService {
    private static TrainService instance;
    private int maxLengthTrain = 100;

    private TrainService() {
    }

    private TrainService(int maxLengthTrain) {
        this.maxLengthTrain = maxLengthTrain;
    }

    public static TrainService getInstance() {
        if (instance == null) {
            instance = new TrainService();
        }
        return instance;
    }

    public static TrainService getInstance(int maxLength) {
        if (instance == null) {
            instance = new TrainService(maxLength);
        }
        return instance;
    }

    public void addCarriage(Train train, Carriage carriage) {
        if (train.getSize() < maxLengthTrain) {
            train.addCarriage(carriage);
        } else {
            System.out.println("Sorry, but this train have maximum number of carriages");
        }
    }

    public static void deleteCarriage(Train train, int index) {
        train.deleteCarriage(index);
    }

    public static Carriage findCarriageByIndex(Train train, int index) {
        return train.getCarriage(index);
    }
}
