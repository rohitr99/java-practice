import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class EmployeeService {
static Employee[] emprr;
static int cnt;
static int cnt2;
static Employee[]vendor;
static {
	emprr=new Employee[100];
	emprr[0]= new SalarisedEmp(10,"Rohit","rohit@5","jd","qww",LocalDate.of(1999,12,19),1000000,25452);
	emprr[1]= new SalarisedEmp(11,"Rahul","rahul@6","lk","ads",LocalDate.of(2000,12,19),2000000,45646);
	//vendor_employees
	vendor=new Employee[10];
	//vendor[0]=new Employee(5,"rahul","rahul@9","It","devops",LocalDate.of(2000,12,19));
	cnt2=1;
	
	emprr[2]=new Vendor(14,"Rajas","666","r345@gmail.com","admin",LocalDate.of(2002, 12,30),vendor);
	emprr[3]=new Vendor(15,"Ashwini","777","ashu@gmail.com","hr",LocalDate.of(2000, 12,30),vendor);
	cnt=4;
}
public static void addnewemployee(int ch) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the id");
	int id=sc.nextInt();
	System.out.println("enetr name");
	String nm=sc.nextLine();
	System.out.println("enetr mobile");
	String mob=sc.next();
	System.out.println("enetr email");
	String em=sc.next();
	System.out.println("enetr desg");
	String desg=sc.next();
	System.out.println("enetr dept");
	String dept=sc.next();
	System.out.println("eneter joining date(dd/mm/yyyy)");
	String dt=sc.next();
	LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	switch(ch) {
	case 1:
		//Salaried Employee
		System.out.println("enter salary");
		int sal=sc.nextInt();
		System.out.println("enter bonous");
		int b=sc.nextInt();
		emprr[cnt]=new SalarisedEmp(id, nm, mob, em, desg, ldt, sal, b);
	case 2:
		//Contract Employees
		System.out.println("Enter hrs");
		int hrs=sc.nextInt();
		System.out.println("Enter charges");
		double charges=sc.nextInt();
		emprr[cnt]=new ContractEmp(id,nm,mob,em,desg,ldt,hrs,charges);
	/*case 3:
		//vendor Employees
		System.out.println("Enter no of emplyees");
		int no=sc.nextInt();
		for(int i=cnt;i<no;i++);
       emprr[cnt]=new Vendor(id,nm,mob,em,desg,ldt);*/
		
	cnt++;
	}
	
	
}

public static void display()
{
	for(int i=0;i<cnt;i++)
	{
		System.out.println(emprr[i]);
	}
}






public static int SearchById(int id) {
	for(int i=0;i<cnt;i++) {
		if(emprr[i].getPid()==id) {
		 System.out.println(emprr[i]);
		 return i;
		}
	}return -1;
}

public static boolean SetSalary(int id) {
	int pos=SearchById(id);
	if(pos!=-1) {
		if(emprr[pos] instanceof SalarisedEmp) {
			((SalarisedEmp)emprr[pos]).setSal(2222);;
		}
		else if(emprr[pos] instanceof ContractEmp) {
			((ContractEmp)emprr[pos]).setCharges(11111);
		}
	else {
		
	}
		return true;
	}
	 return false;
	}


  public static double Calculatesal(int id) {
	int pos =SearchById(id);
	if(pos!=-1) {
		 return emprr[pos].CalculateSal();
		
	}
	
	return -1;
  }

}


