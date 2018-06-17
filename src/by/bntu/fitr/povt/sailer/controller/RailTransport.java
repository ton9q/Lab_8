package by.bntu.fitr.povt.sailer.controller;

import by.bntu.fitr.povt.sailer.model.entity.Carriage;
import by.bntu.fitr.povt.sailer.model.entity.Storage;
import by.bntu.fitr.povt.sailer.model.entity.container.Train;
import by.bntu.fitr.povt.sailer.model.logic.Creator;
import by.bntu.fitr.povt.sailer.model.logic.Sorter;
import by.bntu.fitr.povt.sailer.util.services.TrainService;
import by.bntu.fitr.povt.sailer.util.services.TrainCountService;
import by.bntu.fitr.povt.sailer.view.View;

public class RailTransport {

    public static void main(String[] args) {

        Storage<Train> storage = new Storage<>();
        Train train = Creator.createTrain(10);
        TrainService trainService = TrainService.getInstance();

        Carriage passengerCarriage1 = Creator.createPassengerCarriage(10, 10, false);
        Carriage passengerCarriage2 = Creator.createPassengerCarriage(10, 15, false, "COMMON");
        Carriage passengerCarriage3 = Creator.createPassengerCarriage(10, 30,  true);
        Carriage passengerCarriage4 = Creator.createPassengerCarriage(10, 1,  false, "SITTING");
        Carriage passengerCarriage5 = Creator.createPassengerCarriage(10, 1,  false, "SLEEPING");
        Carriage cargoCarriage1 = Creator.createCargoCarriage(10, 300, false, 20, 20);
        Carriage cargoCarriage2 = Creator.createCargoCarriage(10, 200, true, 20, 10 );

        trainService.addCarriage(train, passengerCarriage1);
        trainService.addCarriage(train, passengerCarriage2);
        trainService.addCarriage(train, cargoCarriage1);
        trainService.addCarriage(train, passengerCarriage3);
        trainService.addCarriage(train, passengerCarriage4);
        trainService.addCarriage(train, passengerCarriage5);
        trainService.addCarriage(train, cargoCarriage2);

        TrainService.deleteCarriage(train, 2);

        Sorter.sortCarriagesByLength(train);

        storage.addEntity(train);

        System.out.println("Number of passengers: " + TrainCountService.countAmountOfPeople(train));
        System.out.println("Total number of weight: " + TrainCountService.countWeight(train));
        View.output("\n" + train);

    }
}
