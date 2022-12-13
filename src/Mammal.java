import java.util.Objects;

public class Mammal extends Animal {
    private String livingEnvironment;

    private double speed;

    public Mammal(String name, int age, String type, String clas, String livingEnvironment, double speed) {
        super(name, age, type, clas);
        this.livingEnvironment = livingEnvironment;
        this.speed = speed;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment != null && !livingEnvironment.isEmpty() && !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        if (speed == Integer.parseInt(null)) {
            this.speed = speed;
        }
    }

    @Override
    public void eat() {

    }

    @Override
    public void go() {
        System.out.println("Гулять");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return Double.compare(mammal.speed, speed) == 0 && livingEnvironment.equals(mammal.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment, speed);
    }

    public String toString() {
        return super.toString() + "Среда проживания: " + livingEnvironment + ". Скорость перемещения: " + speed+ " км/ч. ";
    }
}
