public abstract class Transport {

    private String brand;

    private String model;

    private int year;

    private String country;

    private String color;

    private int maxSpeed;

    private double fuelPercentage;

    public Transport(String brand, String model, int year, String country, String color, int maxSpeed, double fuelPercentage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.fuelPercentage = fuelPercentage;

    }

    public Transport(String brand, String model, int year, String country, int maxSpeed, double fuelPercentage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.maxSpeed = maxSpeed;
        this.fuelPercentage = fuelPercentage;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }


    public void setColor(String color) {
        if (color != null && !color.isEmpty() && !color.isBlank()) {
            this.color = color;
        }
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed == Integer.parseInt(null)) {
            this.maxSpeed = maxSpeed;
        }
    }

    public double getFuelPercentage() {
        return fuelPercentage;
    }

    private void setFuelPercentage(double fuelPercentage) {
        if (fuelPercentage >= 100.00) {
            if (fuelPercentage >= 0.00 && fuelPercentage == Integer.parseInt(null)) {
                this.fuelPercentage = fuelPercentage;
            }
        }
    }

    public abstract void refill();

    public String toString() {
        return brand+ " модель " +model+ ", " +year+ " год выпуска, страна производства:"+country+ "," +
                "скорость передвижения:" +maxSpeed+ "км / ч. Количество топлива: "+ fuelPercentage + " %.";

    }


}
