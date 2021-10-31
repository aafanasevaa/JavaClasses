package qaGuruTest;

public class Space {
    public static void main(String[] args) {

        Astronaut elonMusk = new Astronaut();
        elonMusk.name = "Elon Musk";
        elonMusk.isHuman = true;
        elonMusk.age = 50;
        elonMusk.weight = 80;


        elonMusk.sayWeight();

        Astronaut timCook = new Astronaut();
        timCook.name = "Tim Cook";
        timCook.isHuman = true;
        timCook.age = 60;
        timCook.weight = 85;

        Planet arrakis = new Planet(); //The spice must flow
        arrakis.color = "red";
        arrakis.isHabitable = true;
        arrakis.temperature = 45;

        Planet naboo = new Planet(); // May the force be with you
        naboo.temperature = 30;
        naboo.isHabitable = true;
        naboo.color = "blue";

        Spaceship falcon = new Spaceship();
        falcon.isNavigatedByAI = true;
        falcon.manufacturer = "Space X";
        falcon.speed = 17.5;

        Spaceship milano = new Spaceship();
        milano.isNavigatedByAI = false;
        milano.manufacturer = "RosCosmos";
        milano.speed = 15;

        milano.retrieveInfo();
    }
}
