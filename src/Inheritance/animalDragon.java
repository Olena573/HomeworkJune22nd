package Inheritance;
//This class is used in the task 1 of the simpler homework;

 public class animalDragon extends Animals {
     interface flyable {
     }
     public String toString(){
         return "This is an animal from class Dragon.";
     }
     @Override
     public void printingSomething (){
         //This method overrides an abstract method.
         System.out.println("This is a Dragon.");
     }
}


