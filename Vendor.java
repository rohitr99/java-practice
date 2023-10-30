import java.time.LocalDate;

public class Vendor extends Employee {
	private Employee[] arr;
	public Vendor() {
		super();
	}

	public Vendor(int pid, String pname, String email,String dept, String desg, LocalDate doj,Employee[]arr) {
		super(pid,pname,email,dept,desg,doj);
		this.arr= arr;
	}

	public Employee[] getEmplyoees() {
		return arr;
	}

	public void setNo(Employee[]arr) {
		this.arr = arr;
	}

	@Override
	public String toString() {
		return super.toString()+ "Vendor [no of employees=" + arr+ "]";
	}
	
}
