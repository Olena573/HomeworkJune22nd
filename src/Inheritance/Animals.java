package Inheritance;

abstract public class Animals {
    //This is a parental class for the 1 and 2 tasks of simpler part of the Homework.
    //Here we have some data, for which getters and setters were created.
    //The parental class is an abstract class.
    public String animalName;
    public String animalColor;
    public String animalAge;
    public int animalId;

    //here are some Interfaces
    interface roaring {
    }

    interface mythicalPower {
    }


    //Here is a method Print
    public void print() {
        //here is a method of the class "Animals" which prints something
        System.out.println("This is a mythical animal.");
    }
    //here is an abstract method:
    public abstract void printingSomething ();

}






