package insuranceFirm;

public class Policy {
	private Driver driver;
	private Car car;
	private int policyId;
	private double premium;
	private int noOfClaims;
	
	public Policy(Driver driver, Car car, int policyId, double premium, int noOfClaims) {
		if(driver.getNoOfPoints() > 12) 
			System.out.println("Driver must have less than 12 points");
		else
			this.driver = driver;
		
		this.car = car;
		this.policyId = policyId;
		this.premium = premium;
		this.noOfClaims = noOfClaims;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

	public double getPremium() {
		return premium;
	}

	public void setPremium(double premium) {
		this.premium = premium;
	}

	public int getNoOfClaims() {
		return noOfClaims;
	}

	public void setNoOfClaims(int noOfClaims) {
		this.noOfClaims = noOfClaims;
	}

	@Override
	public String toString() {
		return "\nPolicy\nDriver: " + driver.getLicenceNo() + "\nCar: " + car.getRegisterationNo() + "\nPolicy: " + policyId + "\nPremium: " + premium
				+ "\nNumber of Claims: " + noOfClaims;
	}
	
	
	

}
