
package university;

import java.util.Scanner;
public class Staff {
      String Name;
    int id;
    int Age;
    int Salary;
    int Bonus;
    int Money;
    
    
    public void input(){
        System.out.println("<>Include....<>");
    Scanner S=new Scanner(System.in);
    System.out.println("Enter Staff Name :");
    Name=S.next();
    System.out.println("Enter Registration Number :");
    id=S.nextInt();
    System.out.println("Enter Salary $:");
    Salary=S.nextInt();
     System.out.println("Enter Age :");
        Age=S.nextInt();
        System.out.println("Enter Bonus :");
        Bonus=S.nextInt();
  
} 
    public void display(){
        System.out.println("<>Result Show<>");
        System.out.println("Name :"+Name);
         System.out.println("Registration Number :"+id);
          System.out.println("Salary $:"+Salary);
          System.out.println("Working Hour :7 hours");
          
    }
    public void salaryshow(){
        if(Salary<=6000){
            System.out.println("Position :Cleaner ");
        }
      else  if(Salary<=8000){
            System.out.println("Position :Concierge Or Gate Concierge");
        }
       else if (Salary <=10000){
        System.out.println("Position :Floor Guard");
    }
       else if(Salary<15000){
           System.out.println("Position :Receptionist");
       }
       else if(Salary<=16000){
           System.out.println("Night Guard");
       }
       else if(Salary>=17000){
           System.out.println("Position :Cashier");
       }
        
    }
   
    public void agelimitation(){
        if(Age<=28){
            System.out.println("3 Years Job Experienced");
        }
        else if (Age<=30){
            System.out.println("3.5 Years Job Experienced");
        }
        else if(Age<=32){
            System.out.println("4 Years Job Experienced");
        }
        
    }
    public void updatemoney(){
       Money=Salary+Bonus;
       System.out.println("Money Given By University $:"+Money);
        System.out.println("<>End of University Management System<>");
    }
    
}
