package Inheritance;

abstract public class Animals {
    //This is a parental class for the 1 and 2 tasks of simpler part of the Homework.
    //Here we have some data, for which getters and setters were created.
    //The parental class is an abstract class.
    public String animalName;
    public String animalColor;
    public String animalAge;
    public int animalId;

    public Animals (String animalName, String animalColor, String animalAge, int animalId){
        //Here is a method which works with data of the class Animals
        this.animalName = animalName;
        this.animalColor = animalColor;
        this.animalAge = animalAge;
        this.animalId = animalId;

    }

    //here is an abstract method:
    public abstract void printingSomething();

    //Here is a method Print
    public void print() {
        //here is a method of the class "Animals" which prints something
        System.out.println("This is a mythical animal.");
    }

    public String getAnimalName (){
        return animalName;
    }
    public String getAnimalColor (){return animalColor;}
    public String getAnimalAge (){return animalAge;}
    public int getAnimalId (){return animalId;}
    public void setAnimalName(String animalName)throws Exception {
        if (animalName == null){
            try {
                throw new Exception("Who knows, which name has this creature.");
            }catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        this.animalName = animalName;
    }
    public void setAnimalColor(String animalName)throws Exception {
        if (animalColor == null){
            try {
                throw new Exception("This creature is so fast, that nobody knows which color it has.");
            }catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        this.animalColor = animalColor;
    }
    public void setAnimalAge(String animalName)throws Exception {
        if (animalAge == null){
            try {
                throw new Exception("Age of this creature is unknown. " +
                        "Maybe it is old. Maybe it is ancient. Or it is really young");
            }catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        this.animalAge = animalAge;
    }
    public void setAnimalId(int animalID)throws Exception {
        if (animalName == null){
            try {
                throw new Exception("This creature is so fast, that nobody knows which color it has.");
            }catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        this.animalId = animalId;
    }
    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Animals)) return false;
        Animals Animals = (Animals) o;
        return animalId == Animals.animalId;
    }
    public String toString(){
        return "Here is a mythical animal. " + '\n' +
                "The name of this animal is: " + animalName + ", "+ '\n' +
                "The color of this animal is " + animalColor + ", "+ '\n' +
                "The age of this creature is " + animalAge + " " + '\n' +
                "And it's ID is:" + animalId ;
    }

}












