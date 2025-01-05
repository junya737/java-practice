public class Class {
    public static void main(String[] args) {
        Car car = new Car("Blue", 60);
        car.drive();
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