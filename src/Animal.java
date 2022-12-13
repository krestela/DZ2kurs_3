import java.util.Objects;

public abstract class Animal {
    private String type;
    private String clas;
    private String name;
    private int age;

    public Animal(String name, int age, String type, String clas) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.clas = clas;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        if (clas != null && !clas.isEmpty() && !clas.isBlank()) {
            this.clas = clas;
        }
    }

    public void setType(String type) {
        if (type != null && !type.isEmpty() && !type.isBlank()) {
            this.type = type;
        }
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if (age == Integer.parseInt(null)) {
            if (age > 0) {
                this.age = age;
            }
        }
    }

    public abstract void eat();

    public abstract void go();

    public void sleep(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && type.equals(animal.type) && clas.equals(animal.clas) && name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, clas, name, age);
    }

    public String toString(){
        return clas+ ". " +type+". Кличка: " +name+". Возраст: "+age+".";
    }
}
