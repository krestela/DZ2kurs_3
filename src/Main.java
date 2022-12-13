public class Main {
    public static void main (String[] args){
        Herbivores gazelle = new Herbivores( "Галя",5 ,"Газель", "Травоядное", "Африка", 50, "Трава");
        Herbivores giraffe = new Herbivores( "Лимба",3 ,"Жираф", "Травоядное", "Африка", 50, "Трава");
        Herbivores horse = new Herbivores( "Спирит",5 ,"Лошадь", "Травоядное", "Россия", 60, "Сено");

        Predator hyena = new Predator("Гена", 7, "Гиена", "Хищник", "Африка", 45, "Мясо");
        Predator tiger = new Predator("Симба", 1, "Тигр", "Хищник", "Африка", 45, "Мясо");
        Predator bear = new Predator("Шишка", 4, "Медведь", "Хищник", "Россия", 45, "Рыба");

        Amphibian frog = new Amphibian("Лом", 2, "Лягушка", "Земноводное", "Россия");
        Amphibian grassSnake = new Amphibian("Ушко", 4, "Уж пресноводный", "Земноводное", "Россия");

        Flightless peacock = new Flightless("Самуэль", 4, "Павлин", "Птицы, нелетающие", "Россия", "Ходьба");
        Flightless penguin = new Flightless("Марк", 6, "Пингвин", "Птицы, нелетающие", "Антрактида", "Ходьба");
        Flightless dodoBird = new Flightless("Пицца", 4, "Птица Додо", "Птицы, нелетающие", "остров Маврикий", "Ходьба");

        Flying seagull = new Flying("Герман", 2, "Чайка", "Птицы, летающие", "Россия", "Полет");
        Flying albatross = new Flying("Лука", 2, "Альбатрос", "Птицы, летающие", "Атрактида", "Полет");
        Flying falcon = new Flying("Эдуард", 2, "Сокол", "Птицы, летающие", "Северная Америка", "Полет");



        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(horse);
        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(bear);
        System.out.println(frog);
        System.out.println(grassSnake);
        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(dodoBird);
        System.out.println(seagull);
        System.out.println(albatross);
        System.out.println(falcon);
    }
}
