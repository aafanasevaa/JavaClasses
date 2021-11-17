package qaGuruTest;

public class Space {
    public static void main(String[] args) {

        Astronaut elonMusk = new Astronaut("Elon", 50, 80, true);
        Astronaut timCook = new Astronaut("Tim", 60, 85, true);
        timCook.setName("Cim Took");
        System.out.println(timCook.getName() + " is going to space");

        Planet arrakis = new Planet("red", 45, true); //The spice must flow
        Planet naboo = new Planet("blue", 30, true);// May the force be with you
        if (arrakis.temperature <= 30) {
            System.out.println("The spaceship is going to land on arrakis");
        } else if (naboo.temperature <= 30) {
            System.out.println("The spaceship is going to land on naboo");
        } else {
            System.out.println("The time of the space trip is unknown");
        }

        Spaceship falcon = new Spaceship(17.5, true, "Space X");
        Spaceship milano = new Spaceship(15, false, "RosCosmos");
        milano.retrieveInfo();
    }
}