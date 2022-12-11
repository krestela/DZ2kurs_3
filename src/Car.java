public class Car extends Transport{

    public Car(String brand, String model, int year, String country, String color, int maxSpeed, double fuelPercentage) {
        super(brand, model, year, country, color, maxSpeed, fuelPercentage);
    }

    @Override
    public void refill() {
        System.out.println("заправлять бензином, дизелем на заправке или заряжать на специальных электропарковках, если это электрокар");
    }
}
