package task_vehicle;

public class Car extends Vehicle{


    public Car (){
        cost = 15000;
        speed = 290;
        year = 2016;

    }
    @Override
    public void info() {
        System.out.println("Вартість авто: " + cost + ", Швидкість: " + speed + ", Рік випуску:  " + year);
    }
}
