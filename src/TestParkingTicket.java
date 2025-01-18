//public class TestParkingTicket {
//
//    public static void main(String args[]){
//        testWithinParkingTime();
//        testOverParkingTime();
//        testCaseBarelyWithInParkingTime();
//        testBarelyOverParkingTime();
//        testExactlyAtParkingTimePurchased();
//
//
//    }
//    // Test case 1 : The ParkedCar is within the parking time purchased.
//    public static void testWithinParkingTime() {
//        System.out.println("Test case 1 : within parking time purchased");
//        System.out.println("============================================");
//
//        ParkedCar car = new ParkedCar("Toyota", "Camry", "Blue", "ABC123", 50);
//        ParkingMeter meter = new ParkingMeter(60);
//        PoliceOfficer officer = new PoliceOfficer("John Duo", 5786);
//        ParkingTicket ticket = officer.issueTicket(car, meter);
//        if (ticket == null) {
//            System.out.println("Pass: No ticket issued. Car is legally parked.\n");
//            System.out.println(car.getParkedMinutes());
//            System.out.println(meter.getPurchasedMinutes());
//        } else {
//            System.out.println(car.getParkedMinutes());
//            System.out.println(meter.getPurchasedMinutes());
//            System.out.println(ticket.getTicketDetails() + "\n");
//        }
//
//    }
//
//    // Test case 2 : The ParkedCar is over the parking time purchased.
//    public static void testOverParkingTime(){
//        System.out.println("Test Case 2 : Over Parking Time");
//        System.out.println("===============================");
//
//        ParkedCar car = new ParkedCar("Honda", "Civic", "Red", "XYZ789", 140);
//        ParkingMeter meter = new ParkingMeter(60);
//        PoliceOfficer officer = new PoliceOfficer("John Duo", 5786);
//
//        ParkingTicket ticket = officer.issueTicket(car, meter);
//        if(ticket != null){
//            System.out.println(car.getParkedMinutes());
//            System.out.println(meter.getPurchasedMinutes());
//            System.out.println("Pass: Ticket issued");
//            System.out.println(ticket.getTicketDetails() + "\n");
//        }
//        else{
//            System.out.println(car.getParkedMinutes());
//            System.out.println(meter.getPurchasedMinutes());
//            System.out.println("No ticket issued. Car is legally parked.\n");
//        }
//
//
//    }
//
//    // Test case 3 :  The ParkedCar is just barely within the parking time purchased.
//    public static void testCaseBarelyWithInParkingTime(){
//        System.out.println("Test case 3 : within parking time purchased");
//        System.out.println("============================================");
//
//        ParkedCar car = new ParkedCar("Toyota", "Camry", "Blue", "ABC123", 60);
//        ParkingMeter meter = new ParkingMeter(60);
//        PoliceOfficer officer = new PoliceOfficer("John Duo", 5786);
//        ParkingTicket ticket = officer.issueTicket(car, meter);
//        if (ticket == null) {
//            System.out.println(car.getParkedMinutes());
//            System.out.println(meter.getPurchasedMinutes());
//            System.out.println("No ticket issued. Car is legally parked.\n");
//        } else {
//            System.out.println(car.getParkedMinutes());
//            System.out.println(meter.getPurchasedMinutes());
//            System.out.println( ticket.getTicketDetails() + "\n");
//        }
//    }
//
//    // Test case 4 : The ParkedCar is just barely over the parking time purchased.
//    public static void testBarelyOverParkingTime(){
//        System.out.println("Test case 4 : Barely over parking time purchased");
//        System.out.println("============================================");
//
//        ParkedCar car = new ParkedCar("Toyota", "Camry", "Blue", "ABC123", 64);
//        ParkingMeter meter = new ParkingMeter(60);
//        PoliceOfficer officer = new PoliceOfficer("John Duo", 5786);
//        ParkingTicket ticket = officer.issueTicket(car, meter);
//        if (ticket == null) {
//            System.out.println(car.getParkedMinutes());
//            System.out.println(meter.getPurchasedMinutes());
//            System.out.println("Pass: No ticket issued. Car is legally parked.\n");
//        } else {
//            System.out.println("Pass: Ticket Issued\n");
//            System.out.println(car.getParkedMinutes());
//            System.out.println(meter.getPurchasedMinutes());
//            System.out.println(ticket.getTicketDetails() + "\n");
//        }
//    }
//
//    // Test case 5 :  The ParkedCar is exactly at the parking time purchased.
//    public static void testExactlyAtParkingTimePurchased(){
//        System.out.println("Test Case 5 : Exactly at the parking time purchased");
//        System.out.println("======================================================");
//
//        ParkedCar car = new ParkedCar("Toyota", "Camry", "Blue", "ABC123", 60);
//        ParkingMeter meter = new ParkingMeter(60);
//        PoliceOfficer officer = new PoliceOfficer("John Duo", 5786);
//        ParkingTicket ticket = officer.issueTicket(car, meter);
//        if (ticket == null) {
//            System.out.println(car.getParkedMinutes());
//            System.out.println(meter.getPurchasedMinutes());
//            System.out.println("Pass: No ticket issued. Car is legally parked.\n");
//        } else {
//            System.out.println(car.getParkedMinutes());
//            System.out.println(meter.getPurchasedMinutes());
//            System.out.println("Pass: Ticket Issued\n");
//            System.out.println(ticket.getTicketDetails() + "\n");
//        }
//
//}
//    // Test case 6 :  The ParkedCar is ticketed for being less than 1 hour over the time purchased.
//    // Test case 7 :  The ParkedCar is ticketed for being more than 1 hour over the time purchased.
//
//    // Test case 8 :  The ParkedCar is ticketed for being exactly 1 hour over the time purchased.
//
//}
//
//

