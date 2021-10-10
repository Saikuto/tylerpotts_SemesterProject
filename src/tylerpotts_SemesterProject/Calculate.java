package tylerpotts_SemesterProject;

public class Calculate {
	
	protected double monthPayment;
	protected double coverage;
	protected double percentOff;
	protected double discount;
	
	// Variables I need to import
	private double year;
	private double mileage;
	private double carCost;
	private double creditscore;
	
	public Calculate(double year, double mileage, double carCost, double creditScore) {
		this.year = year;
		this.mileage = mileage;
		this.carCost = carCost;
		this.creditscore = creditScore;
	}

	public double calculateCoverage() {
		coverage = (((mileage + carCost)/year))*100;
		return coverage;
	}

	public double calculateMonthPayment() {
		monthPayment = coverage/12;
		return monthPayment;
	}

	public double calculateDiscount() {
		
		if (creditscore >= 720 && creditscore <= 850){
		discount = 0.25;
	}
		else if ( creditscore >= 690 && creditscore <= 719) {
			discount = 0.15;	
		}
		else if ( creditscore >= 630 && creditscore <= 689 ) {
			discount = 0.10;	
		}
		else {
			
		}
			return discount;
	}
	
	public double calculatePercentOff() {
		double percentOffPrice = coverage * discount;
		coverage = coverage - percentOffPrice;
		return coverage;
	}
		
		

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

    
	public double getPercentOff() {
		return percentOff;
	}

	public void setPercentOff(double percentOff) {
		this.percentOff = percentOff;
	}
	
	public double getMonthPayment() {
		return monthPayment;
	}

	public void setMonthPayment(double monthPayment) {
		this.monthPayment = monthPayment;
	}
	
	public double getYear() {
		return year;
	}

	public void setYear(double year) {
		this.year = year;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public double getCarCost() {
		return carCost;
	}

	public void setCarCost(double carCost) {
		this.carCost = carCost;
	}

	public double getCreditScore() {
		return creditscore;
	}

	public void setCreditScore(double creditScore) {
		this.creditscore = creditScore;
	}

	public double getCoverage() {
		return coverage;
	}

	public void setCoverage(double coverage) {
		this.coverage = coverage;
	}
    
	
	
}
