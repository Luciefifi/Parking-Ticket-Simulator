public class ParkedCar {
    private String make;
    private String model;
    private String color;
    private String licenseNumber;
    private int parkedMinutes;

    public ParkedCar(String make, String model, String color, String licenseNumber, int parkedMinutes) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.licenseNumber = licenseNumber;
        this.parkedMinutes = parkedMinutes;
    }

    // getters and setters

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setParkedMinutes(int parkedMinutes) {
        this.parkedMinutes = parkedMinutes;
    }

    @Override
    public String toString() {
        return "ParkedCar [Make=" + make + ", Model=" + model + ", Color=" + color +
                ", License Number=" + licenseNumber + ", Parked Minutes=" + parkedMinutes + "]";
    }
}


