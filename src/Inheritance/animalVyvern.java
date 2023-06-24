package Inheritance;
//This is a class for the task 1 of the simpler homework;

public class animalVyvern extends Animals {
    interface flyable {
    }
    public String toString(){
        return "This is an animal from class Vyvern.";
    }
    @Override
    public void printingSomething (){
        //This method overrides an abstract method.
        System.out.println("This is a Vyvern.");
    }
}
