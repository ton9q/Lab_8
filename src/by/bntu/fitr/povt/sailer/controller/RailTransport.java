package by.bntu.fitr.povt.sailer.controller;

import by.bntu.fitr.povt.sailer.model.entity.CargoCarriage;
import by.bntu.fitr.povt.sailer.model.entity.PassengerCarriage;
import by.bntu.fitr.povt.sailer.model.entity.container.Train;
import by.bntu.fitr.povt.sailer.model.logic.Sorter;
import by.bntu.fitr.povt.sailer.model.services.TrainService;
import by.bntu.fitr.povt.sailer.model.services.TrainCountService;
import by.bntu.fitr.povt.sailer.view.View;

public class RailTransport {

    public static void main(String[] args) {
        Train train = new Train(10);

        PassengerCarriage passengerCarriage1 = new PassengerCarriage(1, 1, 1, false);
        PassengerCarriage passengerCarriage2 = new PassengerCarriage(2, 1, 1, false);
        PassengerCarriage passengerCarriage3 = new PassengerCarriage(5, 1, 1, true);
        PassengerCarriage passengerCarriage4 = new PassengerCarriage(4, 1, 1, false);
        PassengerCarriage passengerCarriage5 = new PassengerCarriage(3, 1, 1, false);
        CargoCarriage cargoCarriage1 = new CargoCarriage(2, 2, 1, 20, false);
        CargoCarriage cargoCarriage2 = new CargoCarriage(3, 1, 1, 10, true);

        TrainService.addCarriage(train, passengerCarriage1);
        TrainService.addCarriage(train, passengerCarriage2);
        TrainService.addCarriage(train, cargoCarriage1);
        TrainService.addCarriage(train, passengerCarriage3);
        TrainService.addCarriage(train, passengerCarriage4);
        TrainService.addCarriage(train, passengerCarriage5);
        TrainService.addCarriage(train, cargoCarriage2);
        TrainService.deleteCarriage(train, 2);
        Sorter.sortCarriagesByLength(train);

        System.out.println("Number of passengers: " + TrainCountService.countAmountOfPeople(train));
        System.out.println("Total number of weight: " + TrainCountService.countWeight(train));
        View.show("\n" + train + "");

    }
}
