import java.time.LocalDate;

public  class ContractEmp extends Employee {
	private int hrs;
	private double charges;
	public ContractEmp() {
		super();
	}
	public ContractEmp(int pid, String pname, String email,String dept, String desg, LocalDate doj,int hrs,double charges) {
		super(pid,pname,email,dept,desg,doj);
		this.hrs = hrs;
		this.charges = charges;
	}
	public int getHrs() {
		return hrs;
	}
	public double getCharges() {
		return charges;
	}
	@Override
	public String toString() {
		return super.toString()+"ContractEmp [hrs=" + hrs + ", charges=" + charges + "]";
	}
	public void setHrs(int hrs) {
		this.hrs = hrs;
	}
	public void setCharges(double charges) {
		this.charges = charges;
	}
	@Override
	public double CalculateSal() {
		// TODO Auto-generated method stub
		return charges;
	}
	
	
}
