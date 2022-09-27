import java.util.*;
import java.lang.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regularexpression
{
    
    public static void main(String[] args)
    {
        System.out.println("Choose any option:\n");
        System.out.println("1. For Email Validation");
        System.out.println("2. For Employee ID Validation");
        System.out.println("3. For Phone Number Validation");
        System.out.println("4. For Address Validation");
        System.out.println("5. For Exit");

        Scanner sc =new Scanner(System.in);
        int choice=sc.nextInt();

        switch (choice)
        {
            case 1:
                System.out.println("Enter email id for validation:\n");
                String Emp_email = sc.next();
                String regex = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"+"[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
                boolean validation = Emp_email.matches(regex);
                if(validation){
                    System.out.println("Entered email id is valid");
                }
                else {
                    System.out.println("Entered email id is not valid");
                }
                break;
            case 2:
                System.out.println ("Enter employee id for validation:");
                String Emp_id = sc.next();
                String reg2 = "^[AMT]+[0-9]+$";
                boolean res1 = Emp_id.matches(reg2);
                if(res1){
                    System.out.println("Entered employee id is valid");
                }
                else {
                    System.out.println("Entered employee id is not valid");
                }
                break;
            case 3:
                System.out.println("Enter employee phone number for validation:");
                String Emp_Phone = sc.next();
                String reg3 = "^(\\+\\d{1,3}( )?)?((\\(\\d{1,3}\\))|\\d{1,3})[- .]?\\d{3,4}[- .]?\\d{4}$";
                boolean res2 = Emp_Phone.matches(reg3);
                if(res2){
                    System.out.println("Entered employee phone number is valid");
                }
                else {
                    System.out.println("Entered employee phone number is not valid");
                }
                break;
            case 4:
                System.out.println("Enter employee address for validation:");
                String Emp_add = sc.next();
                String reg4 = "^[a-zA-Z0-9\\s\\,\\''\\-]*$";
                boolean res3 = Emp_add.matches(reg4);
                if(res3){
                    System.out.println("Entered employee address is valid");
                }
                else {
                    System.out.println("Entered employee address is not valid");
                }
                break;
            case 5:
                break; 
        }
    }
}