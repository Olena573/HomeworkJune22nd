package Inheritance;
//This is a class for the task 1 of the simpler homework;
public class AnimalTharasque extends Animals  implements mysticalPower, roaring {
    public AnimalTharasque(String animalName, String animalColor, String animalAge, int animalId) {
        super(animalName, animalColor, animalAge, animalId);
    }

    interface swimming {
        // Wikipedia says that this creature lived on a shore of the river Rhone, and cloud swim.
    }

    @Override
    public void printingSomething (){
        //This method overrides an abstract method.
        System.out.println("This is a Tharasque");
    }

    public void somePower () {
        System.out.println ("Now this creature does something magical!");
    }

    public void someRoar () {
        System.out.println ("Rawrrrr!!!");
    }
}
