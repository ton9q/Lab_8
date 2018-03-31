//package by.bntu.fitr.povt.sailer.model.logic;
//
//import by.bntu.fitr.povt.sailer.model.entity.PassengerCarriage;
//import by.bntu.fitr.povt.sailer.model.entity.container.Train;
//import org.junit.Assert;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class SorterTest {
//    @Test
//    public void sortCarriagesByLength() throws Exception {
//        Train train1 = new Train(10);
//        Train train2 = new Train(10);
//
//        PassengerCarriage passengerCarriage1 = new PassengerCarriage(1,1,1,false);
//        PassengerCarriage passengerCarriage2 = new PassengerCarriage(2,1,1,false);
//        PassengerCarriage passengerCarriage3 = new PassengerCarriage(5,1,1,true);
//        PassengerCarriage passengerCarriage4 = new PassengerCarriage(4,1,1,false);
//        PassengerCarriage passengerCarriage5 = new PassengerCarriage(3,1,1,false);
//
//        train1.addCarriage(passengerCarriage1);
//        train1.addCarriage(passengerCarriage2);
//        train1.addCarriage(passengerCarriage3);
//        train1.addCarriage(passengerCarriage4);
//        train1.addCarriage(passengerCarriage5);
//        Sorter.sortCarriagesByLength(train1);
//
//        train2.addCarriage(passengerCarriage1);
//        train2.addCarriage(passengerCarriage2);
//        train2.addCarriage(passengerCarriage5);
//        train2.addCarriage(passengerCarriage4);
//        train2.addCarriage(passengerCarriage3);
//
//        Assert.assertArrayEquals(train1.getTrain(), train2.getTrain());
//    }
//
//}