class Vehicle {
    int passegers;
    int wheels;
    int maxspeed;
    int burnup;
    void distance( double interval){
        double value = maxspeed * interval;
        System.out.println("пройдёт путь , равнй " + value + "км.");
    }//distance (double interval)
}// Vehicle class
class VehicleMethodDemo {
    public static void main(String[] args) {

        Vehicle car = new Vehicle();
        car.passegers = 2;
                car.wheels = 4;
                car.maxspeed = 130;
                car.burnup = 30;
                Vehicle bus = new Vehicle();
                bus.passegers = 45;
                bus.wheels = 4;
                bus.maxspeed = 100;
                bus.burnup = 25;
                double time = 0.5;
                System.out.print("автомобиль с" + car.passegers + "пассжирами");
                car.distance(time);
                System.out.println("автобус" + bus.passegers + "пассажирами");
                bus.distance(time);
    }//main(String[])
}//VehicleMethodDemo class
