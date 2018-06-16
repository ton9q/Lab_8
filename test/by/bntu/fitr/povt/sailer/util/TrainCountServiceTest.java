//package by.bntu.fitr.povt.sailer.util.services;
//
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class TrainCountServiceTest {
//    @Test
//    public void countAmountOfPeople() throws Exception {
//    }
//
//    @Test
//    public void countWeight() throws Exception {
//    }
//
//}



//public class TrainCountServiceTest {
//    @Test
//    public void testTestAmountOfPeople() {
//        PassengerCarriage pc1 = new PassengerCarriage(1, 2, 3);
//        PassengerCarriage pc2 = new PassengerCarriage(1, 2, 1);
//        PassengerCarriage pc3 = new PassengerCarriage(1, 2, 2);
//
//        FreightCarriage fc1 = new FreightCarriage(1, 2, 4);
//
//        Train train = new Train("1", 4);
//
//        TrainService.addCarriage(train, pc1);
//        TrainService.addCarriage(train, pc2);
//        TrainService.addCarriage(train, pc3);
//
//        TrainService.addCarriage(train, fc1);
//
//        Assert.assertEquals(6, TrainCountService.countAmountOfPeople(train, 0));
//    }
//
//    @Test
//    public void testTestMaxWeight() {
//        PassengerCarriage pc1 = new PassengerCarriage(1, 2, 3);
//
//        FreightCarriage fc1 = new FreightCarriage(1, 2, 4);
//        FreightCarriage fc2 = new FreightCarriage(1, 2, 5);
//        FreightCarriage fc3 = new FreightCarriage(1, 2, 2);
//
//        Train train = new Train("1", 4);
//
//        TrainService.addCarriage(train, pc1);
//        TrainService.addCarriage(train, fc1);
//        TrainService.addCarriage(train, fc2);
//
//        TrainService.addCarriage(train, fc3);
//
//        if (TrainCountService.countWeight(train) != 11) {
//            Assert.fail();
//        }
//    }
//}