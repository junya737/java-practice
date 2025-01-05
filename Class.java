public class Class {
    public static void main(String[] args) {
        Car toyota = new Car("Red", 100);
        ElectricCar tesla = new ElectricCar("Blue", 150, 90);
        toyota.drive();
        tesla.charge();
        tesla.drive();

    }
}

class Car{
    String color;
    float speed;

    // Constructor
    Car(String color, float speed){
        this.color = color;
        this.speed = speed;
    }

    public void drive(){
        System.out.println(this.color + " car is driving at " + this.speed + " km/h");
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
}