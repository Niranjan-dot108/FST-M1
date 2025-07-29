package activities;

public class Activity1 {

	public static void main(String[] args) {
		// Create object of class
		Car honda = new Car("Red","Automatic",2020);
		
       // Print details of the car
		honda.displayCharacterisitics();
	   // Move the car 	
		honda.accelerate();
		//Stop the car
		honda.brake();
		
	}

}
