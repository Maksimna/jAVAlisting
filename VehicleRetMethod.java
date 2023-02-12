public class Vehicle{
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;
    double distance ( double interval) {
        double value = maxspeed * interval;
        return  value;
    }// distance (double inteval)
}//Vehicle class
class VehicleRetMethod {
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.passengers = 2;
        car. wheels = 4;
        car. maxspeed = 130;
        car. burnup = 30;


        Vehicle bus = new Vehicle();
        bus.passengers = 45;
        bus.wheels = 4;
        car.maxspeed = 100;
        car.burnup = 25;
        Double time = 0.5;
        double distancecar = car.distance(time);
        double distancebus= bus.distance(time);
        System.out.print(" автомобиль c" + car.passengers + "пассажирами");
        System.out.println("Пройдёт за полчаса путь" + distaceCar + "км.");
        System.out.print("автобус с"+ bus.passengers + "ассажирами");
        System.out.prinln("пройдёт за полчаса путь" + distancebus + "км.");
    }//main(String[])
}//VegicleRetMethod class
