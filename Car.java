package insuranceFirm;

public class Car {

	private int registerationNo;
	private int yrManfacture;
	private String engineSize;
	private boolean passedNCT;
	
	public Car(int registerationNo, int yrManfacture, String engineSize, boolean passedNCT) {
		this.registerationNo = registerationNo;
		this.yrManfacture = yrManfacture;
		this.engineSize = engineSize;
		this.passedNCT = passedNCT;
	}

	public int getRegisterationNo() {
		return registerationNo;
	}

	public void setRegisterationNo(int registerationNo) {
		this.registerationNo = registerationNo;
	}

	public int getYrManfacture() {
		return yrManfacture;
	}

	public void setYrManfacture(int yrManfacture) {
		this.yrManfacture = yrManfacture;
	}

	public String getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(String engineSize) {
		this.engineSize = engineSize;
	}

	public boolean isPassedNCT() {
		return passedNCT;
	}

	public void setPassedNCT(boolean passedNCT) {
		this.passedNCT = passedNCT;
	}

	@Override
	public String toString() {
		return "Car [registerationNo=" + registerationNo + ", yrManfacture=" + yrManfacture + ", engineSize="
				+ engineSize + ", passedNCT=" + passedNCT + "]";
	}
	
	

}
