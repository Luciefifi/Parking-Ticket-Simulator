public class ParkingTicket {
    private String make;
    private String model;
    private String color;
    private String licenseNumber;
    private double fine;
    private PoliceOfficer officer;

    public ParkingTicket(ParkedCar car , PoliceOfficer officer , ParkingMeter meter)
    {
        this.make = car.getMake();
        this.model = car.getModel();
        this.color = car.getColor();
        this.licenseNumber = car.getLicenseNumber();
        this.officer = officer;
        this.fine = calculateFine(car.getParkedMinutes(), meter.getPurchasedMinutes());
    }

    private double calculateFine(int parkedMinutes , int purchasedMinutes)
    {
        int extraTime = parkedMinutes - purchasedMinutes;
        if(extraTime <=0){
            return 0;
        }

        double baseFine = 25.00;

        int additionalHours = (int) Math.ceil(extraTime/60.0) -1 ;
        return baseFine + (additionalHours > 0 ? additionalHours * 10.00 : 0.0) ;
    }
    public double getFine()
    {
        return fine;
    }
    public String getTicketDetails() {
        return "Ticket Details:\nCar: " + make + " " + model + "\nLicense Number: " + licenseNumber +
                "\nColor: " + color + "\nFine: $" + fine + "\nOfficer: " + officer.getName() +
                "\nBadge Number: " + officer.getBadgeNumber();
    }
    @Override
    public String toString() {
        return "ParkingTicket [Make=" + make + ", Model=" + model + ", Color=" + color +
                ", License Number=" + licenseNumber + ", Fine=$" + fine +
                ", Officer=" + officer.getName() + ", Badge Number=" + officer.getBadgeNumber() + "]";
    }
}
