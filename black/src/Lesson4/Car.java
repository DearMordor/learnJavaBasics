package Lesson4;

public class Car {
    void Car(String cvet, String motor) {
        color = cvet;
        engine = motor;
        System.out.println("Цвет машины: " + color + " мотор машины: " +engine);
    }

    String color;
    String engine;
}

class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1.color);
        System.out.println(car1.engine);

        Car car2 = new Car();
        System.out.println(car2.engine);
        System.out.println(car2.color);
    }
}