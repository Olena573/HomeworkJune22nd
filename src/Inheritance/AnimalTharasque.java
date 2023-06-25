package Inheritance;
//This is a class for the task 1 of the simpler homework;
public class animalTharasque extends Animals {
    interface swimming {
        // Wikipedia says that this creature lived on a shore of the river Rhone, and cloud swim.
    }
    public String toString(){
        return "This is an animal from class Tharasque.";
    }
    @Override
    public void printingSomething (){
        //This method overrides an abstract method.
        System.out.println("This is a Tharasque");
    }
}
