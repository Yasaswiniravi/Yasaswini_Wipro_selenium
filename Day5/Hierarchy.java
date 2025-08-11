package Assignment5;
interface BaseVehicle {
    void start();
}
interface AdvancedVehicle extends BaseVehicle {
    void stop();
    boolean refuel(int amount);
}
class Car implements AdvancedVehicle {
    int fuel;
    Car(int fuel) { this.fuel = fuel; }
    public void start() {
        if (fuel > 0)
            System.out.println("Car started.");
        else
            System.out.println("Cannot start, no fuel.");
    }
    public void stop() {
        System.out.println("Car stopped.");
    }
    public boolean refuel(int amount) {
        fuel += amount;
        System.out.println("Refueled " + amount + " liters. Fuel now: " + fuel);
        return true;
    }
}
public class Hierarchy {
    public static void main(String[] args) {
        BaseVehicle bv = new Car(5);
        bv.start();
        AdvancedVehicle av = (AdvancedVehicle) bv;
        av.stop();
        av.refuel(10);
        av.start();
    }
}
