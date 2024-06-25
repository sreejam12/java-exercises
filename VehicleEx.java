package interfaces;
interface Vehicle{
	void start();
	void stop();
}
interface LandVehicle extends Vehicle{
	void drive();
}
interface SeaVehicle  extends Vehicle{
	void floating();
}
class Car implements LandVehicle {
    
    public void start() {
        System.out.println("Car started.");
    }

   
    public void stop() {
        System.out.println("Car stopped.");
    }

   
    public void drive() {
        System.out.println("Car is driving.");
    }
}
class Bicycle implements LandVehicle {
    
    public void start() {
        System.out.println("Bicycle started.");
    }

    public void stop() {
        System.out.println("Bicycle stopped.");
    }

 
    public void drive() {
        System.out.println("Bicycle is driving.");
    }
}
class Ship implements SeaVehicle {
   
    public void start() {
        System.out.println("Ship started.");
    }

   
    public void stop() {
        System.out.println("Ship stopped.");
    }

   
    public void floating() {
        System.out.println("Ship is floating.");
    }
}
class Submarine implements SeaVehicle {
    
    public void start() {
        System.out.println("Submarine started.");
    }

    
    public void stop() {
        System.out.println("Submarine stopped.");
    }

    public void floating() {
        System.out.println("Submarine is floating.");
    }
   
}

public class VehicleEx {

	public static void main(String[] args) {
		Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Ship ship = new Ship();
        Submarine submarine = new Submarine();
        System.out.println("Testing Car:");
        car.start();
        car.drive();
        car.stop();

        
        System.out.println("Testing Bicycle:");
        bicycle.start();
        bicycle.drive();
        bicycle.stop();

       
        System.out.println("Testing Ship:");
        ship.start();
        ship.floating();
        ship.stop();

        
        System.out.println("Testing Submarine:");
        submarine.start();
        submarine.floating();
        submarine.stop();


	}

}
//Define an interface Vehicle with methods void start() and void stop(). Extend this interface with LandVehicle that adds a method void drive(), and with SeaVehicle that adds a method void float(). Create classes Car, Bicycle, Ship, and Submarine that implement these interfaces appropriately. Test the methods defined in each interface for these classes.
