package qaGuruTest;

public class Spaceship {
    boolean isNavigatedByAI;
    String manufacturer;

    Spaceship(boolean isNavigatedByAI, String manufacturer) {
        this.isNavigatedByAI = isNavigatedByAI;
        this.manufacturer = manufacturer;
    }

    static class Movement {
        int speed = 100;
        String direction = "West";
    }

    public void retrieveInfo() {
        System.out.println("The spaceship manufacturer is " + manufacturer);
    }
}
