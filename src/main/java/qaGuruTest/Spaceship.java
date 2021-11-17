package qaGuruTest;

public class Spaceship {
    double speed;
    boolean isNavigatedByAI;
    String manufacturer;

    Spaceship(double speed, boolean isNavigatedByAI, String manufacturer) {
        this.speed = speed;
        this.isNavigatedByAI = isNavigatedByAI;
        this.manufacturer = manufacturer;
    }

    public void retrieveInfo() {
        System.out.println("The speed of the spaceship is " + speed + "\n" + "The spaceship manufacturer is " + manufacturer);
    }
}
