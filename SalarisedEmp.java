import java.time.LocalDate;

public class SalarisedEmp extends Employee{
private double sal;
private  double bonus;
public SalarisedEmp() {
	super();
}

public SalarisedEmp(int pid, String pname, String email, String dept, String desg, LocalDate doj, double sal,
		double bonus) {
	super(pid, pname, email, dept, desg, doj);
	this.sal = sal;
	this.bonus = bonus;
}

public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}
public double getBonus() {
	return bonus;
}
public void setBonus(double bonus) {
	this.bonus = bonus;
}
@Override
public String toString() {
	return super.toString()+"SalarisedEmp [sal=" + sal + ", bonus=" + bonus + "]";
}

@Override
public double CalculateSal() {
	// TODO Auto-generated method stub
	return sal+bonus;
}

}
