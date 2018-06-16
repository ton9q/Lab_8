package by.bntu.fitr.povt.sailer.util.services;


import by.bntu.fitr.povt.sailer.model.entity.Carriage;
import by.bntu.fitr.povt.sailer.model.entity.container.Train;

public class TrainService {
    public static void addCarriage(Train train, Carriage carriage) {
        train.addCarriage(carriage);
    }

    public static void deleteCarriage(Train train, int index) {
        train.deleteCarriage(index);
    }

    public static Carriage findCarriageByIndex(Train train, int index) {
        return train.getCarriage(index);
    }
}
