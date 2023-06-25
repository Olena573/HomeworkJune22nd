package Inheritance;

public class classC extends classB {
    //This class is a third class for the task 2 of the simpler homework.
    // And it can not extend a class A, because Java have no multiple inheritance.
    // So, this is a class which tests three classes with inheritance;

    @Override
    void print() {
        //This is a method
        System.out.println("This is a class C.");
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
            classA a = new classA();
            classB b = new classB();
            classC c = new classC();

            a.print();
            b.print();
            c.print();
        }
    }
}



