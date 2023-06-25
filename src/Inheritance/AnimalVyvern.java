package Inheritance;
//This is a class for the task 1 of the simpler homework;

public class AnimalVyvern extends Animals implements mysticalPower, roaring, flyable {
    public AnimalVyvern(String animalName, String animalColor, String animalAge, int animalId) {
        super(animalName, animalColor, animalAge, animalId);
    }

    interface flyable {
    }

    @Override
    public void printingSomething (){
        //This method overrides an abstract method.
        System.out.println("This is a Vyvern.");
    }
    public void somePower () {
        System.out.println ("Now this creature does something very, very magical!");
    }
    public void someRoar () {
        System.out.println ("Rawrrrr!!!");
    }
    public void flying () {
        System.out.println ("A Dragon can Fly.");
    }
}
