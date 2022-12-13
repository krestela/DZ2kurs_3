import java.util.Objects;

public class Flightless extends Bird{
    private String movement;

    public Flightless(String name, int age, String type, String clas, String livingEnvironment, String movement) {
        super(name, age, type, clas, livingEnvironment);
        this.movement = movement;
    }

    public String getMovement() {
        return movement;
    }

    public void setMovement(String movement) {
        if (movement != null && !movement.isEmpty() && !movement.isBlank()) {
            this.movement = movement;
        }
    }
    public void go() {
        System.out.println("Гулять");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return movement.equals(that.movement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movement);
    }

    @Override
    public String toString() {
        return super.toString() + ". Тип передвижения: " + movement;
    }
}
