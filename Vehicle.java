public abstract class Vehicle {
    protected String brand;
    protected int kilometers;

    protected Vehicle(String brand, int kilometers) {
        this.brand = brand;
        this.kilometers = kilometers;
    }

    protected String getBrand() {
        return brand;
    }

    protected void setBrand(String brand) {
        this.brand = brand;
    }

    protected int getKilometers() {
        return kilometers;
    }

    protected void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    public abstract String doStuff();
}
