import java.util.Arrays;
import java.util.List;

public class Class {
    public static void main(String[] args) {
        GasCar honda = new GasCar("Red", 100, 50);
        ElectricCar tesla = new ElectricCar("Blue", 150, 80);
        
        // ポリモーフィズム．メソッド名を共通にする．
        List<Car> cars = Arrays.asList(honda, tesla); 
        for (Car car : cars){
            car.refuel();
            car.drive();
            car.stop();
        }

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

    // Abstract methods．子クラスで実装する
    abstract void refuel();
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

    @Override
    void refuel(){
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

    @Override
    void refuel(){
        System.out.println(this.color + " car is refueling at " + this.fuelLevel + " L");
    }

    @Override
    void drive(){
        System.out.println(this.color + " car is driving at " + this.speed + " km/h");
    }
}

