import java.util.*;
public class CustomerTest
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("USER ID:");
        String id=sc.nextLine();
        System.out.println("USER NAME:");
        String name=sc.nextLine();
        System.out.println("USER AGE:");
        String age=sc.nextLine();
        System.out.println("USER MOBILE NUMBER:");
        String mobile=sc.nextLine();
        System.out.println("USER EMAIL:");
        String email=sc.nextLine();
        System.out.println("USER GENDER:");
        String gender=sc.nextLine();
        System.out.println("USER PASSWORD:");
        String pwd=sc.nextLine();

        Customer c=new Customer();
        c.setId(id);
        c.setPassword(pwd);
        c.setName(name);
        c.setAge(age);
        c.setMobileNumber(mobile);
        c.setEmail(email);
        c.setGender(gender);


        System.out.println("-------------------");
        System.out.println(c.getId());
        System.out.println(c.getPassword());
        System.out.println(c.getName());
        System.out.println(c.getAge());
        System.out.println(c.getMobileNumber());
        System.out.println(c.getEmail());
        System.out.println(c.getGender());
    }
}
