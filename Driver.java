package insuranceFirm;

public class Driver {
	private int licenceNo;
	private String name;
	private int noOfPoints;
	private String contactNo;
	
	public Driver(int licenceNo, String name, int noOfPoints, String contactNo) {
		this.licenceNo = licenceNo;
		this.name = name;
		this.noOfPoints = noOfPoints;
		this.contactNo = contactNo;
	}

	public int getLicenceNo() {
		return licenceNo;
	}

	public void setLicenceNo(int licenceNo) {
		this.licenceNo = licenceNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfPoints() {
		return noOfPoints;
	}

	public void setNoOfPoints(int noOfPoints) {
		this.noOfPoints = noOfPoints;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	@Override
	public String toString() {
		return "Driver [licenceNo=" + licenceNo + ", name=" + name + ", noOfPoints=" + noOfPoints + ", contactNo="
				+ contactNo + "]";
	}
	
	

}
