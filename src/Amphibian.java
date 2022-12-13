import java.util.Objects;

public class Amphibian extends Animal {
    private String livingEnvironment;

    public Amphibian(String name, int age, String type, String clas, String livingEnvironment) {
        super(name, age, type, clas);
        this.livingEnvironment = livingEnvironment;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment != null && !livingEnvironment.isEmpty() && !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        }
    }

    @Override
    public void eat() {

    }

    @Override
    public void go() {
        System.out.println("Охотиться");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibian amphibian = (Amphibian) o;
        return livingEnvironment.equals(amphibian.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }

    public String toString() {
        return super.toString() + "Среда проживания: " + livingEnvironment;
    }
}
