package Lesson4;

public class Car {
    String color="red";
    String engine="V6";
}

class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = car1;
        car1.color="black";
        car1.engine="V8";
        System.out.println(car2);
    }
}