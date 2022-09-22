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

		if(type.equals("HR")){
			System.out.println("\nEMP ID: "+id+"\tEMP Type: "+type);
		}
		else if (type.equals("Infra")) {
			System.out.println("\nEMP ID: "+id+"\tEMP Type: "+type);	
		}
		else{
			System.out.println("\nEMP ID: "+id+"\tEMP Type: "+type);
		}
	}


	/*public void display(int i){
		System.out.println("Id:"+id+"\nphone:"+phone);
	}

	public void display(){
		System.out.println("\nName:"+name+"\nAddress:"+address);
	}*/
}


class Emp_controlStatements{

	public static void main(String args[]){

		EMP obj1 = new EMP(1,"Abhishek","Savanur", "HR", "8660554576");

		EMP obj2 = new EMP(2,"Guru","Savanur", "Infra", "8660554576");

		EMP obj3 = new EMP(3,"Suresh","Savanur", "Admin", "8660554576");

		obj1.testingDecisionMakingStatements();
		obj2.testingDecisionMakingStatements();
		obj3.testingDecisionMakingStatements();
	
		/*obj1.display(1);
		obj1.display();*/
	}
}
