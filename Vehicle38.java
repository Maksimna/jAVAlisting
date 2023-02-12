public class Vehicle38 {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;
    Vehicle38(int p, int w, int ms, int bu){
        passengers = p;
        wheels = w;
        maxspeed = ms;
                burnup = bu;
    }//Vehicle38(int, int, int, int, int)
    double distance(double interval){
        double value = maxspeed * interval;
        return value;
    }//distance(double)
}//Vehicle38 class
 class VehicleConstrDemo{
     public static void main(String[] args) {
         Vehicle38 car = new Vehicle38(2,4,130,30);
         Vehicle38 bus

     }
 }
