public class TestParkingTicket {

    public static void main(String args[]){
        testWithinParkingTime();
        testOverParkingTime();
        testCaseBarelyWithInParkingTime();
        testBarelyOverParkingTime();
        testExactlyAtParkingTimePurchased();


    }
    // Test case 1 : The ParkedCar is within the parking time purchased.
    public static void testWithinParkingTime() {
        System.out.println("Test case 1 : within parking time purchased");
        System.out.println("============================================");

        ParkedCar car = new ParkedCar("Toyota", "Camry", "Blue", "ABC123", 50);
        ParkingMeter meter = new ParkingMeter(60);
        PoliceOfficer officer = new PoliceOfficer("John Duo", 5786);
        ParkingTicket ticket = officer.issueTicket(car, meter);
        if (ticket == null) {
            System.out.println("Pass: No ticket issued. Car is legally parked.\n");
            System.out.println(car.getParkedMinutes());
            System.out.println(meter.getPurchasedMinutes());
        } else {
            System.out.println(car.getParkedMinutes());
            System.out.println(meter.getPurchasedMinutes());
            System.out.println(ticket.getTicketDetails() + "\n");
        }

    }

    // Test case 2 : The ParkedCar is over the parking time purchased.
    public static void testOverParkingTime(){
        System.out.println("Test Case 2 : Over Parking Time");
        System.out.println("===============================");

        ParkedCar car = new ParkedCar("Honda", "Civic", "Red", "XYZ789", 140);
        ParkingMeter meter = new ParkingMeter(60);
        PoliceOfficer officer = new PoliceOfficer("John Duo", 5786);

        ParkingTicket ticket = officer.issueTicket(car , meter);
        if(ticket != null){
            System.out.println(car.getParkedMinutes());
            System.out.println(meter.getPurchasedMinutes());
            System.out.println("Pass: Ticket issued");
            System.out.println(ticket.getTicketDetails() + "\n");
        }
        else{
            System.out.println(car.getParkedMinutes());
            System.out.println(meter.getPurchasedMinutes());
            System.out.println("No ticket issued. Car is legally parked.\n");
        }


    }

    // Test case 3 :  The ParkedCar is just barely within the parking time purchased.
    public static void testCaseBarelyWithInParkingTime(){
        System.out.println("Test case 3 : within parking time purchased");
        System.out.println("============================================");

        ParkedCar car = new ParkedCar("Toyota", "Camry", "Blue", "ABC123", 60);
        ParkingMeter meter = new ParkingMeter(60);
        PoliceOfficer officer = new PoliceOfficer("John Duo", 5786);
        ParkingTicket ticket = officer.issueTicket(car, meter);
        if (ticket == null) {
            System.out.println(car.getParkedMinutes());
            System.out.println(meter.getPurchasedMinutes());
            System.out.println("No ticket issued. Car is legally parked.\n");
        } else {
            System.out.println(car.getParkedMinutes());
            System.out.println(meter.getPurchasedMinutes());
            System.out.println( ticket.getTicketDetails() + "\n");
        }
    }

    // Test case 4 : The ParkedCar is just barely over the parking time purchased.
    public static void testBarelyOverParkingTime(){
        System.out.println("Test case 4 : Barely over parking time purchased");
        System.out.println("============================================");

        ParkedCar car = new ParkedCar("Toyota", "Camry", "Blue", "ABC123", 64);
        ParkingMeter meter = new ParkingMeter(60);
        PoliceOfficer officer = new PoliceOfficer("John Duo", 5786);
        ParkingTicket ticket = officer.issueTicket(car, meter);
        if (ticket == null) {
            System.out.println(car.getParkedMinutes());
            System.out.println(meter.getPurchasedMinutes());
            System.out.println("Pass: No ticket issued. Car is legally parked.\n");
        } else {
            System.out.println("Pass: Ticket Issued\n");
            System.out.println(car.getParkedMinutes());
            System.out.println(meter.getPurchasedMinutes());
            System.out.println(ticket.getTicketDetails() + "\n");
        }
    }

    // Test case 5 :  The ParkedCar is exactly at the parking time purchased.
    public static void testExactlyAtParkingTimePurchased(){
        System.out.println("Test Case 5 : Exactly at the parking time purchased");
        System.out.println("======================================================");

        ParkedCar car = new ParkedCar("Toyota", "Camry", "Blue", "ABC123", 60);
        ParkingMeter meter = new ParkingMeter(60);
        PoliceOfficer officer = new PoliceOfficer("John Duo", 5786);
        ParkingTicket ticket = officer.issueTicket(car, meter);
        if (ticket == null) {
            System.out.println(car.getParkedMinutes());
            System.out.println(meter.getPurchasedMinutes());
            System.out.println("Pass: No ticket issued. Car is legally parked.\n");
        } else {
            System.out.println(car.getParkedMinutes());
            System.out.println(meter.getPurchasedMinutes());
            System.out.println("Pass: Ticket Issued\n");
            System.out.println(ticket.getTicketDetails() + "\n");
        }

}
    // Test case 6 :  The ParkedCar is ticketed for being less than 1 hour over the time purchased.
    // Test case 7 :  The ParkedCar is ticketed for being more than 1 hour over the time purchased.

    // Test case 8 :  The ParkedCar is ticketed for being exactly 1 hour over the time purchased.

}


