import java.util.*;

class EMP{

	int id;  
	String name, address, type;
	String phone;

	public EMP(int i, String n, String a, String t, String p){
		this.id = i;
		this.name = n;
		this.address = a;
		this.type = t;
		this.phone = p;

	}

	public void displayEmpDetails(){

			System.out.println("EMP_ID: "+id+"\tName: "+name+"\tAddress: "+address+"\tType: "+type+"\tPhone: "+phone);
	
	}

}


class Emp_continueStatement{

	public static void main(String args[]){

		EMP e1 = new EMP(1,"Abhishek","Savanur", "HR", "8660554576");

		EMP e2 = new EMP(2,"Guru","MJ", "Infra", "76754395839");

		EMP e3 = new EMP(3,"Suresh","HS", "Admin", "897548395347");

		EMP e4 = new EMP(4,"Ajit","HM", "Infra", "57845843");
		EMP e5 = new EMP(5,"Rahul","KH", "SE", "76584354");
		EMP e6 = new EMP(6,"Rakesh","GH", "TE", "854354385");
		EMP e7 = new EMP(7,"Ravi","DF", "BDA", "578853473");
		EMP e8 = new EMP(8,"Vikas","SJ", "DS", "56437393");
		EMP e9 = new EMP(9,"Vijay","MM", "DA", "037983493438");
		EMP e10 = new EMP(10,"Varun","NM", "PM", "35674843498");


		ArrayList<EMP> empArr = new ArrayList<>();

		empArr.add(e1);
		empArr.add(e2);
		empArr.add(e3);
		empArr.add(e4);
		empArr.add(e5);
		empArr.add(e6);
		empArr.add(e7);
		empArr.add(e8);
		empArr.add(e9);
		empArr.add(e10);

		for (EMP employee: empArr){
			if(employee.id%2 != 0)
				continue;
			employee.displayEmpDetails();
		}

	}
}
