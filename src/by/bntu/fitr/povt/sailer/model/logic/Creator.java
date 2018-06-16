package by.bntu.fitr.povt.sailer.model.logic;

import by.bntu.fitr.povt.sailer.model.entity.Carriage;
import by.bntu.fitr.povt.sailer.model.entity.CargoCarriage;
import by.bntu.fitr.povt.sailer.model.entity.PassengerCarriage;
import by.bntu.fitr.povt.sailer.model.entity.container.Train;

public class Creator {

    public static Train createTrain() {
        return new Train();
    }

    public static Train createTrain(int size) {
        return new Train(size);
    }

    public static Carriage createCarriage(int len, int weight, boolean wear) {
        return new Carriage(len, weight, wear);
    }

    public static Carriage createPassengerCarriage(int len, int weight, int number, boolean wear) {
        return new PassengerCarriage(len, weight, number, wear);
    }

    public static Carriage createCargoCarriage(int len, int weight, int volume, int capacity, boolean wear) {
        return new CargoCarriage(len, weight, volume, capacity, wear);
    }
}