public class TestParkingTicket {

    public static void main(String[] args) {
        // Create an array of test cases (polymorphism in action)
        ParkingTestCase[] tests = new ParkingTestCase[] {
                new TestWithinParkingTime(),
                new TestOverParkingTime(),
                new TestBarelyWithinParkingTime(),
                new TestBarelyOverParkingTime(),
                new TestExactlyAtParkingTime(),
                new TestLessThanOneHourOver(),
                new TestMoreThanOneHourOver(),
                new TestExactlyOneHourOver()
        };

        // Run all test cases
        for (ParkingTestCase test : tests) {
            test.runTest();
        }
    }

    // Abstract test case class
    abstract static class ParkingTestCase {
        // Abstract method to run the test
        public abstract void runTest();
    }

    // Test case 1: The ParkedCar is within the parking time purchased.
    static class TestWithinParkingTime extends ParkingTestCase {
        @Override
        public void runTest() {
            System.out.println("Test case 1 : within parking time purchased");
            System.out.println("============================================");

            ParkedCar car = new ParkedCar("Toyota", "Camry", "Blue", "ABC123", 50);
            ParkingMeter meter = new ParkingMeter(60);
            PoliceOfficer officer = new PoliceOfficer("John Duo", 5786);
            ParkingTicket ticket = officer.issueTicket(car, meter);
            if (ticket == null) {
                System.out.println("Pass: No ticket issued. Car is legally parked.\n");
            } else {
                System.out.println("Fail: Ticket should not be issued when parked within the purchased time.\n");
                System.out.println(ticket.getTicketDetails() + "\n");
            }
        }
    }

    // Test case 2: The ParkedCar is over the parking time purchased.
    static class TestOverParkingTime extends ParkingTestCase {
        @Override
        public void runTest() {
            System.out.println("Test Case 2 : Over Parking Time");
            System.out.println("===============================");

            ParkedCar car = new ParkedCar("Honda", "Civic", "Red", "XYZ789", 140);
            ParkingMeter meter = new ParkingMeter(60);
            PoliceOfficer officer = new PoliceOfficer("John Duo", 5786);
            ParkingTicket ticket = officer.issueTicket(car, meter);
            if (ticket != null) {
                System.out.println("Pass: Ticket issued");
                System.out.println(ticket.getTicketDetails() + "\n");
            } else {
                System.out.println("Fail: Ticket should be issued when the car is over the purchased time.\n");
            }
        }
    }

    // Test case 3: The ParkedCar is just barely within the parking time purchased.
    static class TestBarelyWithinParkingTime extends ParkingTestCase {
        @Override
        public void runTest() {
            System.out.println("Test case 3 : Barely within parking time purchased");
            System.out.println("====================================================");

            ParkedCar car = new ParkedCar("Toyota", "Camry", "Blue", "ABC123", 60);
            ParkingMeter meter = new ParkingMeter(60);
            PoliceOfficer officer = new PoliceOfficer("John Duo", 5786);
            ParkingTicket ticket = officer.issueTicket(car, meter);
            if (ticket == null) {
                System.out.println("Pass: No ticket issued. Car is legally parked.\n");
            } else {
                System.out.println("Fail: Ticket should not be issued when car is exactly at the purchased time.\n");
                System.out.println(ticket.getTicketDetails() + "\n");
            }
        }
    }

