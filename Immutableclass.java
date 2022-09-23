final class Employee{
     private final String name;
     public Employee(String name) {
        this.name = name;
     }
     public String getName() {
         return name;
     }
}
public class Immutableclass {
    public static void main(String args[]){
        Employee e1 = new Employee("Virat");
        System.out.println(e1.getName());
        e1.getName().concat("Kohli");
        System.out.println(e1.getName());
    }
}