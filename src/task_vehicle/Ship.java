package task_vehicle;

public class Ship extends Vehicle{
    int shipPassangers;
    String port;


    public Ship (){
        cost = 16000000;
        speed = 80;
        year = 1998;
        shipPassangers = 500;
        port = "New York";
    }

    @Override
    public void info() {
        System.out.println("Вартість корабля: " + cost + ", Швидкість: " + speed + ", Рік випуску:  " +
                year + ", Порт посадки: " + port + ", Кількість пасажирів: " + shipPassangers);
    }
}
