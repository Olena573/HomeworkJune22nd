package Inheritance;

public class Car {
    //Here is a class "Car"
    String carColor;
    String carType;
    String carOrigin;
    String carBrand;
    int carDoors;

    public Car(String carColor, String carType, String carOrigin, String carBrand, int carDoors) {
        this.carColor = carColor;
        this.carType = carType;
        this.carOrigin = carOrigin;
        this.carBrand = carBrand;
        this.carDoors = carDoors;

        //  car.someSound();
    }
    public String getCarColor (){
        return carColor;
    }
    public String getCarType (){
        return carType;
    }

    public int getCarDoors (){
        return carDoors;
    }

    public String getCarOrigin (){
        return carOrigin;
    }
    public String getCarBrand (){
        return carBrand;
    }

    public void setCarColor(String carColor){
        this.carColor = carColor;
    }
    public void setCarType (String carType){
        this.carType = carType;
    }
    public void setCarDoors (int carDoors){
        this.carDoors = carDoors;
    }

    public void carOrigin (String carOrigin){
        this.carOrigin = carOrigin;
    }
    public void carBrand (String carBrand){
        this.carBrand = carBrand;
    }

    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return carColor == car.carColor;
    }


    public String toString(){
        return "A Car has these properties: " + '\n' +
                "Color of this car is: " + carColor + ", "+ '\n' +
                "Type of this Car is: " + carType + ", "+ '\n' +
                "It is from " + carOrigin + " " + '\n' +
                "It's brand is " + carBrand + " " + '\n' +
                "and this car has " + carDoors + " doors.";
    }





}

