package qaGuruTest;

public class Astronaut {
    String name;
    int age;
    double weight;
    boolean isHuman;

    Astronaut(String name, int age, double weight, boolean isHuman) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isHuman = isHuman;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
