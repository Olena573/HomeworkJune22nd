// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import Inheritance.Animals;
import Inheritance.AnimalTharasque;
import Inheritance.AnimalDragon;
import Inheritance.AnimalVyvern;
//import Inheritance.classA;
//import Inheritance.classB;
//import Inheritance.classC;
import Inheritance.Car;


import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        // Press Shift+F9 to start debugging your code. We have set one breakpoint
        // for you, but you can always add more by pressing Ctrl+F8.

        //Here are objects for task1
        AnimalTharasque TharasqueOne = new AnimalTharasque( "Jaques", "orange", "Old", 3434 );
        AnimalDragon DragonYounger = new AnimalDragon ( "Pretorius", "black", "Ancient", 23);
        AnimalDragon DragonOlder = new AnimalDragon ("Joanne", "green", "Older than Ancient", 2345);
        AnimalVyvern VyvernOne = new AnimalVyvern ("Lucia", "red", "Ancient", 234);


        System.out.println(TharasqueOne);
        System.out.println(DragonYounger);
        System.out.println(DragonOlder);
        System.out.println(VyvernOne);

        //Here are objects and methods from task3.

        Car car = new Car ("Orange", "sedan",  "USA", "SomeBrand", 4);
        Car car1 = new Car ("White", "minivan", "Europe", "SomeOtherBrand", 5);
        Car car2 = new Car ("AppleGreen", "coupe", "USA", "SomeBrand", 2);
        Car car3 = new Car ("Orange", "minivan", "USA", "ThirdBrand", 6);

        System.out.println(car.getCarColor());
        System.out.println(car1.getCarColor());

        System.out.println(car == car1);
        System.out.println(car.equals(car1));
        System.out.println(car.equals(car2));
        System.out.println(car.equals(car3));

        System.out.println(car);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

    }
}

//For now, no classes were initiated from the Main method, so nothing is printed in the Console.


// Here is 3 classes for Task 2, but written under the Main method.
class A {
    //This is a first class for the task 2 of the simpler homework

    public void print() {
        //Here is a method which will be used for the simple version of Override;
        System.out.println("This is a class A.");
    }
}

class B extends A {
   @Override
    public void print() {
    //Here is a method which will be used for the simple version of Override;
    System.out.println("This is a class B.");
}


}

class C extends B {
    @Override
    public void print() {
        //Here is a method which will be used for the simple version of Override;
        System.out.println("This is a class B.");
    }

}


class test {
    //This is a class which tests three classes with inheritance;
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
      //  C c = new C();

        a.print();
        b.print();
     //   c.print();
    }
}

