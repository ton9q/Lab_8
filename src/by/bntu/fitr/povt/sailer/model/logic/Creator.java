package by.bntu.fitr.povt.sailer.model.logic;

import by.bntu.fitr.povt.sailer.model.entity.Carriage;
import by.bntu.fitr.povt.sailer.model.entity.CargoCarriage;
import by.bntu.fitr.povt.sailer.model.entity.PassengerCarriage;

public class Creator {

    public Carriage createPassengerCarriage(int len, int weight, int number, boolean wear) {
        return new PassengerCarriage(len, weight, number, wear);
    }

    public Carriage createCargoCarriage(int len, int weight, int volume, int capacity, boolean wear) {
        return new CargoCarriage(len, weight, volume, capacity, wear);
    }
}
