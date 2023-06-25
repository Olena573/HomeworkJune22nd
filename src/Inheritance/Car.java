package Inheritance;

public class Car {
    //Here is a class "Car"
   private String carColor;
   private String carType;
   private String carOrigin;
   private String carBrand;
   private int carDoors;

    public Car (String carColor, String carType, String carOrigin, String carBrand, int carDoors) {
        this.carColor = carColor;
        this.carType = carType;
        this.carOrigin = carOrigin;
        this.carBrand = carBrand;
        this.carDoors = carDoors;

        //  Car.someSound();
    }
    public String getCarColor (){
        return carColor;
    }
    public String getCarType (){
        return carType;
    }
    public String getCarOrigin (){
        return carOrigin;
    }
    public String getCarBrand (){
        return carBrand;
    }

    public int getCarDoors (){
        return carDoors;
    }

    public void setCarColor(String carColor) throws Exception {
        if (carColor == null){
            try {
                throw new Exception("A color of this Car is unknown");
            }catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        this.carColor = carColor;
    }
    public void setCarType (String carType) throws Exception {
        if (carType == null){
            try {
                throw new Exception("A type of this Car is unknown");
            }catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        this.carType = carType;
    }

    public void setCarOrigin (String carOrigin) throws Exception {
        if (carOrigin == null){
            try {
                throw new Exception("Origin is unknown");
            }catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        this.carOrigin = carOrigin;
    }
    public void setCarBrand (String carBrand)throws Exception{
        if (carBrand == null){
            try {
                throw new Exception("Brand of this car is unknown");
            }catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        this.carBrand = carBrand;
    }

    public void setCarDoors (int carDoors) throws Exception {
        if (carDoors <2 ){
            try {
                throw new Exception ("This is not a Car");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        this.carDoors = carDoors;
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

