package Inheritance;

public class animalFourC extends animalOne {
    //This class is used in the task 2 of the simpler homework;

    @Override
    public void print () {
        //here is a some method of the class "Animals" which prints something
        System.out.println("This a second subclass, which inherits from first subclass animalOne, " +
                "which inheriths from the class Animals.");
    }
}
