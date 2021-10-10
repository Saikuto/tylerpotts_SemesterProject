package tylerpotts_SemesterProject;

public class Car {

	private String make;
	private int year = 1900;
	private int mileage= 0;
	private int carCost = 0;
	
	// construct a default car
	
		public Car() {
			make = "GM";
			year = 1900;
			mileage= 0;
			carCost = 0;
		}
		
		
		// Car with specified info
		public Car(String make, int year, int mileage, int carCost ) {
			this.make = make;
			this.year = year;
			this.mileage = mileage;
			this.carCost = carCost;
		}
		
		public String getMake() {
			return make;
		}


		public void setMake(String make) {
			this.make = make;
		}


		public int getYear() {
			return year;
		}


		public void setYear(int year) {
			this.year = year;
		}


		public int getMileage() {
			return mileage;
		}


		public void setMileage(int mileage) {
			this.mileage = mileage;
		}


		public int getCarCost() {
			return carCost;
		}


		public void setCarCost(int carCost) {
			this.carCost = carCost;
		}
		
		// Print car info
		
		public String toString() {
			return "Your car info: " + make +" " + year ;
			
		}
	
}
