import java.time.LocalDate;

public class TestEmployee {

	public static void main(String[] args) {
		SalarisedEmp p=new SalarisedEmp(12,"abc","hshs@","HR","associate",LocalDate.of(2002, 05, 05),2000,1000);
		//Vendor b=new Vendor(12,"abc","hshs@","HR","associate",LocalDate.of(2002, 05, 05),2);
		System.out.println(p);
		//System.out.println(p);
		ContractEmp c =new ContractEmp(12,"abc","hshs@","HR","associate",LocalDate.of(2002, 05, 05),4,500);
		//System.out.println(c);
		String sh=c.getEmail();
		//System.out.println(sh);
		Employee e1=new SalarisedEmp();
		//System.out.println(((SalarisedEmp)p).getSal());
		//System.out.println(db)
		person P =new SalarisedEmp();
		//System.out.println(p);
		//SalarisedEmp s =(SalarisedEmp)p;
		//System.out.println(p);
		//Vendor v =new Vendor(12,"abc","hshs@","HR","associate",LocalDate.of(2002, 05, 05),4);
		//System.out.println(v);
		//person j=new Vendor();
		//System.out.println(((Vendor)v).getNo());
		//Vendor V=(Vendor)b;
	//	System.out.println(b);

	}
}