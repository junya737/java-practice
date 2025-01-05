public class Class {
    public static void main(String[] args) {
        GasCar honda = new GasCar("Red", 100, 50);
        ElectricCar tesla = new ElectricCar("Blue", 150, 80);

        honda.refuel();
        honda.drive();
        honda.stop();

        tesla.charge();
        tesla.drive();
        tesla.stop();
        

    }
}

abstract class Car {
    String color;
    float speed;

    // Constructor
    Car(String color, float speed){
        this.color = color;
        this.speed = speed;
    }

    abstract void drive();

    public void stop(){
        System.out.println(this.color + " car is stopping");
}
}

// Electric car. Inherits from Car
class ElectricCar extends Car{
    float batteryLevel;
    // Constructor
    ElectricCar(String color, float speed, float batteryLevel){
        // superclassのコンストラクタを再利用
        super(color, speed);
        this.batteryLevel = batteryLevel;
    }

    public void charge(){
        System.out.println(this.color + " car is charging at " + this.batteryLevel + " %");
    }

    @Override
    void drive(){
        System.out.println(this.color + " car is driving at " + this.speed + " km/h");
    }
}

class GasCar extends Car{
    float fuelLevel;

    GasCar(String color, float speed, float fuelLevel){
        super(color, speed);
        this.fuelLevel = fuelLevel;
    }

    public void refuel(){
        System.out.println(this.color + " car is refueling at " + this.fuelLevel + " %");
    }

    @Override
    void drive(){
        System.out.println(this.color + " car is driving at " + this.speed + " km/h");
    }
}

