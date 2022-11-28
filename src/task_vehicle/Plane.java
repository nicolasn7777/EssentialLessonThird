package task_vehicle;

public class Plane extends Vehicle{
    int high;
    int planePassangers;


    public Plane (){
        cost = 1300000;
        speed = 500;
        year = 2012;
        high = 5;
        planePassangers = 300;
    }

    @Override
    public void info() {
        System.out.println("Вартість літака: " + cost + ", Швидкість: " + speed + ", Рік випуску:  "
                + year + ", Висота: " + high + ", Кількість пасажирів: " + planePassangers);
    }
}
