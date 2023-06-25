package Inheritance;

//This class is used in the task 1 of the simpler homework;

 public class AnimalDragon extends Animals implements mysticalPower, roaring, flyable {
     public AnimalDragon(String animalName, String animalColor, String animalAge, int animalId) {
         super(animalName, animalColor, animalAge, animalId);
     }

     interface flyable {
     }

     @Override
     public void printingSomething (){
         //This method overrides an abstract method.
         System.out.println("This is a Dragon.");
     }
     public void somePower () {
         System.out.println ("Now this creature does something really magical!");
     }
     public void someRoar () {
         System.out.println ("Rawrrrr!!!");
     }

     public void flying () {
         System.out.println ("A Dragon can Fly.");
     }
}


