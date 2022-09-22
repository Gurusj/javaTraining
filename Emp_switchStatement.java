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

	public void testingDecisionMakingStatements(){

		switch(type){
			case "HR": System.out.println("Name: "+name+"\tType: "+type);
			break;
			case "Infra": System.out.println("Name: "+name+"\tType: "+type);
			break;
			default: System.out.println("Name: "+name+"\tType: "+type);
			break;

		}
	}

}


class Emp_switchStatement{

	public static void main(String args[]){

		EMP obj1 = new EMP(1,"Abhishek","Savanur", "HR", "8660554576");

		EMP obj2 = new EMP(2,"Guru","Savanur", "Infra", "8660554576");

		EMP obj3 = new EMP(3,"Suresh","Savanur", "Admin", "8660554576");

		obj1.testingDecisionMakingStatements();
		obj2.testingDecisionMakingStatements();
		obj3.testingDecisionMakingStatements();

	}
}