    // Test case 4: The ParkedCar is just barely over the parking time purchased.
    static class TestBarelyOverParkingTime extends ParkingTestCase {
        @Override
        public void runTest() {
            System.out.println("Test case 4 : Barely over parking time purchased");
            System.out.println("================================================");

            ParkedCar car = new ParkedCar("Toyota", "Camry", "Blue", "ABC123", 64);
            ParkingMeter meter = new ParkingMeter(60);
            PoliceOfficer officer = new PoliceOfficer("John Duo", 5786);
            ParkingTicket ticket = officer.issueTicket(car, meter);
            if (ticket == null) {
                System.out.println("Fail: Ticket should be issued when car is barely over the purchased time.\n");
            } else {
                System.out.println("Pass: Ticket Issued\n");
                System.out.println(ticket.getTicketDetails() + "\n");
            }
        }
    }

    // Test case 5: The ParkedCar is exactly at the parking time purchased.
    static class TestExactlyAtParkingTime extends ParkingTestCase {
        @Override
        public void runTest() {
            System.out.println("Test Case 5 : Exactly at the parking time purchased");
            System.out.println("======================================================");

            ParkedCar car = new ParkedCar("Toyota", "Camry", "Blue", "ABC123", 60);
            ParkingMeter meter = new ParkingMeter(60);
            PoliceOfficer officer = new PoliceOfficer("John Duo", 5786);
            ParkingTicket ticket = officer.issueTicket(car, meter);
            if (ticket == null) {
                System.out.println("Pass: No ticket issued. Car is legally parked.\n");
            } else {
                System.out.println("Fail: Ticket should not be issued when car is exactly at the purchased time.\n");
                System.out.println(ticket.getTicketDetails() + "\n");
            }
        }
    }

    // Test case 6: The ParkedCar is ticketed for being less than 1 hour over the time purchased.
    static class TestLessThanOneHourOver extends ParkingTestCase {
        @Override
        public void runTest() {
            System.out.println("Test case 6 : Less than 1 hour over the time purchased");
            System.out.println("=======================================================");

            ParkedCar car = new ParkedCar("Ford", "Focus", "Green", "LMN456", 70); // 10 minutes over
            ParkingMeter meter = new ParkingMeter(60);
            PoliceOfficer officer = new PoliceOfficer("John Duo", 5786);
            ParkingTicket ticket = officer.issueTicket(car, meter);
            if (ticket != null) {
                System.out.println("Pass: Ticket issued");
                System.out.println(ticket.getTicketDetails() + "\n");
            } else {
                System.out.println("Fail: Ticket should be issued even for less than 1 hour over the purchased time.\n");
            }
        }
    }

    // Test case 7: The ParkedCar is ticketed for being more than 1 hour over the time purchased.
    static class TestMoreThanOneHourOver extends ParkingTestCase {
        @Override
        public void runTest() {
            System.out.println("Test case 7 : More than 1 hour over the time purchased");
            System.out.println("=======================================================");

            ParkedCar car = new ParkedCar("BMW", "X5", "Black", "OPQ123", 150); // 90 minutes over
            ParkingMeter meter = new ParkingMeter(60);
            PoliceOfficer officer = new PoliceOfficer("John Duo", 5786);
            ParkingTicket ticket = officer.issueTicket(car, meter);
            if (ticket != null) {
                System.out.println("Pass: Ticket issued");
                System.out.println(ticket.getTicketDetails() + "\n");
            } else {
                System.out.println("Fail: Ticket should be issued when the car is more than 1 hour over the purchased time.\n");
            }
        }
    }

    // Test case 8: The ParkedCar is ticketed for being exactly 1 hour over the time purchased.
    static class TestExactlyOneHourOver extends ParkingTestCase {
        @Override
        public void runTest() {
            System.out.println("Test case 8 : Exactly 1 hour over the time purchased");
            System.out.println("=====================================================");

            ParkedCar car = new ParkedCar("Nissan", "Altima", "White", "RST789", 120); // 1 hour over
            ParkingMeter meter = new ParkingMeter(60);
            PoliceOfficer officer = new PoliceOfficer("John Duo", 5786);
            ParkingTicket ticket = officer.issueTicket(car, meter);
            if (ticket != null) {
                System.out.println("Pass: Ticket issued");
                System.out.println(ticket.getTicketDetails() + "\n");
            } else {
                System.out.println("Fail: Ticket should be issued when the car is exactly 1 hour over the purchased time.\n");
            }
        }
    }
}


