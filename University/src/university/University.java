
package university;
import java.util.Scanner;
public class University {
public static void main(String[] args) {
      test1 r=new test1("Faysal Sarder","Tanvir Ahmed","Ashiqe",181472515,181472598,181472619);    //Called test1 constructor.
       System.out.println("Name :"+r.Name);
        System.out.println("ID :"+r.ID);
         System.out.println("Name :"+r.NAME);
          System.out.println("ID :"+r.iD);  
           System.out.println("Name :"+r.name);
            System.out.println("ID :"+r.Id);
      // include student class...
      System.out.println("<>University Management System<>");
      System.out.println("Include.");
       int n;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter n :");
       n=sc.nextInt();
       Student t1[]=new Student[n];                                   //called Student class.
       t1[n-1]=new Student("Faysal",151,2,1.22,500,20000,500);          //called constructor.     
       t1[n-1].input();                                               //Accessing input method();
       t1[n-1].show();                                                 //Accessing show method();
       t1[n-1].setsemester();                                          
       t1[n-1].setgrade();                                            //Accessing setdrade method();
       t1[n-1].graderesult();                                         //Accessing graderesult method();
       t1[n-1].updateFeesTotal();                                     //Accessing updateFeesTotal method();
       
       //include Student class...
       Teacher temp=new Teacher();                                    //Teacher Class type object create..
        temp.method1();                                                //Accessing method1.
        temp.method2();                                                //Accessing method2.
        
        Scanner j=new Scanner(System.in);                              /*Showed numbers of teacher*/
       System.out.println("Enter N number :");
       int b=j.nextInt();
       int Array[]=new int[b];
        int sir=0;
       int madam=0;
       for(int i=0;i<Array.length;i++){
           Array[i]=j.nextInt();
           if(Array[i]%2==0){
             sir+=1;  
           }
           else{
               madam+=1;
           }
           
       }
       System.out.println("Total Teacher's  :"+b);
       System.out.println("Total Sir :"+sir);
       System.out.println("Total Madam :"+madam);
       
       Staff obj=new Staff();
        obj.input();
        obj.display();
        obj.salaryshow();
        obj.agelimitation();
        obj.updatemoney();
    }
    }
    

