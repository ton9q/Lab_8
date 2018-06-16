package by.bntu.fitr.povt.sailer.controller;

import by.bntu.fitr.povt.sailer.model.entity.Carriage;
import by.bntu.fitr.povt.sailer.model.entity.container.Train;
import by.bntu.fitr.povt.sailer.model.logic.Creator;
import by.bntu.fitr.povt.sailer.model.logic.Sorter;
import by.bntu.fitr.povt.sailer.util.services.TrainService;
import by.bntu.fitr.povt.sailer.util.services.TrainCountService;
import by.bntu.fitr.povt.sailer.view.View;

public class RailTransport {

    public static void main(String[] args) {

        Train train = Creator.createTrain(10);

        Carriage passengerCarriage1 = Creator.createPassengerCarriage(10, 10, 50, false);
        Carriage passengerCarriage2 = Creator.createPassengerCarriage(10, 15, 50, false);
        Carriage passengerCarriage3 = Creator.createPassengerCarriage(10, 30, 50, true);
        Carriage passengerCarriage4 = Creator.createPassengerCarriage(10, 1, 50, false);
        Carriage passengerCarriage5 = Creator.createPassengerCarriage(10, 1, 50, false);
        Carriage cargoCarriage1 = Creator.createCargoCarriage(10, 300, 20, 20, false);
        Carriage cargoCarriage2 = Creator.createCargoCarriage(10, 200, 20, 10, true);

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
        View.output("\n" + train);

    }
}
