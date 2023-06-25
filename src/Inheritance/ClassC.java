package Inheritance;

public class ClassC extends ClassB {
    //This class is a third class for the task 2 of the simpler homework.
    // And it can not extend a class A, because Java have no multiple inheritance.
    // So, this is a class which tests three classes with inheritance;

    @Override
  public void print() {
        //This is a method
        System.out.println("This is a class classC.");
    }

    public void printing () {
        // here is a construction with "super":
        print();
        super.print();
    }
    //This is a method which does not require an Override

   public class test {
        //This is a class which tests three classes with inheritance;
       public static void main(String[] args) {
            ClassA a = new ClassA();
            ClassB b = new ClassB();
            ClassC c = new ClassC();

            a.print();
            b.print();
            c.print();
        }
    }


}



