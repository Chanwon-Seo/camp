package week03;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        double speed = car.getPedal(100, 'D');

        System.out.println("speed = " + speed);

        boolean lights = car.onOffLight();
        System.out.println("lights = " + lights);

        System.out.println();
        System.out.println("car.gear = " + car.gear);
        System.out.println();

        car.carSpeeds(100, 80);
        System.out.println();
        car.carSpeeds(110, 120, 150);
    }
}
