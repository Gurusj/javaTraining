
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
    public void displayPhone(){
        System.out.println("ID: "+id+"\tPhone: "+phone);
    }
}

class HR extends Employee{
    int salary;
    public HR(int i, String n, String a, String p, int sal) {
        super(i, n, a, p);
        this.salary = sal;
    }
    public void displayPhone(){
        super.displayPhone();
        System.out.println("Name: "+name+"\tPhone: "+phone);
    }
}

class Emp_methodOverriding{
    public static void main(String args[]){
        HR obj2 = new HR(1,"Abhishek","Savanur", "8660554576", 25000); 
        obj2.displayPhone();
    }
}

