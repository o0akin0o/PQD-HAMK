public class main{
	
	public static void main(String[] arg) {
		Car car1 = new Car();
		car1.printData();
		System.out.println("-----------------");
		car1.accelerate();
		car1.carBreak();
	
		System.out.println("-----------------");
		System.out.println("New car1 values: ");
		car1.printData();
		
		System.out.println("-----------------");
		Car car2 = new Car("Volvo", "CX50", 0);
		car2.printData();
		car2.accelerate();
		car2.carBreak();
		System.out.println("Car Refuel: ");
		car2.refuel(70);
		System.out.println("New car2 values: ");
		car2.printData();
		
		
		System.out.println("-----------------");
		Car car3 = new Car("Honda", "Accord", 10);
		car3.printData();
		car3.accelerate();
		car3.carBreak();
		System.out.println("Car Refuel: ");
		car3.refuel(40);
		System.out.println("New car3 values: ");
		car3.printData();
	}
	
	
}

class Car {

	public String brand;
	public String model;
	public int amountOfFuel;
	public int newFuel;
	
	public Car() {
		
		brand = "Fiat";
		model = "500";
		amountOfFuel = 50;
		newFuel = amountOfFuel;
       
	}
	
	
	public Car(String brand, String model, int amountOfFuel) {
		
		this.brand = brand;
		this.model = model;
		this.amountOfFuel = amountOfFuel;
		this.newFuel = amountOfFuel;
	}

	void carBreak() {
		System.out.println("Car is breaking...");
	}
	
	void accelerate() {
		if(amountOfFuel>0) {
			newFuel -= 1;
			System.out.println("Car is accelerate...");
		}
		else {
			System.out.println("Car is out of fuel.");
		}
	
	}
	
	void refuel(int amount) {
		System.out.println("Fuel on the tank: " + newFuel);
		System.out.println("Refuel: " + amount);
		newFuel = newFuel + amount;
		System.out.println("Fuel on the tank after the refuel: " + newFuel);
		
		
	}
	void printData() {
		System.out.println("Brand: "+ brand);
		System.out.println("Model: "+ model);
		System.out.println("Fuel: "+ newFuel);
	}
}
