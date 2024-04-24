package week03;

public class Car {
    String company;
    String model = "GV80";
    String color;
    double price;
    double speed;
    char gear;
    boolean lights = true;

    Tire tire = new Tire();
    Door door;
    Handle handle;

    public Car() {
        System.out.println("생성자가 호출되었습니다. 객체가 생성됩니다.");
    }

    public Car(String company, String model, String color, double price, double speed, char gear, boolean lights) {
        this.company = company;
        this.model = model;
        this.color = color;
        this.price = price;
        this.speed = speed;
        this.gear = gear;
        this.lights = lights;
    }

    public double getPedal(double kmh, char type) {
        changeGear(type);
        speed = kmh;
        return speed;
    }

    public double brakePedal() {
        speed = 0;
        return speed;
    }

    public char changeGear(char type) {
        gear = type;
        return gear;
    }

    public boolean onOffLight() {
        lights = !lights;
        return lights;
    }

    public void horn() {
        System.out.println("빵빵");
    }

    public void carSpeeds(double... speeds) {
        for (double v : speeds) {
            System.out.println("v = " + v);
        }
    }

}
