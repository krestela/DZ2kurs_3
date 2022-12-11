public class Train extends Transport {

    private double priceTrip;

    private int timeTrip;

    private String nameDepatureStation;

    private String lastStop;

    private int quantityOfVagons;

    public Train(String brand, String model, int year, String country, int maxSpeed, double fuelPercentage, double priceTrip,
                 int timeTrip, String nameDepatureStation, String lastStop, int quantityOfVagons) {
        super(brand, model, year, country, maxSpeed, fuelPercentage);
        this.priceTrip = priceTrip;
        this.timeTrip = timeTrip;
        this.nameDepatureStation = nameDepatureStation;
        this.lastStop = lastStop;
        this.quantityOfVagons = quantityOfVagons;
    }
    public double getPriceTrip() {
        return priceTrip;
    }

    public int getTimeTrip() {
        return timeTrip;
    }

    public String getNameDepatureStation() {
        return nameDepatureStation;
    }

    public String getLastStop() {
        return lastStop;
    }

    public int getQuantityOfVagons() {
        return quantityOfVagons;
    }

    public void setPriceTrip(double priceTrip) {
        if (priceTrip == Integer.parseInt(null)) {
            this.priceTrip = priceTrip;
        }
    }

    public void setTimeTrip(int timeTrip) {
        if (timeTrip == Integer.parseInt(null)) {
            this.timeTrip = timeTrip;
        }
    }

    public void setQuantityOfVagons(int quantityOfVagons) {
        if (quantityOfVagons == Integer.parseInt(null)) {
            this.quantityOfVagons = quantityOfVagons;
        }
    }

    @Override
    public void refill() {
        System.out.println("заправлять дизелем");
    }

    public String toString(){

        return super.toString() + "Oтходит от " +nameDepatureStation+ " и следует до станции " +lastStop+
                ". Цена поездки — " +priceTrip+ " рублей, в поезде " +quantityOfVagons+ " вагонов.";
            }
}
