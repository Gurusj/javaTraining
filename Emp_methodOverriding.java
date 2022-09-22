
class Employee{

    int id;
    String name, address;
    String phone;

    public Employee(int i, String n, String a, String p){
        this.id = i;
        this.name = n;
        this.address = a;
        this.phone = p;
    }

    //Overriding without parameters
    public void displayPhone(){
        System.out.println("\nPhone: "+phone);
    }

    /*public void displayPhone(String phone){

        System.out.println("\nPhone: "+phone);
    }*/
}

class HR extends Employee{
    int salary;

    public HR(int i, String n, String a, String p, int sal) {
        super(i, n, a, p);
        this.salary = sal;
    }
    //Overriding without parameters
    public void displayPhone(){
        System.out.println("\nPhone: "+phone);
    }
}

class Emp_methodOverriding{

    public static void main(String args[]){

        Employee obj1 = new Employee(1,"Abhishek","Savanur", "9980890662");
        HR obj2 = new HR(1,"Abhishek","Savanur", "8660554576", 25000);
        
        obj1.displayPhone();
        //Without parameters 
        obj2.displayPhone();

        //with parameters 
        //obj2.displayPhone("8986438922");
    }
}

