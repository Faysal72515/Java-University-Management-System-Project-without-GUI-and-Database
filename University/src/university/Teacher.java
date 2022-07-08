
package university;
import java.util.Scanner;
interface Person{
    public void method1();
}
interface Employee{
    public void method2();
}
public class Teacher implements Person,Employee {
    public void method1(){
        System.out.println("<>Include..<>");
        Scanner x=new Scanner(System.in);
        System.out.println("Enter Teacher Name :");
        String Name=x.next();
        System.out.println("Contact No :");
        int contact=x.nextInt();
        System.out.println("Email :");
        String email=x.next();
        System.out.println("<>Result show..<>");
        System.out.println("Teacher's Name :"+Name);
        System.out.println("Contact Number :"+contact);
        System.out.println("Email :"+email);
    }
    public void method2(){
        System.out.println("<>Include....<>");
        Scanner x1=new Scanner(System.in);
        System.out.println("Enter ID No :");
        int id=x1.nextInt();
        System.out.println("Enter Salary $:");
        int salary=x1.nextInt();
        System.out.println("<>Result show...<.>");
        System.out.println("ID No :"+id);
        System.out.println("Salary $:"+salary);
        if(salary<=18000){
            System.out.println("Position :Instructor");
        }
      else  if(salary<=35000){
        System.out.println("Position :Lecturer");
    }
    else if(salary<=45000){
      System.out.println("Position :Assistant Professor");  
    }
    else if(salary<=55000) {
        System.out.println("Position :Co-ordinator");
    }
    else if(salary<=60000){
       System.out.println("Position :Department Head");
    } 
    else if(salary>61000){
        System.out.println("Position :Registor");
    }
}
}