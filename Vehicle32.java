class Vehicle32 {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;
// Vehicle32 class
    public static void main(String[] args) {


        //обьект car1
        Vehicle32 car1 = new Vehicle32();
        car1.passengers = 2;
        car1.wheels = 6;
        car1.maxspeed = 130;
        car1.burnup = 30;
        Vehicle bus1 = new Vehicle();
        bus1.passengers = 45;
        bus1.wheels = 4;
        bus1.maxspeed = 100;
        bus1.burnup = 45;
        double interval = 1.25;
        double distaceCar = car1.maxspeed * interval;
        double distaceBus = bus1.maxspeed * interval;
System.out.println("car1 может проехать за 1 час 15 мин. растояние в ");
System.out.println(distaceCar +"км с"+ car1.passengers);
System.out.println("пасажирами.");
System.out.println("bus1 может проехать за 1 час 15 мин. растояние в");
System.out.println(distaceBus + "км с" + bus1.passengers);
System.out.println("пассажирами.");
    }//main(String[])
}//VehicleDemo class
