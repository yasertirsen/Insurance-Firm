package insuranceFirm;

import java.util.ArrayList;
import java.util.Scanner;

public class InsuranceFirm {
	private Scanner sc = new Scanner(System.in);
	private ArrayList<Driver> drivers = new ArrayList<Driver>();
	private ArrayList<Car> cars = new ArrayList<Car>();
	private ArrayList<Policy> policies = new ArrayList<Policy>();
	
	public InsuranceFirm() {
		createDriver();
		createCar();
		createPolicy();
		printPolicies();
		deletePolicy();
		increasePremium();
		totalClaims();
		totalPremiums();
		System.out.println("Policies after changes:");
		printPolicies();
	}
	
	public void createDriver() {
		Driver d1 = new Driver(1, "John Smith", 2, "0812345678");
		Driver d2 = new Driver(2, "Smith George", 0, "0856974136");
		
		drivers.add(d1);
		drivers.add(d2);
	}
	
	public void createCar() {
		Car c1 = new Car(1111, 2006, "5L", false);
		Car c2 = new Car(2222, 2012, "4.9L", true);
		
		cars.add(c1);
		cars.add(c2);
	}
	
	public void createPolicy() {
		Policy p1 = new Policy(drivers.get(0), cars.get(0), 1212, 563, 3);
		Policy p2 = new Policy(drivers.get(1), cars.get(1), 1313, 965, 2);
		
		policies.add(p1);
		policies.add(p2);
		
	}
	
	public void deletePolicy() {
		System.out.println("Please enter policy ID to be deleted:");
		int policy = sc.nextInt();
		for(int i=0; i<policies.size(); i++) {
			if(policies.get(i).getPolicyId() == policy) 
				policies.remove(i);
			else
				System.out.println("Policy doesn't exist");
		}
	}
	
	public void increasePremium() {
		double premium = 0;
		for(int i=0; i<policies.size(); i++) {
			premium = policies.get(i).getPremium();
			policies.get(i).setPremium(premium*1.05);
		}
		System.out.println("Policies successfully increased by 5%");
	}
	
	public void totalClaims() {
		int count = 0;
		for(int i=0; i<policies.size(); i++) {
			count += policies.get(i).getNoOfClaims();
		}
		System.out.println("Total claims: " + count);
	}
	
	public void totalPremiums() {
		double count = 0;
		for(int i=0; i<policies.size(); i++) {
			count += policies.get(i).getPremium();
		}
		System.out.println("Total premiums: " + count);
	}
	
	public void printPolicies() {
		for(int i=0; i<policies.size(); i++) {
			System.out.println(policies.get(i).toString());
		}
	}
	
	public static void main(String[] args) {
		new InsuranceFirm();

	}

}
