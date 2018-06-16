package by.bntu.fitr.povt.sailer.model.logic;

import by.bntu.fitr.povt.sailer.model.entity.Carriage;
import by.bntu.fitr.povt.sailer.model.entity.container.Train;
import by.bntu.fitr.povt.sailer.util.services.TrainService;

public class Sorter {

    public static void sortCarriagesByLength(Train train) {
        for (int i = 0; i < train.getSize() - 1; i++) {
            for (int j = 0; j < train.getSize() - i - 1; j++) {
                Carriage carriage1 = TrainService.findCarriageByIndex(train, j);
                Carriage carriage2 = TrainService.findCarriageByIndex(train, j + 1);

                if (carriage1.getLength() > carriage2.getLength()) {
                    train.setCarriage(carriage2, j);
                    train.setCarriage(carriage1, j + 1);
                }

            }
        }
    }

    public static void sortCarriagesByWeight(Train train) {
        for (int i = 0; i < train.getSize() - 1; i++) {
            for (int j = 0; j < train.getSize() - i - 1; j++) {
                Carriage carriage1 = TrainService.findCarriageByIndex(train, j);
                Carriage carriage2 = TrainService.findCarriageByIndex(train, j + 1);

                if (carriage1.getWeight() > carriage2.getWeight()) {
                    train.setCarriage(carriage2, j);
                    train.setCarriage(carriage1, j + 1);
                }

            }
        }
    }

}


