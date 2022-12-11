public class Main {
    public static void main (String[] args){
        Car bmw = new Car("BMW", "Z8",  2021,"Германия","черный",150, 25.14);
        Car kia = new Car("KIA", "Sportage 4-го поколения",  2018,"Южная Корея", "красный",180, 60.54);

        Train lastochka = new Train("Поезд «Ласточка»", "B-901", 2011, "Россия", 301, 70.54,
                3500, 50, "Белорусского вокзала", "Минск-Пассажирский", 11);
        Train leningrad = new Train("Поезд «Ленинград»", "D-125", 2019, "Россия", 270, 50.00,
                1700, 70, "Ленинградского вокзала", "Ленинград-Пассажирский", 8);

        Bus gaz = new Bus("Газ", "3221", 2007, "Россия", "белый", 120, 80);
        Bus mercedes = new Bus("Mercedes-Benz", "O407", 2022, "Германия", "зеленый", 190, 60);
        Bus mercedes1 = new Bus("Mercedes-Benz", "O879", 2015, "Германия", "белый", 190, 35);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(lastochka);
        System.out.println(leningrad);
        System.out.println(gaz);
        System.out.println(mercedes);
        System.out.println(mercedes1);
    }
}
