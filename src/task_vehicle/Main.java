package task_vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle plane = new Plane();
        Vehicle car = new Car();
        Vehicle ship = new Ship();

        plane.info();
        car.info();
        ship.info();
    }
}
