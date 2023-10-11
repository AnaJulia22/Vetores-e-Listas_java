package entities;

public class OutSourcedEmployee extends Employee{
	
	private double addiitionalCharge;
	
	public OutSourcedEmployee() {		
		super();
	}

	public OutSourcedEmployee(String name, Integer hours, Double valuePerHour, double addiitionalCharge) {
		super(name, hours, valuePerHour);
		this.addiitionalCharge = addiitionalCharge;
	}

	public double getAddiitionalCharge() {
		return addiitionalCharge;
	}

	public void setAddiitionalCharge(double addiitionalCharge) {
		this.addiitionalCharge = addiitionalCharge;
	}	
	
	@Override
	public double Payment() {
		return super.Payment() + addiitionalCharge * 1.1;
	}
	
}
