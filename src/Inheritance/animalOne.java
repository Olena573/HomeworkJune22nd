package Inheritance;

public class animalOne extends Animals {
    //This class is used in the task 2 and task 1 of the simpler homework;


    //Here we override the simple method "print" from the class "Animals"
    @Override
    public void print () {
        //here is a some method of the class "Animals" which prints something
        System.out.println("This a first subclass, which inherits from the class Animals.");
    }
}
