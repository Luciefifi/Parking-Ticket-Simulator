public class PoliceOfficer {

    private String name;
    private int badgeNumber ;

    public PoliceOfficer(String name , int badgeNumber){
        this.name = name;
        this.badgeNumber = badgeNumber;
    }

    public String getName(){
        return name;
    }

    public int getBadgeNumber(){
        return badgeNumber;
    }

    public void setName(String name) { this.name = name; }
    public void setBadgeNumber(int badgeNumber) { this.badgeNumber = badgeNumber; }

    public boolean isCarLegallyParked(ParkedCar car , ParkingMeter meter){
        return car.getParkedMinutes() <= meter.getPurchasedMinutes();
    }

    public ParkingTicket issueTicket(ParkedCar car , ParkingMeter meter)
    {
        if(!isCarLegallyParked(car , meter)){
            return new ParkingTicket(car , this, meter);
        }
        return null;
    }

    @Override
    public String toString() {
        return "PoliceOfficer [Name=" + name + ", Badge Number=" + badgeNumber + "]";
    }


}
