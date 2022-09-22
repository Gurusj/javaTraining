class EMP{

	int id;  
	String name, address;
	String phone;

	public EMP(int i, String n, String a, String p){
		this.id = i;
		this.name = n;
		this.address = a;
		this.phone = p;
	}

	public void display(int i){
		System.out.println("Id:"+id+"\nphone:"+phone);
	}

	public void display(){
		System.out.println("\nName:"+name+"\nAddress:"+address);
	}
}


class Emp_displayDetails{

	public static void main(String args[]){

		EMP obj1 = new EMP(1,"Abhishek","Savanur", "8660554576");
	
		obj1.display(1);
		obj1.display();
	}
}
