import java.util.Objects;

public class Predator extends Mammal{
    private String food;

    public Predator(String name, int age, String type, String clas, String livingEnvironment, double speed, String food) {
        super(name, age, type, clas, livingEnvironment, speed);
        this.food = food;
    }
    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        if (food != null && !food.isEmpty() && !food.isBlank()) {
            this.food = food;
        }
    }

    public void go() {
        System.out.println("Охотиться");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predator predator = (Predator) o;
        return food.equals(predator.food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), food);
    }

    @Override
    public String toString() {
        return super.toString() + ". Тип пищи: " + food;
    }
}
