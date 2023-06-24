package Inheritance;

public class Animals {
    //This is a parental class for the 1 and 2 tasks of simpler part of the Homework.
    //Here we have some data, for which getters and setters were created.
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
}
// Here I wrote some setters and getters, and put them in comments, because something did not worked as it should.
/*
    public Animals(String animalName, String animalColor, String animalAge, int animalId) {
        this.animalName = animalName;
        this.animalColor = animalColor;
        this.animalAge = animalAge;
        this.animalId = animalId;

    }

    public String getAnimalName() {
        return animalName;
    }

    public String getAnimalColor() {
        return animalColor;
    }

    public String getAnimalAge() {
        return animalAge;
    }

    public int getAnimalId() {
        return animalId;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void setAnimalColor(String animalColor) {
        this.animalColor = animalColor;
    }

    public void setAnimalAge(String animalAge) {
        this.animalAge = animalAge;
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return animalId == Animals.animalId;
    }

    public String toString() {
        return "Here is a mythical Animal: " + '\n' +
                "The name of this animal is: " + animalName + ", " + '\n' +
                "Color of this animal is: " + animalColor + ", " + '\n' +
                "This animal lives" + animalAge + " " + '\n' +
                "The ID of this animal is " + animalId;
    }
}
*/





